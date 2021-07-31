package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MachineGroupBasedDeployPhase
  extends StObject
     with DeployPhase {
  
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
  
  @scala.inline
  implicit class MachineGroupBasedDeployPhaseMutableBuilder[Self <: MachineGroupBasedDeployPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentInput(value: MachineGroupDeploymentInput): Self = StObject.set(x, "deploymentInput", value.asInstanceOf[js.Any])
  }
}
