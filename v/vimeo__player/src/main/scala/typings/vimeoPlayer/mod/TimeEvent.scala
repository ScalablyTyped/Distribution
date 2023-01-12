package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeEvent extends StObject {
  
  var duration: Double
  
  var percent: Double
  
  var seconds: Double
}
object TimeEvent {
  
  inline def apply(duration: Double, percent: Double, seconds: Double): TimeEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeEvent] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
