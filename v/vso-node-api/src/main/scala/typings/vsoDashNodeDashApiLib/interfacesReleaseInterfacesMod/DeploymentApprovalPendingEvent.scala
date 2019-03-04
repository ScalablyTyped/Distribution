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
    val __obj = js.Dynamic.literal(approval = approval, approvalOptions = approvalOptions, completedApprovals = completedApprovals, data = data, deployment = deployment, isMultipleRankApproval = isMultipleRankApproval, pendingApprovals = pendingApprovals, project = project, release = release)
  
    __obj.asInstanceOf[DeploymentApprovalPendingEvent]
  }
}

