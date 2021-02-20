package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionDeployStep extends ReleaseDefinitionEnvironmentStep {
  
  /**
    * The list of steps for this definition.
    */
  var tasks: js.Array[WorkflowTask] = js.native
}
object ReleaseDefinitionDeployStep {
  
  @scala.inline
  def apply(id: Double, tasks: js.Array[WorkflowTask]): ReleaseDefinitionDeployStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionDeployStep]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionDeployStepMutableBuilder[Self <: ReleaseDefinitionDeployStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTasks(value: js.Array[WorkflowTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: WorkflowTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
