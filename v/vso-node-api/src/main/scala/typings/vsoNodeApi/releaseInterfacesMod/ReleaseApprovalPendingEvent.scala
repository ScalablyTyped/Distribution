package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseApprovalPendingEvent extends js.Object {
  var approval: ReleaseApproval = js.native
  var approvalOptions: ApprovalOptions = js.native
  var completedApprovals: js.Array[ReleaseApproval] = js.native
  var definitionName: String = js.native
  var deployment: Deployment = js.native
  var environmentId: Double = js.native
  var environmentName: String = js.native
  var environments: js.Array[ReleaseEnvironment] = js.native
  var isMultipleRankApproval: Boolean = js.native
  var pendingApprovals: js.Array[ReleaseApproval] = js.native
  var releaseCreator: String = js.native
  var releaseName: String = js.native
  var title: String = js.native
  var webAccessUri: String = js.native
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
  @scala.inline
  implicit class ReleaseApprovalPendingEventOps[Self <: ReleaseApprovalPendingEvent] (val x: Self) extends AnyVal {
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
    def setApprovalOptions(value: ApprovalOptions): Self = this.set("approvalOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompletedApprovalsVarargs(value: ReleaseApproval*): Self = this.set("completedApprovals", js.Array(value :_*))
    @scala.inline
    def setCompletedApprovals(value: js.Array[ReleaseApproval]): Self = this.set("completedApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinitionName(value: String): Self = this.set("definitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployment(value: Deployment): Self = this.set("deployment", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentId(value: Double): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentName(value: String): Self = this.set("environmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnvironmentsVarargs(value: ReleaseEnvironment*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: js.Array[ReleaseEnvironment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMultipleRankApproval(value: Boolean): Self = this.set("isMultipleRankApproval", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingApprovalsVarargs(value: ReleaseApproval*): Self = this.set("pendingApprovals", js.Array(value :_*))
    @scala.inline
    def setPendingApprovals(value: js.Array[ReleaseApproval]): Self = this.set("pendingApprovals", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseCreator(value: String): Self = this.set("releaseCreator", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseName(value: String): Self = this.set("releaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebAccessUri(value: String): Self = this.set("webAccessUri", value.asInstanceOf[js.Any])
  }
  
}

