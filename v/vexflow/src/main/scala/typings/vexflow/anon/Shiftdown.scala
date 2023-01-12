package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shiftdown extends StObject {
  
  var code: String
  
  var shift_down: Double
  
  var shift_right: Double
  
  var shift_up: Double
  
  var width: Double
}
object Shiftdown {
  
  inline def apply(code: String, shift_down: Double, shift_right: Double, shift_up: Double, width: Double): Shiftdown = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], shift_up = shift_up.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shiftdown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shiftdown] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setShift_down(value: Double): Self = StObject.set(x, "shift_down", value.asInstanceOf[js.Any])
    
    inline def setShift_right(value: Double): Self = StObject.set(x, "shift_right", value.asInstanceOf[js.Any])
    
    inline def setShift_up(value: Double): Self = StObject.set(x, "shift_up", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
