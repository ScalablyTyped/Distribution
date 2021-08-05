package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: Double
  
  var left_shift_ticks: Double
  
  var right_shift_ticks: Double
  
  var y_shift: Double
}
object Height {
  
  inline def apply(height: Double, left_shift_ticks: Double, right_shift_ticks: Double, y_shift: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left_shift_ticks = left_shift_ticks.asInstanceOf[js.Any], right_shift_ticks = right_shift_ticks.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft_shift_ticks(value: Double): Self = StObject.set(x, "left_shift_ticks", value.asInstanceOf[js.Any])
    
    inline def setRight_shift_ticks(value: Double): Self = StObject.set(x, "right_shift_ticks", value.asInstanceOf[js.Any])
    
    inline def setY_shift(value: Double): Self = StObject.set(x, "y_shift", value.asInstanceOf[js.Any])
  }
}
