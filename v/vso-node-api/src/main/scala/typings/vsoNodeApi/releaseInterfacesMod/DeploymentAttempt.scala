package typings.vsoNodeApi.releaseInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentAttempt extends js.Object {
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
  var lastModifiedOn: Date
  var operationStatus: DeploymentOperationStatus
  var postDeploymentGates: ReleaseGates
  var preDeploymentGates: ReleaseGates
  var queuedOn: Date
  var reason: DeploymentReason
  var releaseDeployPhases: js.Array[ReleaseDeployPhase]
  var requestedBy: IdentityRef
  var requestedFor: IdentityRef
  var runPlanId: String
  var status: DeploymentStatus
  var tasks: js.Array[ReleaseTask]
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
}

