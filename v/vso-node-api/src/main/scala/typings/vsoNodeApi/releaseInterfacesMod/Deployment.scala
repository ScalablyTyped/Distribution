package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deployment extends StObject {
  
  /**
    * Gets links to access the deployment.
    */
  var _links: js.Any
  
  /**
    * Gets attempt number.
    */
  var attempt: Double
  
  /**
    * Gets the date on which deployment is complete.
    */
  var completedOn: Date
  
  /**
    * Gets the list of condition associated with deployment.
    */
  var conditions: js.Array[Condition]
  
  /**
    * Gets release definition environment id.
    */
  var definitionEnvironmentId: Double
  
  /**
    * Gets status of the deployment.
    */
  var deploymentStatus: DeploymentStatus
  
  /**
    * Gets the unique identifier for deployment.
    */
  var id: Double
  
  /**
    * Gets the identity who last modified the deployment.
    */
  var lastModifiedBy: IdentityRef
  
  /**
    * Gets the date on which deployment is last modified.
    */
  var lastModifiedOn: Date
  
  /**
    * Gets operation status of deployment.
    */
  var operationStatus: DeploymentOperationStatus
  
  /**
    * Gets list of PostDeployApprovals.
    */
  var postDeployApprovals: js.Array[ReleaseApproval]
  
  /**
    * Gets list of PreDeployApprovals.
    */
  var preDeployApprovals: js.Array[ReleaseApproval]
  
  /**
    * Gets the date on which deployment is queued.
    */
  var queuedOn: Date
  
  /**
    * Gets reason of deployment.
    */
  var reason: DeploymentReason
  
  /**
    * Gets the reference of release.
    */
  var release: ReleaseReference
  
  /**
    * Gets releaseDefinitionReference which specifies the reference of the release definition to which the deployment is associated.
    */
  var releaseDefinition: ReleaseDefinitionShallowReference
  
  /**
    * Gets releaseEnvironmentReference which specifies the reference of the release environment to which the deployment is associated.
    */
  var releaseEnvironment: ReleaseEnvironmentShallowReference
  
  /**
    * Gets the identity who requested.
    */
  var requestedBy: IdentityRef
  
  /**
    * Gets the identity for whom deployment is requested.
    */
  var requestedFor: IdentityRef
  
  /**
    * Gets the date on which deployment is scheduled.
    */
  var scheduledDeploymentTime: Date
  
  /**
    * Gets the date on which deployment is started.
    */
  var startedOn: Date
}
object Deployment {
  
  inline def apply(
    _links: js.Any,
    attempt: Double,
    completedOn: Date,
    conditions: js.Array[Condition],
    definitionEnvironmentId: Double,
    deploymentStatus: DeploymentStatus,
    id: Double,
    lastModifiedBy: IdentityRef,
    lastModifiedOn: Date,
    operationStatus: DeploymentOperationStatus,
    postDeployApprovals: js.Array[ReleaseApproval],
    preDeployApprovals: js.Array[ReleaseApproval],
    queuedOn: Date,
    reason: DeploymentReason,
    release: ReleaseReference,
    releaseDefinition: ReleaseDefinitionShallowReference,
    releaseEnvironment: ReleaseEnvironmentShallowReference,
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    scheduledDeploymentTime: Date,
    startedOn: Date
  ): Deployment = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], attempt = attempt.asInstanceOf[js.Any], completedOn = completedOn.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], deploymentStatus = deploymentStatus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], postDeployApprovals = postDeployApprovals.asInstanceOf[js.Any], preDeployApprovals = preDeployApprovals.asInstanceOf[js.Any], queuedOn = queuedOn.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], releaseDefinition = releaseDefinition.asInstanceOf[js.Any], releaseEnvironment = releaseEnvironment.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], scheduledDeploymentTime = scheduledDeploymentTime.asInstanceOf[js.Any], startedOn = startedOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
  
  extension [Self <: Deployment](x: Self) {
    
    inline def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    inline def setCompletedOn(value: Date): Self = StObject.set(x, "completedOn", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setDefinitionEnvironmentId(value: Double): Self = StObject.set(x, "definitionEnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatus(value: DeploymentStatus): Self = StObject.set(x, "deploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: IdentityRef): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOn(value: Date): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setOperationStatus(value: DeploymentOperationStatus): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
    
    inline def setPostDeployApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "postDeployApprovals", value.asInstanceOf[js.Any])
    
    inline def setPostDeployApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "postDeployApprovals", js.Array(value :_*))
    
    inline def setPreDeployApprovals(value: js.Array[ReleaseApproval]): Self = StObject.set(x, "preDeployApprovals", value.asInstanceOf[js.Any])
    
    inline def setPreDeployApprovalsVarargs(value: ReleaseApproval*): Self = StObject.set(x, "preDeployApprovals", js.Array(value :_*))
    
    inline def setQueuedOn(value: Date): Self = StObject.set(x, "queuedOn", value.asInstanceOf[js.Any])
    
    inline def setReason(value: DeploymentReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: ReleaseReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseDefinition(value: ReleaseDefinitionShallowReference): Self = StObject.set(x, "releaseDefinition", value.asInstanceOf[js.Any])
    
    inline def setReleaseEnvironment(value: ReleaseEnvironmentShallowReference): Self = StObject.set(x, "releaseEnvironment", value.asInstanceOf[js.Any])
    
    inline def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    inline def setRequestedFor(value: IdentityRef): Self = StObject.set(x, "requestedFor", value.asInstanceOf[js.Any])
    
    inline def setScheduledDeploymentTime(value: Date): Self = StObject.set(x, "scheduledDeploymentTime", value.asInstanceOf[js.Any])
    
    inline def setStartedOn(value: Date): Self = StObject.set(x, "startedOn", value.asInstanceOf[js.Any])
    
    inline def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
