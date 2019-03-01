package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTaskLogUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: scala.Double
  var lines: js.Array[java.lang.String]
  var timelineRecordId: java.lang.String
}

object ReleaseTaskLogUpdatedEvent {
  @scala.inline
  def apply(
    environmentId: scala.Double,
    lines: js.Array[java.lang.String],
    projectId: java.lang.String,
    releaseId: scala.Double,
    timelineRecordId: java.lang.String
  ): ReleaseTaskLogUpdatedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environmentId")(environmentId)
    __obj.updateDynamic("lines")(lines)
    __obj.updateDynamic("projectId")(projectId)
    __obj.updateDynamic("releaseId")(releaseId)
    __obj.updateDynamic("timelineRecordId")(timelineRecordId)
    __obj.asInstanceOf[ReleaseTaskLogUpdatedEvent]
  }
}

