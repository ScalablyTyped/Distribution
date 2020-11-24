package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shiftx extends js.Object {
  
  var shift_x: js.UndefOr[Double] = js.native
  
  var shift_y: js.UndefOr[Double] = js.native
}
object Shiftx {
  
  @scala.inline
  def apply(): Shiftx = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shiftx]
  }
  
  @scala.inline
  implicit class ShiftxOps[Self <: Shiftx] (val x: Self) extends AnyVal {
    
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
    def setShift_x(value: Double): Self = this.set("shift_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift_x: Self = this.set("shift_x", js.undefined)
    
    @scala.inline
    def setShift_y(value: Double): Self = this.set("shift_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift_y: Self = this.set("shift_y", js.undefined)
  }
}
