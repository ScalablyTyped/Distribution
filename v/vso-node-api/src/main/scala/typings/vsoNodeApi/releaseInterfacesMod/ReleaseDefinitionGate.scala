package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionGate extends StObject {
  
  var tasks: js.Array[WorkflowTask]
}
object ReleaseDefinitionGate {
  
  inline def apply(tasks: js.Array[WorkflowTask]): ReleaseDefinitionGate = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGate]
  }
  
  extension [Self <: ReleaseDefinitionGate](x: Self) {
    
    inline def setTasks(value: js.Array[WorkflowTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: WorkflowTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
