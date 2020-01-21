package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTaskLogUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: Double
  var lines: js.Array[String]
  var timelineRecordId: String
}

object ReleaseTaskLogUpdatedEvent {
  @scala.inline
  def apply(
    environmentId: Double,
    lines: js.Array[String],
    projectId: String,
    releaseId: Double,
    timelineRecordId: String
  ): ReleaseTaskLogUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseTaskLogUpdatedEvent]
  }
}

