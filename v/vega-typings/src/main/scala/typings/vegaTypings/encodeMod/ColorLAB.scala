package typings.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorLAB extends js.Object {
  var a: NumericValueRef = js.native
  var b: NumericValueRef = js.native
  var l: NumericValueRef = js.native
}

object ColorLAB {
  @scala.inline
  def apply(a: NumericValueRef, b: NumericValueRef, l: NumericValueRef): ColorLAB = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorLAB]
  }
  @scala.inline
  implicit class ColorLABOps[Self <: ColorLAB] (val x: Self) extends AnyVal {
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
    def setA(value: NumericValueRef): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setB(value: NumericValueRef): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setL(value: NumericValueRef): Self = this.set("l", value.asInstanceOf[js.Any])
  }
  
}

