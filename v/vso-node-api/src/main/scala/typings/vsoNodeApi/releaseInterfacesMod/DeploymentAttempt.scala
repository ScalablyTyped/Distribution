package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentAttempt extends StObject {
  
  var attempt: Double
  
  var deploymentId: Double
  
  /**
    * Error log to show any unexpected error that occurred during executing deploy step
    */
  var errorLog: String
  
  /**
    * Specifies whether deployment has started or not
    */
  var hasStarted: Boolean
  
  var id: Double
  
  /**
    * All the issues related to the deployment
    */
  var issues: js.Array[Issue]
  
  var job: ReleaseTask
  
  var lastModifiedBy: IdentityRef
  
  var lastModifiedOn: js.Date
  
  var operationStatus: DeploymentOperationStatus
  
  var postDeploymentGates: ReleaseGates
  
  var preDeploymentGates: ReleaseGates
  
  var queuedOn: js.Date
  
  var reason: DeploymentReason
  
  var releaseDeployPhases: js.Array[ReleaseDeployPhase]
  
  var requestedBy: IdentityRef
  
  var requestedFor: IdentityRef
  
  var runPlanId: String
  
  var status: DeploymentStatus
  
  var tasks: js.Array[ReleaseTask]
}
object DeploymentAttempt {
  
  inline def apply(
    attempt: Double,
    deploymentId: Double,
    errorLog: String,
    hasStarted: Boolean,
    id: Double,
    issues: js.Array[Issue],
    job: ReleaseTask,
    lastModifiedBy: IdentityRef,
    lastModifiedOn: js.Date,
    operationStatus: DeploymentOperationStatus,
    postDeploymentGates: ReleaseGates,
    preDeploymentGates: ReleaseGates,
    queuedOn: js.Date,
    reason: DeploymentReason,
    releaseDeployPhases: js.Array[ReleaseDeployPhase],
    requestedBy: IdentityRef,
    requestedFor: IdentityRef,
    runPlanId: String,
    status: DeploymentStatus,
    tasks: js.Array[ReleaseTask]
  ): DeploymentAttempt = {
    val __obj = js.Dynamic.literal(attempt = attempt.asInstanceOf[js.Any], deploymentId = deploymentId.asInstanceOf[js.Any], errorLog = errorLog.asInstanceOf[js.Any], hasStarted = hasStarted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], operationStatus = operationStatus.asInstanceOf[js.Any], postDeploymentGates = postDeploymentGates.asInstanceOf[js.Any], preDeploymentGates = preDeploymentGates.asInstanceOf[js.Any], queuedOn = queuedOn.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], releaseDeployPhases = releaseDeployPhases.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], runPlanId = runPlanId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentAttempt]
  }
  
  extension [Self <: DeploymentAttempt](x: Self) {
    
    inline def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    inline def setDeploymentId(value: Double): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setErrorLog(value: String): Self = StObject.set(x, "errorLog", value.asInstanceOf[js.Any])
    
    inline def setHasStarted(value: Boolean): Self = StObject.set(x, "hasStarted", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    inline def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value*))
    
    inline def setJob(value: ReleaseTask): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: IdentityRef): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setOperationStatus(value: DeploymentOperationStatus): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
    
    inline def setPostDeploymentGates(value: ReleaseGates): Self = StObject.set(x, "postDeploymentGates", value.asInstanceOf[js.Any])
    
    inline def setPreDeploymentGates(value: ReleaseGates): Self = StObject.set(x, "preDeploymentGates", value.asInstanceOf[js.Any])
    
    inline def setQueuedOn(value: js.Date): Self = StObject.set(x, "queuedOn", value.asInstanceOf[js.Any])
    
    inline def setReason(value: DeploymentReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReleaseDeployPhases(value: js.Array[ReleaseDeployPhase]): Self = StObject.set(x, "releaseDeployPhases", value.asInstanceOf[js.Any])
    
    inline def setReleaseDeployPhasesVarargs(value: ReleaseDeployPhase*): Self = StObject.set(x, "releaseDeployPhases", js.Array(value*))
    
    inline def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    inline def setRequestedFor(value: IdentityRef): Self = StObject.set(x, "requestedFor", value.asInstanceOf[js.Any])
    
    inline def setRunPlanId(value: String): Self = StObject.set(x, "runPlanId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: js.Array[ReleaseTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: ReleaseTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
