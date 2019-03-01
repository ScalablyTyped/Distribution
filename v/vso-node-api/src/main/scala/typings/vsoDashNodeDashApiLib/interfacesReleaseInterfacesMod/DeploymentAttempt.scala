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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attempt")(attempt)
    __obj.updateDynamic("deploymentId")(deploymentId)
    __obj.updateDynamic("errorLog")(errorLog)
    __obj.updateDynamic("hasStarted")(hasStarted)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("issues")(issues)
    __obj.updateDynamic("job")(job)
    __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    __obj.updateDynamic("lastModifiedOn")(lastModifiedOn)
    __obj.updateDynamic("operationStatus")(operationStatus)
    __obj.updateDynamic("postDeploymentGates")(postDeploymentGates)
    __obj.updateDynamic("preDeploymentGates")(preDeploymentGates)
    __obj.updateDynamic("queuedOn")(queuedOn)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("releaseDeployPhases")(releaseDeployPhases)
    __obj.updateDynamic("requestedBy")(requestedBy)
    __obj.updateDynamic("requestedFor")(requestedFor)
    __obj.updateDynamic("runPlanId")(runPlanId)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("tasks")(tasks)
    __obj.asInstanceOf[DeploymentAttempt]
  }
}

