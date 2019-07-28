package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentBasedDeployPhase extends DeployPhase {
  var deploymentInput: AgentDeploymentInput
}

object AgentBasedDeployPhase {
  @scala.inline
  def apply(
    deploymentInput: AgentDeploymentInput,
    name: String,
    phaseType: DeployPhaseTypes,
    rank: Double,
    workflowTasks: js.Array[WorkflowTask]
  ): AgentBasedDeployPhase = {
    val __obj = js.Dynamic.literal(deploymentInput = deploymentInput, name = name, phaseType = phaseType, rank = rank, workflowTasks = workflowTasks)
  
    __obj.asInstanceOf[AgentBasedDeployPhase]
  }
}

