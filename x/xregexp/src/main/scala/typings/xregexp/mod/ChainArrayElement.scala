package typings.xregexp.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is an element in the `XRegExpMatchChainArray` that also specifies a specific back reference.
  */
trait ChainArrayElement extends js.Object {
  /**
    * The specific backreference.
    */
  var backref: Double | String
  /**
    * The `RegExp` to use.
    */
  var regexp: RegExp
}

object ChainArrayElement {
  @scala.inline
  def apply(backref: Double | String, regexp: RegExp): ChainArrayElement = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChainArrayElement]
  }
}

