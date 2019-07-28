package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(environmentId = environmentId, lines = lines, projectId = projectId, releaseId = releaseId, timelineRecordId = timelineRecordId)
  
    __obj.asInstanceOf[ReleaseTaskLogUpdatedEvent]
  }
}

