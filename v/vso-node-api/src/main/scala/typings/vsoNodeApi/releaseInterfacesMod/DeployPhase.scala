package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeployPhase extends StObject {
  
  var name: String
  
  var phaseType: DeployPhaseTypes
  
  var rank: Double
  
  var workflowTasks: js.Array[WorkflowTask]
}
object DeployPhase {
  
  @scala.inline
  def apply(name: String, phaseType: DeployPhaseTypes, rank: Double, workflowTasks: js.Array[WorkflowTask]): DeployPhase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], phaseType = phaseType.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], workflowTasks = workflowTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeployPhase]
  }
  
  @scala.inline
  implicit class DeployPhaseMutableBuilder[Self <: DeployPhase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhaseType(value: DeployPhaseTypes): Self = StObject.set(x, "phaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowTasks(value: js.Array[WorkflowTask]): Self = StObject.set(x, "workflowTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowTasksVarargs(value: WorkflowTask*): Self = StObject.set(x, "workflowTasks", js.Array(value :_*))
  }
}
