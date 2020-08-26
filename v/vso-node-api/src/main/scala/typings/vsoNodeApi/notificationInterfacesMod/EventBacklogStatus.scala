package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventBacklogStatus extends js.Object {
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
  implicit class EventBacklogStatusOps[Self <: EventBacklogStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxUnprocessedEventAgeMs(value: Double): Self = this.set("maxUnprocessedEventAgeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeSinceLastProcessedEventMs(value: Double): Self = this.set("timeSinceLastProcessedEventMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnprocessedEvents(value: Double): Self = this.set("unprocessedEvents", value.asInstanceOf[js.Any])
  }
  
}

