package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval
  var approvalOptions: ApprovalOptions
  var completedApprovals: js.Array[ReleaseApproval]
  var data: StringDictionary[js.Any]
  var deployment: Deployment
  var isMultipleRankApproval: Boolean
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
    data: StringDictionary[js.Any],
    deployment: Deployment,
    isMultipleRankApproval: Boolean,
    pendingApprovals: js.Array[ReleaseApproval],
    project: ProjectReference,
    release: Release
  ): DeploymentApprovalPendingEvent = {
    val __obj = js.Dynamic.literal(approval = approval.asInstanceOf[js.Any], approvalOptions = approvalOptions.asInstanceOf[js.Any], completedApprovals = completedApprovals.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], isMultipleRankApproval = isMultipleRankApproval.asInstanceOf[js.Any], pendingApprovals = pendingApprovals.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentApprovalPendingEvent]
  }
}

