package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineGroupBasedDeployPhase extends DeployPhase {
  var deploymentInput: MachineGroupDeploymentInput
}

object MachineGroupBasedDeployPhase {
  @scala.inline
  def apply(
    deploymentInput: MachineGroupDeploymentInput,
    name: String,
    phaseType: DeployPhaseTypes,
    rank: Double,
    workflowTasks: js.Array[WorkflowTask]
  ): MachineGroupBasedDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentInput = deploymentInput.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MachineGroupBasedDeployPhase]
  }
}

