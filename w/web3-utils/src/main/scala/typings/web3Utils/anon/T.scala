package typings.web3Utils.anon

import typings.bnJs.mod.^
import typings.web3Utils.mod._Mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait T extends _Mixed {
  var t: String = js.native
  var v: String | ^  | Double = js.native
}

object T {
  @scala.inline
  def apply(t: String, v: String | ^  | Double): T = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[T]
  }
  @scala.inline
  implicit class TOps[Self <: T] (val x: Self) extends AnyVal {
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
    def setT(value: String): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String | ^  | Double): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

