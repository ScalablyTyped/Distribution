package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an element in the `XRegExpMatchChainArray` that also specifies a specific back reference.
  */
@js.native
trait ChainArrayElement extends js.Object {
  /**
    * The specific backreference.
    */
  var backref: Double | String = js.native
  /**
    * The `RegExp` to use.
    */
  var regexp: RegExp = js.native
}

object ChainArrayElement {
  @scala.inline
  def apply(backref: Double | String, regexp: RegExp): ChainArrayElement = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainArrayElement]
  }
  @scala.inline
  implicit class ChainArrayElementOps[Self <: ChainArrayElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackref(value: Double | String): Self = this.set("backref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexp(value: RegExp): Self = this.set("regexp", value.asInstanceOf[js.Any])
  }
  
}

