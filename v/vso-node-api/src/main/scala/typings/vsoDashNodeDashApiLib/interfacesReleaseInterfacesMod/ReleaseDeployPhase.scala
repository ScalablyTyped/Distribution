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

object ReleaseDeployPhase {
  @scala.inline
  def apply(
    deploymentJobs: js.Array[DeploymentJob],
    errorLog: java.lang.String,
    id: scala.Double,
    manualInterventions: js.Array[ManualIntervention],
    name: java.lang.String,
    phaseId: java.lang.String,
    phaseType: DeployPhaseTypes,
    rank: scala.Double,
    runPlanId: java.lang.String,
    status: DeployPhaseStatus
  ): ReleaseDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs, errorLog = errorLog, id = id, manualInterventions = manualInterventions, name = name, phaseId = phaseId, phaseType = phaseType, rank = rank, runPlanId = runPlanId, status = status)
  
    __obj.asInstanceOf[ReleaseDeployPhase]
  }
}

