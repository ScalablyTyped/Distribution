package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventBacklogStatus extends js.Object {
  var maxUnprocessedEventAgeMs: Double
  var publisher: String
  var timeSinceLastProcessedEventMs: Double
  var unprocessedEvents: Double
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
}

