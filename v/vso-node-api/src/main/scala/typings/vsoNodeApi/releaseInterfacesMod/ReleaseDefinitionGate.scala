package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionGate extends StObject {
  
  var tasks: js.Array[WorkflowTask]
}
object ReleaseDefinitionGate {
  
  @scala.inline
  def apply(tasks: js.Array[WorkflowTask]): ReleaseDefinitionGate = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGate]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionGateMutableBuilder[Self <: ReleaseDefinitionGate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTasks(value: js.Array[WorkflowTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: WorkflowTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
