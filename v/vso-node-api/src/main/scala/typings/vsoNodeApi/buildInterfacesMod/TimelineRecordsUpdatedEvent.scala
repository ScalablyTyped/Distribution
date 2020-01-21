package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRecordsUpdatedEvent extends RealtimeBuildEvent {
  var timelineRecords: js.Array[TimelineRecord]
}

object TimelineRecordsUpdatedEvent {
  @scala.inline
  def apply(buildId: Double, timelineRecords: js.Array[TimelineRecord]): TimelineRecordsUpdatedEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], timelineRecords = timelineRecords.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimelineRecordsUpdatedEvent]
  }
}

