package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Betweenlines extends StObject {
  
  var between_lines: Boolean
  
  var code: String
  
  var shift_down: Double
  
  var shift_right: Double
  
  var shift_up: Double
  
  var width: Double
}
object Betweenlines {
  
  inline def apply(
    between_lines: Boolean,
    code: String,
    shift_down: Double,
    shift_right: Double,
    shift_up: Double,
    width: Double
  ): Betweenlines = {
    val __obj = js.Dynamic.literal(between_lines = between_lines.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], shift_up = shift_up.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Betweenlines]
  }
  
  extension [Self <: Betweenlines](x: Self) {
    
    inline def setBetween_lines(value: Boolean): Self = StObject.set(x, "between_lines", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setShift_down(value: Double): Self = StObject.set(x, "shift_down", value.asInstanceOf[js.Any])
    
    inline def setShift_right(value: Double): Self = StObject.set(x, "shift_right", value.asInstanceOf[js.Any])
    
    inline def setShift_up(value: Double): Self = StObject.set(x, "shift_up", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
