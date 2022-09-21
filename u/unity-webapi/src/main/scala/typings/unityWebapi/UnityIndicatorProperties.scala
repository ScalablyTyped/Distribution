package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnityIndicatorProperties extends StObject {
  
  var count: Double
  
  var iconURI: String
  
  var onIndicatorActivated: js.Function
  
  var time: js.Date
}
object UnityIndicatorProperties {
  
  inline def apply(count: Double, iconURI: String, onIndicatorActivated: js.Function, time: js.Date): UnityIndicatorProperties = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], iconURI = iconURI.asInstanceOf[js.Any], onIndicatorActivated = onIndicatorActivated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnityIndicatorProperties]
  }
  
  extension [Self <: UnityIndicatorProperties](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setIconURI(value: String): Self = StObject.set(x, "iconURI", value.asInstanceOf[js.Any])
    
    inline def setOnIndicatorActivated(value: js.Function): Self = StObject.set(x, "onIndicatorActivated", value.asInstanceOf[js.Any])
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
