package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
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
    val __obj = js.Dynamic.literal(attempt = attempt, deploymentId = deploymentId, errorLog = errorLog, hasStarted = hasStarted, id = id, issues = issues, job = job, lastModifiedBy = lastModifiedBy, lastModifiedOn = lastModifiedOn, operationStatus = operationStatus, postDeploymentGates = postDeploymentGates, preDeploymentGates = preDeploymentGates, queuedOn = queuedOn, reason = reason, releaseDeployPhases = releaseDeployPhases, requestedBy = requestedBy, requestedFor = requestedFor, runPlanId = runPlanId, status = status, tasks = tasks)
  
    __obj.asInstanceOf[DeploymentAttempt]
  }
}

