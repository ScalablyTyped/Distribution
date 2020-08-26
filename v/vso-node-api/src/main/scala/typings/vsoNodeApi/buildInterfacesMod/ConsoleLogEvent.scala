package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleLogEvent extends RealtimeBuildEvent {
  var lines: js.Array[String] = js.native
  var timelineId: String = js.native
  var timelineRecordId: String = js.native
}

object ConsoleLogEvent {
  @scala.inline
  def apply(buildId: Double, lines: js.Array[String], timelineId: String, timelineRecordId: String): ConsoleLogEvent = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], timelineId = timelineId.asInstanceOf[js.Any], timelineRecordId = timelineRecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleLogEvent]
  }
  @scala.inline
  implicit class ConsoleLogEventOps[Self <: ConsoleLogEvent] (val x: Self) extends AnyVal {
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
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimelineId(value: String): Self = this.set("timelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimelineRecordId(value: String): Self = this.set("timelineRecordId", value.asInstanceOf[js.Any])
  }
  
}

