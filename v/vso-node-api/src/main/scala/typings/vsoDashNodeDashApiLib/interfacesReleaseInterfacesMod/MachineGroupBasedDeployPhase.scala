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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deploymentInput")(deploymentInput)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phaseType")(phaseType)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("workflowTasks")(workflowTasks)
    __obj.asInstanceOf[MachineGroupBasedDeployPhase]
  }
}

