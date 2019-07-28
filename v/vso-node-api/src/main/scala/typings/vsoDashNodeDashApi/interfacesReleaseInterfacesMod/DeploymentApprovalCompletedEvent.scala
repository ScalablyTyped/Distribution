package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentApprovalCompletedEvent extends js.Object {
  var approval: ReleaseApproval
  var project: ProjectReference
  var release: Release
}

object DeploymentApprovalCompletedEvent {
  @scala.inline
  def apply(approval: ReleaseApproval, project: ProjectReference, release: Release): DeploymentApprovalCompletedEvent = {
    val __obj = js.Dynamic.literal(approval = approval, project = project, release = release)
  
    __obj.asInstanceOf[DeploymentApprovalCompletedEvent]
  }
}

