package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval
  var approvalOptions: ApprovalOptions
  var completedApprovals: js.Array[ReleaseApproval]
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  var deployment: Deployment
  var isMultipleRankApproval: scala.Boolean
  var pendingApprovals: js.Array[ReleaseApproval]
  var project: ProjectReference
  var release: Release
}

object DeploymentApprovalPendingEvent {
  @scala.inline
  def apply(
    approval: ReleaseApproval,
    approvalOptions: ApprovalOptions,
    completedApprovals: js.Array[ReleaseApproval],
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    deployment: Deployment,
    isMultipleRankApproval: scala.Boolean,
    pendingApprovals: js.Array[ReleaseApproval],
    project: ProjectReference,
    release: Release
  ): DeploymentApprovalPendingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approval")(approval)
    __obj.updateDynamic("approvalOptions")(approvalOptions)
    __obj.updateDynamic("completedApprovals")(completedApprovals)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("deployment")(deployment)
    __obj.updateDynamic("isMultipleRankApproval")(isMultipleRankApproval)
    __obj.updateDynamic("pendingApprovals")(pendingApprovals)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DeploymentApprovalPendingEvent]
  }
}

