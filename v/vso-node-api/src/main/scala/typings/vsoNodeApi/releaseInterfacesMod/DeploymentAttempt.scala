package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentAttempt extends js.Object {
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
  implicit class DeploymentAttemptOps[Self <: DeploymentAttempt] (val x: Self) extends AnyVal {
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
    def setAttempt(value: Double): Self = this.set("attempt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeploymentId(value: Double): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorLog(value: String): Self = this.set("errorLog", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasStarted(value: Boolean): Self = this.set("hasStarted", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = this.set("issues", js.Array(value :_*))
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setJob(value: ReleaseTask): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedBy(value: IdentityRef): Self = this.set("lastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedOn(value: Date): Self = this.set("lastModifiedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationStatus(value: DeploymentOperationStatus): Self = this.set("operationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostDeploymentGates(value: ReleaseGates): Self = this.set("postDeploymentGates", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreDeploymentGates(value: ReleaseGates): Self = this.set("preDeploymentGates", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueuedOn(value: Date): Self = this.set("queuedOn", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: DeploymentReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDeployPhasesVarargs(value: ReleaseDeployPhase*): Self = this.set("releaseDeployPhases", js.Array(value :_*))
    @scala.inline
    def setReleaseDeployPhases(value: js.Array[ReleaseDeployPhase]): Self = this.set("releaseDeployPhases", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedFor(value: IdentityRef): Self = this.set("requestedFor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunPlanId(value: String): Self = this.set("runPlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTasksVarargs(value: ReleaseTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[ReleaseTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
  
}

