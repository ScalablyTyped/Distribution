package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approval")(approval)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DeploymentApprovalCompletedEvent]
  }
}

