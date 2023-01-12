package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentApprovalPendingEvent extends StObject {
  
  var approval: ReleaseApproval
  
  var approvalOptions: ApprovalOptions
  
  var completedApprovals: js.Array[ReleaseApproval]
  
  var data: StringDictionary[Any]
  
  var deployment: Deployment
  
  var isMultipleRankApproval: Boolean
  
  var pendingApprovals: js.Array[ReleaseApproval]
  
  var project: ProjectReference
  
  var release: Release
}
object DeploymentApprovalPendingEvent {
  
  inline def apply(
    approval: ReleaseApproval,
    approvalOptions: ApprovalOptions,
    completedApprovals: js.Array[ReleaseApproval],
    data: StringDictionary[Any],
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
  implicit open class MutableBuilder[Self <: DeploymentApprovalPendingEvent] (val x: Self) extends AnyVal {
    
    inline def setApproval(value: ReleaseApproval): Self = StObject.set(x, "approval", value.asInstanceOf[js.Any])
    
    inline def setApprovalOptions(value: ApprovalOptions): Self = StObject.set(x, "approvalOptions", value.asInstanceOf[js.Any])
    
    inline def setCompletedApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "completedApprovals", value.asInstanceOf[js.Any])
    
    inline def setCompletedApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "completedApprovals", js.Array(value*))
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setIsMultipleRankApproval(value: Boolean): Self = StObject.set(x, "isMultipleRankApproval", value.asInstanceOf[js.Any])
    
    inline def setPendingApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "pendingApprovals", value.asInstanceOf[js.Any])
    
    inline def setPendingApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "pendingApprovals", js.Array(value*))
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: Release): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
