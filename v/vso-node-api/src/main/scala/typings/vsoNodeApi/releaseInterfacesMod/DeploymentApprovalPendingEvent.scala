package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentApprovalPendingEvent extends js.Object {
  
  var approval: ReleaseApproval = js.native
  
  var approvalOptions: ApprovalOptions = js.native
  
  var completedApprovals: js.Array[ReleaseApproval] = js.native
  
  var data: StringDictionary[js.Any] = js.native
  
  var deployment: Deployment = js.native
  
  var isMultipleRankApproval: Boolean = js.native
  
  var pendingApprovals: js.Array[ReleaseApproval] = js.native
  
  var project: ProjectReference = js.native
  
  var release: Release = js.native
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
  
  @scala.inline
  implicit class DeploymentApprovalPendingEventOps[Self <: DeploymentApprovalPendingEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployment(value: Deployment): Self = this.set("deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultipleRankApproval(value: Boolean): Self = this.set("isMultipleRankApproval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingApprovalsVarargs(value: ReleaseApproval*): Self = this.set("pendingApprovals", js.Array(value :_*))
    
    @scala.inline
    def setPendingApprovals(value: js.Array[ReleaseApproval]): Self = this.set("pendingApprovals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease(value: Release): Self = this.set("release", value.asInstanceOf[js.Any])
  }
}
