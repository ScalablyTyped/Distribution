package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dots extends StObject {
  
  var dots: Double
  
  var duration: String
  
  var `type`: String
}
object Dots {
  
  inline def apply(dots: Double, duration: String, `type`: String): Dots = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dots]
  }
  
  extension [Self <: Dots](x: Self) {
    
    inline def setDots(value: Double): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
