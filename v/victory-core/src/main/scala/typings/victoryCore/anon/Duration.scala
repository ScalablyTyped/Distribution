package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var delay: Double
  
  var duration: Double
  
  var easing: String
}
object Duration {
  
  inline def apply(delay: Double, duration: Double, easing: String): Duration = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
  }
}
