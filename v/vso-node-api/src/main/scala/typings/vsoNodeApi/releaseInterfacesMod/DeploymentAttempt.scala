package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentAttempt extends StObject {
  
  var attempt: Double = js.native
  
  var deploymentId: Double = js.native
  
  /**
    * Error log to show any unexpected error that occurred during executing deploy step
    */
  var errorLog: String = js.native
  
  /**
    * Specifies whether deployment has started or not
    */
  var hasStarted: Boolean = js.native
  
  var id: Double = js.native
  
  /**
    * All the issues related to the deployment
    */
  var issues: js.Array[Issue] = js.native
  
  var job: ReleaseTask = js.native
  
  var lastModifiedBy: IdentityRef = js.native
  
  var lastModifiedOn: Date = js.native
  
  var operationStatus: DeploymentOperationStatus = js.native
  
  var postDeploymentGates: ReleaseGates = js.native
  
  var preDeploymentGates: ReleaseGates = js.native
  
  var queuedOn: Date = js.native
  
  var reason: DeploymentReason = js.native
  
  var releaseDeployPhases: js.Array[ReleaseDeployPhase] = js.native
  
  var requestedBy: IdentityRef = js.native
  
  var requestedFor: IdentityRef = js.native
  
  var runPlanId: String = js.native
  
  var status: DeploymentStatus = js.native
  
  var tasks: js.Array[ReleaseTask] = js.native
}
object DeploymentAttempt {
  
  @scala.inline
  def apply(
    attempt: Double,
    deploymentId: Double,
    errorLog: String,
    hasStarted: Boolean,
    id: Double,
    issues: js.Array[Issue],
    job: ReleaseTask,
    lastModifiedBy: IdentityRef,
    lastModifiedOn: Date,
    operationStatus: DeploymentOperationStatus,
    postDeploymentGates: ReleaseGates,
    preDeploymentGates: ReleaseGates,
    queuedOn: Date,
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
  
  @scala.inline
  implicit class DeploymentAttemptMutableBuilder[Self <: DeploymentAttempt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempt(value: Double): Self = StObject.set(x, "attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentId(value: Double): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorLog(value: String): Self = StObject.set(x, "errorLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasStarted(value: Boolean): Self = StObject.set(x, "hasStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = StObject.set(x, "issues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = StObject.set(x, "issues", js.Array(value :_*))
    
    @scala.inline
    def setJob(value: ReleaseTask): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedBy(value: IdentityRef): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedOn(value: Date): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationStatus(value: DeploymentOperationStatus): Self = StObject.set(x, "operationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDeploymentGates(value: ReleaseGates): Self = StObject.set(x, "postDeploymentGates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreDeploymentGates(value: ReleaseGates): Self = StObject.set(x, "preDeploymentGates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedOn(value: Date): Self = StObject.set(x, "queuedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: DeploymentReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDeployPhases(value: js.Array[ReleaseDeployPhase]): Self = StObject.set(x, "releaseDeployPhases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDeployPhasesVarargs(value: ReleaseDeployPhase*): Self = StObject.set(x, "releaseDeployPhases", js.Array(value :_*))
    
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = StObject.set(x, "requestedFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunPlanId(value: String): Self = StObject.set(x, "runPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasks(value: js.Array[ReleaseTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: ReleaseTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
