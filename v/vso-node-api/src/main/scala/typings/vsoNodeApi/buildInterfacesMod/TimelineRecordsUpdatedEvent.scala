package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimelineRecordsUpdatedEvent extends RealtimeBuildEvent {
  var timelineRecords: js.Array[TimelineRecord] = js.native
}

object TimelineRecordsUpdatedEvent {
  @scala.inline
  def apply(buildId: Double, timelineRecords: js.Array[TimelineRecord]): TimelineRecordsUpdatedEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], timelineRecords = timelineRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineRecordsUpdatedEvent]
  }
  @scala.inline
  implicit class TimelineRecordsUpdatedEventOps[Self <: TimelineRecordsUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setTimelineRecordsVarargs(value: TimelineRecord*): Self = this.set("timelineRecords", js.Array(value :_*))
    @scala.inline
    def setTimelineRecords(value: js.Array[TimelineRecord]): Self = this.set("timelineRecords", value.asInstanceOf[js.Any])
  }
  
}

