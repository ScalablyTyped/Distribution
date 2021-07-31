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
  
  @scala.inline
  def apply(activeDuration: Double, endTime: Double): ComputedTimingProperties = {
    val __obj = js.Dynamic.literal(activeDuration = activeDuration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], currentIteration = null, localTime = null, progress = null)
    __obj.asInstanceOf[ComputedTimingProperties]
  }
  
  @scala.inline
  implicit class ComputedTimingPropertiesMutableBuilder[Self <: ComputedTimingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveDuration(value: Double): Self = StObject.set(x, "activeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIteration(value: Double): Self = StObject.set(x, "currentIteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIterationNull: Self = StObject.set(x, "currentIteration", null)
    
    @scala.inline
    def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTime(value: Double): Self = StObject.set(x, "localTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalTimeNull: Self = StObject.set(x, "localTime", null)
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressNull: Self = StObject.set(x, "progress", null)
  }
}
