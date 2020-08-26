package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseTaskLogUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: Double = js.native
  var lines: js.Array[String] = js.native
  var timelineRecordId: String = js.native
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
  @scala.inline
  implicit class ReleaseTaskLogUpdatedEventOps[Self <: ReleaseTaskLogUpdatedEvent] (val x: Self) extends AnyVal {
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
    def setEnvironmentId(value: Double): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinesVarargs(value: String*): Self = this.set("lines", js.Array(value :_*))
    @scala.inline
    def setLines(value: js.Array[String]): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimelineRecordId(value: String): Self = this.set("timelineRecordId", value.asInstanceOf[js.Any])
  }
  
}

