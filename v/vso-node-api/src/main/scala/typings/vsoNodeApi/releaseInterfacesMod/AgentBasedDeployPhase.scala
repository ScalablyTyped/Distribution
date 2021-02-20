package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentBasedDeployPhase extends DeployPhase {
  
  var deploymentInput: AgentDeploymentInput = js.native
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
    val __obj = js.Dynamic.literal(deploymentInput = deploymentInput.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentBasedDeployPhase]
  }
  
  @scala.inline
  implicit class AgentBasedDeployPhaseMutableBuilder[Self <: AgentBasedDeployPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentInput(value: AgentDeploymentInput): Self = StObject.set(x, "deploymentInput", value.asInstanceOf[js.Any])
  }
}
