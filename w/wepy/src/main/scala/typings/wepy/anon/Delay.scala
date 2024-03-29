package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: Double
  
  var duration: Double
  
  var timingFunction: String
  
  var transformOrigin: String
}
object Delay {
  
  inline def apply(delay: Double, duration: Double, timingFunction: String, transformOrigin: String): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setTimingFunction(value: String): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
    
    inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
  }
}
