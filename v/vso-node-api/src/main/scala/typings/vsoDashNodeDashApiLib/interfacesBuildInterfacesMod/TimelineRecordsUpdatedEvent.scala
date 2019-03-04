package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineRecordsUpdatedEvent extends RealtimeBuildEvent {
  var timelineRecords: js.Array[TimelineRecord]
}

object TimelineRecordsUpdatedEvent {
  @scala.inline
  def apply(buildId: scala.Double, timelineRecords: js.Array[TimelineRecord]): TimelineRecordsUpdatedEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId, timelineRecords = timelineRecords)
  
    __obj.asInstanceOf[TimelineRecordsUpdatedEvent]
  }
}

