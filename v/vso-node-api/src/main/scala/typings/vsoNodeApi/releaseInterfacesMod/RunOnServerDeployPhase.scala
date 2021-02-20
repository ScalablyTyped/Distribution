package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOnServerDeployPhase extends DeployPhase {
  
  var deploymentInput: ServerDeploymentInput = js.native
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
    val __obj = js.Dynamic.literal(deploymentInput = deploymentInput.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOnServerDeployPhase]
  }
  
  @scala.inline
  implicit class RunOnServerDeployPhaseMutableBuilder[Self <: RunOnServerDeployPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentInput(value: ServerDeploymentInput): Self = StObject.set(x, "deploymentInput", value.asInstanceOf[js.Any])
  }
}
