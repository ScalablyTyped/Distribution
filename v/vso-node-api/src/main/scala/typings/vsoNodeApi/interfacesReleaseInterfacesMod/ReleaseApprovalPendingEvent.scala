package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseApprovalPendingEvent extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ReleaseApprovalPendingEvent] (val x: Self) extends AnyVal {
    
    inline def setApproval(value: ReleaseApproval): Self = StObject.set(x, "approval", value.asInstanceOf[js.Any])
    
    inline def setApprovalOptions(value: ApprovalOptions): Self = StObject.set(x, "approvalOptions", value.asInstanceOf[js.Any])
    
    inline def setCompletedApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "completedApprovals", value.asInstanceOf[js.Any])
    
    inline def setCompletedApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "completedApprovals", js.Array(value*))
    
    inline def setDefinitionName(value: String): Self = StObject.set(x, "definitionName", value.asInstanceOf[js.Any])
    
    inline def setDeployment(value: Deployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: js.Array[ReleaseEnvironment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: ReleaseEnvironment*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setIsMultipleRankApproval(value: Boolean): Self = StObject.set(x, "isMultipleRankApproval", value.asInstanceOf[js.Any])
    
    inline def setPendingApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "pendingApprovals", value.asInstanceOf[js.Any])
    
    inline def setPendingApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "pendingApprovals", js.Array(value*))
    
    inline def setReleaseCreator(value: String): Self = StObject.set(x, "releaseCreator", value.asInstanceOf[js.Any])
    
    inline def setReleaseName(value: String): Self = StObject.set(x, "releaseName", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWebAccessUri(value: String): Self = StObject.set(x, "webAccessUri", value.asInstanceOf[js.Any])
  }
}
