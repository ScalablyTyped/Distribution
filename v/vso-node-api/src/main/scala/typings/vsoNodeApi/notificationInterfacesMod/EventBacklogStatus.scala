package typings.vsoNodeApi.notificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBacklogStatus extends StObject {
  
  var maxUnprocessedEventAgeMs: Double = js.native
  
  var publisher: String = js.native
  
  var timeSinceLastProcessedEventMs: Double = js.native
  
  var unprocessedEvents: Double = js.native
}
object EventBacklogStatus {
  
  @scala.inline
  def apply(
    maxUnprocessedEventAgeMs: Double,
    publisher: String,
    timeSinceLastProcessedEventMs: Double,
    unprocessedEvents: Double
  ): EventBacklogStatus = {
    val __obj = js.Dynamic.literal(maxUnprocessedEventAgeMs = maxUnprocessedEventAgeMs.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timeSinceLastProcessedEventMs = timeSinceLastProcessedEventMs.asInstanceOf[js.Any], unprocessedEvents = unprocessedEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBacklogStatus]
  }
  
  @scala.inline
  implicit class EventBacklogStatusMutableBuilder[Self <: EventBacklogStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxUnprocessedEventAgeMs(value: Double): Self = StObject.set(x, "maxUnprocessedEventAgeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSinceLastProcessedEventMs(value: Double): Self = StObject.set(x, "timeSinceLastProcessedEventMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedEvents(value: Double): Self = StObject.set(x, "unprocessedEvents", value.asInstanceOf[js.Any])
  }
}
