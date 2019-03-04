package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleLogEvent extends RealtimeBuildEvent {
  var lines: js.Array[java.lang.String]
  var timelineId: java.lang.String
  var timelineRecordId: java.lang.String
}

object ConsoleLogEvent {
  @scala.inline
  def apply(
    buildId: scala.Double,
    lines: js.Array[java.lang.String],
    timelineId: java.lang.String,
    timelineRecordId: java.lang.String
  ): ConsoleLogEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId, lines = lines, timelineId = timelineId, timelineRecordId = timelineRecordId)
  
    __obj.asInstanceOf[ConsoleLogEvent]
  }
}

