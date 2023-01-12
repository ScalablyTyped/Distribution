package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gracenotewidth extends StObject {
  
  var code: String
  
  var gracenote_width: Double
  
  var shift_down: Double
  
  var shift_right: Double
  
  var width: Double
}
object Gracenotewidth {
  
  inline def apply(code: String, gracenote_width: Double, shift_down: Double, shift_right: Double, width: Double): Gracenotewidth = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gracenote_width = gracenote_width.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gracenotewidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gracenotewidth] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setGracenote_width(value: Double): Self = StObject.set(x, "gracenote_width", value.asInstanceOf[js.Any])
    
    inline def setShift_down(value: Double): Self = StObject.set(x, "shift_down", value.asInstanceOf[js.Any])
    
    inline def setShift_right(value: Double): Self = StObject.set(x, "shift_right", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
