package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var dots: Double
  
  var duration: String
  
  var ticks: Double
  
  var `type`: String
}
object Duration {
  
  inline def apply(dots: Double, duration: String, ticks: Double, `type`: String): Duration = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDots(value: Double): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: Double): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
