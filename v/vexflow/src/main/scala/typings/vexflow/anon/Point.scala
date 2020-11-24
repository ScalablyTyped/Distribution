package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  var code: String = js.native
  
  var point: Double = js.native
  
  var x_shift: Double = js.native
  
  var y_shift: Double = js.native
}
object Point {
  
  @scala.inline
  def apply(code: String, point: Double, x_shift: Double, y_shift: Double): Point = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit class PointOps[Self <: Point] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Double): Self = this.set("point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_shift(value: Double): Self = this.set("x_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_shift(value: Double): Self = this.set("y_shift", value.asInstanceOf[js.Any])
  }
}
