package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
    name: java.lang.String,
    phaseType: DeployPhaseTypes,
    rank: scala.Double,
    workflowTasks: js.Array[WorkflowTask]
  ): MachineGroupBasedDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentInput = deploymentInput, name = name, phaseType = phaseType, rank = rank, workflowTasks = workflowTasks)
  
    __obj.asInstanceOf[MachineGroupBasedDeployPhase]
  }
}

