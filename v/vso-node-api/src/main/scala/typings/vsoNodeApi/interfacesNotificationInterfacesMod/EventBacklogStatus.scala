package typings.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBacklogStatus extends StObject {
  
  var maxUnprocessedEventAgeMs: Double
  
  var publisher: String
  
  var timeSinceLastProcessedEventMs: Double
  
  var unprocessedEvents: Double
}
object EventBacklogStatus {
  
  inline def apply(
    maxUnprocessedEventAgeMs: Double,
    publisher: String,
    timeSinceLastProcessedEventMs: Double,
    unprocessedEvents: Double
  ): EventBacklogStatus = {
    val __obj = js.Dynamic.literal(maxUnprocessedEventAgeMs = maxUnprocessedEventAgeMs.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timeSinceLastProcessedEventMs = timeSinceLastProcessedEventMs.asInstanceOf[js.Any], unprocessedEvents = unprocessedEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBacklogStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBacklogStatus] (val x: Self) extends AnyVal {
    
    inline def setMaxUnprocessedEventAgeMs(value: Double): Self = StObject.set(x, "maxUnprocessedEventAgeMs", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setTimeSinceLastProcessedEventMs(value: Double): Self = StObject.set(x, "timeSinceLastProcessedEventMs", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedEvents(value: Double): Self = StObject.set(x, "unprocessedEvents", value.asInstanceOf[js.Any])
  }
}
