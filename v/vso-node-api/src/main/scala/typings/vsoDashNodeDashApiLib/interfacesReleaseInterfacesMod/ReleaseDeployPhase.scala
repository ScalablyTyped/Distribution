package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDeployPhase extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob]
  var errorLog: java.lang.String
  var id: scala.Double
  var manualInterventions: js.Array[ManualIntervention]
  var name: java.lang.String
  var phaseId: java.lang.String
  var phaseType: DeployPhaseTypes
  var rank: scala.Double
  var runPlanId: java.lang.String
  var status: DeployPhaseStatus
}

