package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentApprovalCompletedEvent extends js.Object {
  var approval: ReleaseApproval = js.native
  var project: ProjectReference = js.native
  var release: Release = js.native
}

object DeploymentApprovalCompletedEvent {
  @scala.inline
  def apply(approval: ReleaseApproval, project: ProjectReference, release: Release): DeploymentApprovalCompletedEvent = {
    val __obj = js.Dynamic.literal(approval = approval.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentApprovalCompletedEvent]
  }
  @scala.inline
  implicit class DeploymentApprovalCompletedEventOps[Self <: DeploymentApprovalCompletedEvent] (val x: Self) extends AnyVal {
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
    def setApproval(value: ReleaseApproval): Self = this.set("approval", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: ProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelease(value: Release): Self = this.set("release", value.asInstanceOf[js.Any])
  }
  
}

