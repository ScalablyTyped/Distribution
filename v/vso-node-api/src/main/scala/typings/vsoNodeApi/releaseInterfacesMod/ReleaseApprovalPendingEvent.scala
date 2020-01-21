package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval
  var approvalOptions: ApprovalOptions
  var completedApprovals: js.Array[ReleaseApproval]
  var definitionName: String
  var deployment: Deployment
  var environmentId: Double
  var environmentName: String
  var environments: js.Array[ReleaseEnvironment]
  var isMultipleRankApproval: Boolean
  var pendingApprovals: js.Array[ReleaseApproval]
  var releaseCreator: String
  var releaseName: String
  var title: String
  var webAccessUri: String
}

object ReleaseApprovalPendingEvent {
  @scala.inline
  def apply(
    approval: ReleaseApproval,
    approvalOptions: ApprovalOptions,
    completedApprovals: js.Array[ReleaseApproval],
    definitionName: String,
    deployment: Deployment,
    environmentId: Double,
    environmentName: String,
    environments: js.Array[ReleaseEnvironment],
    isMultipleRankApproval: Boolean,
    pendingApprovals: js.Array[ReleaseApproval],
    releaseCreator: String,
    releaseName: String,
    title: String,
    webAccessUri: String
  ): ReleaseApprovalPendingEvent = {
    val __obj = js.Dynamic.literal(approval = approval.asInstanceOf[js.Any], approvalOptions = approvalOptions.asInstanceOf[js.Any], completedApprovals = completedApprovals.asInstanceOf[js.Any], definitionName = definitionName.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], isMultipleRankApproval = isMultipleRankApproval.asInstanceOf[js.Any], pendingApprovals = pendingApprovals.asInstanceOf[js.Any], releaseCreator = releaseCreator.asInstanceOf[js.Any], releaseName = releaseName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], webAccessUri = webAccessUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseApprovalPendingEvent]
  }
}

