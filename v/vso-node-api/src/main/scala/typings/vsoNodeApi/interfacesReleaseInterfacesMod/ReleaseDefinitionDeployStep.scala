package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionDeployStep
  extends StObject
     with ReleaseDefinitionEnvironmentStep {
  
  /**
    * The list of steps for this definition.
    */
  var tasks: js.Array[WorkflowTask]
}
object ReleaseDefinitionDeployStep {
  
  inline def apply(id: Double, tasks: js.Array[WorkflowTask]): ReleaseDefinitionDeployStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionDeployStep]
  }
  
  extension [Self <: ReleaseDefinitionDeployStep](x: Self) {
    
    inline def setTasks(value: js.Array[WorkflowTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: WorkflowTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
