package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
    name: java.lang.String,
    phaseType: DeployPhaseTypes,
    rank: scala.Double,
    workflowTasks: js.Array[WorkflowTask]
  ): AgentBasedDeployPhase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deploymentInput")(deploymentInput)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phaseType")(phaseType)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("workflowTasks")(workflowTasks)
    __obj.asInstanceOf[AgentBasedDeployPhase]
  }
}

