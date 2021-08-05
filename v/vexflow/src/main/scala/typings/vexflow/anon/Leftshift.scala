package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Leftshift extends StObject {
  
  var left_shift: Double
  
  var right_shift: Double
  
  var text_line: Double
}
object Leftshift {
  
  inline def apply(left_shift: Double, right_shift: Double, text_line: Double): Leftshift = {
    val __obj = js.Dynamic.literal(left_shift = left_shift.asInstanceOf[js.Any], right_shift = right_shift.asInstanceOf[js.Any], text_line = text_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshift]
  }
  
  extension [Self <: Leftshift](x: Self) {
    
    inline def setLeft_shift(value: Double): Self = StObject.set(x, "left_shift", value.asInstanceOf[js.Any])
    
    inline def setRight_shift(value: Double): Self = StObject.set(x, "right_shift", value.asInstanceOf[js.Any])
    
    inline def setText_line(value: Double): Self = StObject.set(x, "text_line", value.asInstanceOf[js.Any])
  }
}
