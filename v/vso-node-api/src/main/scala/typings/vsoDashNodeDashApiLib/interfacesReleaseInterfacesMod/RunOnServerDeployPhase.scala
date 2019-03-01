package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

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
    name: java.lang.String,
    phaseType: DeployPhaseTypes,
    rank: scala.Double,
    workflowTasks: js.Array[WorkflowTask]
  ): RunOnServerDeployPhase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deploymentInput")(deploymentInput)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phaseType")(phaseType)
    __obj.updateDynamic("rank")(rank)
    __obj.updateDynamic("workflowTasks")(workflowTasks)
    __obj.asInstanceOf[RunOnServerDeployPhase]
  }
}

