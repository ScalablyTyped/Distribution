package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval
  var approvalOptions: ApprovalOptions
  var completedApprovals: js.Array[ReleaseApproval]
  var definitionName: java.lang.String
  var deployment: Deployment
  var environmentId: scala.Double
  var environmentName: java.lang.String
  var environments: js.Array[ReleaseEnvironment]
  var isMultipleRankApproval: scala.Boolean
  var pendingApprovals: js.Array[ReleaseApproval]
  var releaseCreator: java.lang.String
  var releaseName: java.lang.String
  var title: java.lang.String
  var webAccessUri: java.lang.String
}

object ReleaseApprovalPendingEvent {
  @scala.inline
  def apply(
    approval: ReleaseApproval,
    approvalOptions: ApprovalOptions,
    completedApprovals: js.Array[ReleaseApproval],
    definitionName: java.lang.String,
    deployment: Deployment,
    environmentId: scala.Double,
    environmentName: java.lang.String,
    environments: js.Array[ReleaseEnvironment],
    isMultipleRankApproval: scala.Boolean,
    pendingApprovals: js.Array[ReleaseApproval],
    releaseCreator: java.lang.String,
    releaseName: java.lang.String,
    title: java.lang.String,
    webAccessUri: java.lang.String
  ): ReleaseApprovalPendingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approval")(approval)
    __obj.updateDynamic("approvalOptions")(approvalOptions)
    __obj.updateDynamic("completedApprovals")(completedApprovals)
    __obj.updateDynamic("definitionName")(definitionName)
    __obj.updateDynamic("deployment")(deployment)
    __obj.updateDynamic("environmentId")(environmentId)
    __obj.updateDynamic("environmentName")(environmentName)
    __obj.updateDynamic("environments")(environments)
    __obj.updateDynamic("isMultipleRankApproval")(isMultipleRankApproval)
    __obj.updateDynamic("pendingApprovals")(pendingApprovals)
    __obj.updateDynamic("releaseCreator")(releaseCreator)
    __obj.updateDynamic("releaseName")(releaseName)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("webAccessUri")(webAccessUri)
    __obj.asInstanceOf[ReleaseApprovalPendingEvent]
  }
}

