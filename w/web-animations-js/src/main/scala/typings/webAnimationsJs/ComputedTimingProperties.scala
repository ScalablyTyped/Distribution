package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedTimingProperties extends StObject {
  
  var activeDuration: Double
  
  var currentIteration: Double | Null
  
  var endTime: Double
  
  var localTime: Double | Null
  
  var progress: Double | Null
}
object ComputedTimingProperties {
  
  inline def apply(activeDuration: Double, endTime: Double): ComputedTimingProperties = {
    val __obj = js.Dynamic.literal(activeDuration = activeDuration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], currentIteration = null, localTime = null, progress = null)
    __obj.asInstanceOf[ComputedTimingProperties]
  }
  
  extension [Self <: ComputedTimingProperties](x: Self) {
    
    inline def setActiveDuration(value: Double): Self = StObject.set(x, "activeDuration", value.asInstanceOf[js.Any])
    
    inline def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    inline def setCurrentIterationNull: Self = StObject.set(x, "currentIteration", null)
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setLocalTime(value: Double): Self = StObject.set(x, "localTime", value.asInstanceOf[js.Any])
    
    inline def setLocalTimeNull: Self = StObject.set(x, "localTime", null)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressNull: Self = StObject.set(x, "progress", null)
  }
}
