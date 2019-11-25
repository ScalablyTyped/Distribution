package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleLogEvent extends RealtimeBuildEvent {
  var lines: js.Array[String]
  var timelineId: String
  var timelineRecordId: String
}

object ConsoleLogEvent {
  @scala.inline
  def apply(buildId: Double, lines: js.Array[String], timelineId: String, timelineRecordId: String): ConsoleLogEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConsoleLogEvent]
  }
}

