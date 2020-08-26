package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorHCL extends js.Object {
  var c: NumericValueRef = js.native
  var h: NumericValueRef = js.native
  var l: NumericValueRef = js.native
}

object ColorHCL {
  @scala.inline
  def apply(c: NumericValueRef, h: NumericValueRef, l: NumericValueRef): ColorHCL = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHCL]
  }
  @scala.inline
  implicit class ColorHCLOps[Self <: ColorHCL] (val x: Self) extends AnyVal {
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
    def setC(value: NumericValueRef): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: NumericValueRef): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: NumericValueRef): Self = this.set("l", value.asInstanceOf[js.Any])
  }
  
}

