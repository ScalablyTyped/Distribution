package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeReleaseEvent extends js.Object {
  var projectId: String = js.native
  var releaseId: Double = js.native
}

object RealtimeReleaseEvent {
  @scala.inline
  def apply(projectId: String, releaseId: Double): RealtimeReleaseEvent = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeReleaseEvent]
  }
  @scala.inline
  implicit class RealtimeReleaseEventOps[Self <: RealtimeReleaseEvent] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseId(value: Double): Self = this.set("releaseId", value.asInstanceOf[js.Any])
  }
  
}

