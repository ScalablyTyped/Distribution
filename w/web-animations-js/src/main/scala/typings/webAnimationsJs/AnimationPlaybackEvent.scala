package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlaybackEvent extends StObject {
  
  var bubbles: Boolean
  
  var cancelable: Boolean
  
  var currentTarget: Animation
  
  val currentTime: Double | Null
  
  var defaultPrevented: Boolean
  
  var eventPhase: Double
  
  var target: Animation
  
  var timeStamp: Double
  
  val timelineTime: Double | Null
  
  var `type`: String
}
object AnimationPlaybackEvent {
  
  inline def apply(
    bubbles: Boolean,
    cancelable: Boolean,
    currentTarget: Animation,
    defaultPrevented: Boolean,
    eventPhase: Double,
    target: Animation,
    timeStamp: Double,
    `type`: String
  ): AnimationPlaybackEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], currentTime = null, timelineTime = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlaybackEvent]
  }
  
  extension [Self <: AnimationPlaybackEvent](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: Animation): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Animation): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setTimelineTime(value: Double): Self = StObject.set(x, "timelineTime", value.asInstanceOf[js.Any])
    
    inline def setTimelineTimeNull: Self = StObject.set(x, "timelineTime", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
