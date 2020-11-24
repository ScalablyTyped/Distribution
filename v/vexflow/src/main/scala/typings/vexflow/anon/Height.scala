package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Height extends js.Object {
  
  var height: Double = js.native
  
  var left_shift_ticks: Double = js.native
  
  var right_shift_ticks: Double = js.native
  
  var y_shift: Double = js.native
}
object Height {
  
  @scala.inline
  def apply(height: Double, left_shift_ticks: Double, right_shift_ticks: Double, y_shift: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left_shift_ticks = left_shift_ticks.asInstanceOf[js.Any], right_shift_ticks = right_shift_ticks.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_shift_ticks(value: Double): Self = this.set("left_shift_ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight_shift_ticks(value: Double): Self = this.set("right_shift_ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_shift(value: Double): Self = this.set("y_shift", value.asInstanceOf[js.Any])
  }
}
