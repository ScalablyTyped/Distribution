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

