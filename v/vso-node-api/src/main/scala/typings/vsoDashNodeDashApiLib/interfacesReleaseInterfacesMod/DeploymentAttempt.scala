package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentAttempt extends js.Object {
  var attempt: scala.Double
  var deploymentId: scala.Double
  /**
    * Error log to show any unexpected error that occurred during executing deploy step
    */
  var errorLog: java.lang.String
  /**
    * Specifies whether deployment has started or not
    */
  var hasStarted: scala.Boolean
  var id: scala.Double
  /**
    * All the issues related to the deployment
    */
  var issues: js.Array[Issue]
  var job: ReleaseTask
  var lastModifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var lastModifiedOn: stdLib.Date
  var operationStatus: DeploymentOperationStatus
  var postDeploymentGates: ReleaseGates
  var preDeploymentGates: ReleaseGates
  var queuedOn: stdLib.Date
  var reason: DeploymentReason
  var releaseDeployPhases: js.Array[ReleaseDeployPhase]
  var requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var runPlanId: java.lang.String
  var status: DeploymentStatus
  var tasks: js.Array[ReleaseTask]
}

object DeploymentAttempt {
  @scala.inline
  def apply(
    attempt: scala.Double,
    deploymentId: scala.Double,
    errorLog: java.lang.String,
    hasStarted: scala.Boolean,
    id: scala.Double,
    issues: js.Array[Issue],
    job: ReleaseTask,
    lastModifiedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastModifiedOn: stdLib.Date,
    operationStatus: DeploymentOperationStatus,
    postDeploymentGates: ReleaseGates,
    preDeploymentGates: ReleaseGates,
    queuedOn: stdLib.Date,
    reason: DeploymentReason,
    releaseDeployPhases: js.Array[ReleaseDeployPhase],
    requestedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    runPlanId: java.lang.String,
    status: DeploymentStatus,
    tasks: js.Array[ReleaseTask]
  ): DeploymentAttempt = {
    val __obj = js.Dynamic.literal(attempt = attempt, deploymentId = deploymentId, errorLog = errorLog, hasStarted = hasStarted, id = id, issues = issues, job = job, lastModifiedBy = lastModifiedBy, lastModifiedOn = lastModifiedOn, operationStatus = operationStatus, postDeploymentGates = postDeploymentGates, preDeploymentGates = preDeploymentGates, queuedOn = queuedOn, reason = reason, releaseDeployPhases = releaseDeployPhases, requestedBy = requestedBy, requestedFor = requestedFor, runPlanId = runPlanId, status = status, tasks = tasks)
  
    __obj.asInstanceOf[DeploymentAttempt]
  }
}

