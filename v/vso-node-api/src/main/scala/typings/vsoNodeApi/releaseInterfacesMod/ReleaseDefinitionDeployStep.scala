package typings.vsoNodeApi.releaseInterfacesMod

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
  implicit class ReleaseDefinitionDeployStepOps[Self <: ReleaseDefinitionDeployStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTasksVarargs(value: WorkflowTask*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: js.Array[WorkflowTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
}
