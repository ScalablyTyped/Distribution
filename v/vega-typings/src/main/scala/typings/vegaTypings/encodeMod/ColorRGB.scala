package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRGB extends js.Object {
  var b: NumericValueRef = js.native
  var g: NumericValueRef = js.native
  var r: NumericValueRef = js.native
}

object ColorRGB {
  @scala.inline
  def apply(b: NumericValueRef, g: NumericValueRef, r: NumericValueRef): ColorRGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorRGB]
  }
  @scala.inline
  implicit class ColorRGBOps[Self <: ColorRGB] (val x: Self) extends AnyVal {
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
    def setB(value: NumericValueRef): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setG(value: NumericValueRef): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: NumericValueRef): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

