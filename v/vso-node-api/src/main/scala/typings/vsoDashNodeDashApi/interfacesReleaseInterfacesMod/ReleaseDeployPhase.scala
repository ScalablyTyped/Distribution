package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseDeployPhase extends js.Object {
  var deploymentJobs: js.Array[DeploymentJob]
  var errorLog: String
  var id: Double
  var manualInterventions: js.Array[ManualIntervention]
  var name: String
  var phaseId: String
  var phaseType: DeployPhaseTypes
  var rank: Double
  var runPlanId: String
  var status: DeployPhaseStatus
}

object ReleaseDeployPhase {
  @scala.inline
  def apply(
    deploymentJobs: js.Array[DeploymentJob],
    errorLog: String,
    id: Double,
    manualInterventions: js.Array[ManualIntervention],
    name: String,
    phaseId: String,
    phaseType: DeployPhaseTypes,
    rank: Double,
    runPlanId: String,
    status: DeployPhaseStatus
  ): ReleaseDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentJobs = deploymentJobs, errorLog = errorLog, id = id, manualInterventions = manualInterventions, name = name, phaseId = phaseId, phaseType = phaseType, rank = rank, runPlanId = runPlanId, status = status)
  
    __obj.asInstanceOf[ReleaseDeployPhase]
  }
}

