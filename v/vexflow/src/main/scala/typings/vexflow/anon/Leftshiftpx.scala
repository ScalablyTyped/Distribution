package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Leftshiftpx extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var left_shift_px: Double = js.native
  
  var right_shift_px: Double = js.native
  
  var y_shift: Double = js.native
}
object Leftshiftpx {
  
  @scala.inline
  def apply(left_shift_px: Double, right_shift_px: Double, y_shift: Double): Leftshiftpx = {
    val __obj = js.Dynamic.literal(left_shift_px = left_shift_px.asInstanceOf[js.Any], right_shift_px = right_shift_px.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshiftpx]
  }
  
  @scala.inline
  implicit class LeftshiftpxOps[Self <: Leftshiftpx] (val x: Self) extends AnyVal {
    
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
    def setLeft_shift_px(value: Double): Self = this.set("left_shift_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_shift_px(value: Double): Self = this.set("right_shift_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_shift(value: Double): Self = this.set("y_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
  }
}
