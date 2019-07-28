package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(approval = approval, approvalOptions = approvalOptions, completedApprovals = completedApprovals, definitionName = definitionName, deployment = deployment, environmentId = environmentId, environmentName = environmentName, environments = environments, isMultipleRankApproval = isMultipleRankApproval, pendingApprovals = pendingApprovals, releaseCreator = releaseCreator, releaseName = releaseName, title = title, webAccessUri = webAccessUri)
  
    __obj.asInstanceOf[ReleaseApprovalPendingEvent]
  }
}

