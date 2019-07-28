package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOnServerDeployPhase extends DeployPhase {
  var deploymentInput: ServerDeploymentInput
}

object RunOnServerDeployPhase {
  @scala.inline
  def apply(
    deploymentInput: ServerDeploymentInput,
    name: String,
    phaseType: DeployPhaseTypes,
    rank: Double,
    workflowTasks: js.Array[WorkflowTask]
  ): RunOnServerDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentInput = deploymentInput, name = name, phaseType = phaseType, rank = rank, workflowTasks = workflowTasks)
  
    __obj.asInstanceOf[RunOnServerDeployPhase]
  }
}

