package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationJob
  extends StObject
     with TaskOrchestrationItem {
  
  var demands: js.Array[Any]
  
  var executeAs: IdentityRef
  
  var executionMode: String
  
  var executionTimeout: Any
  
  var instanceId: String
  
  var name: String
  
  var tasks: js.Array[TaskInstance]
  
  var variables: StringDictionary[String]
}
object TaskOrchestrationJob {
  
  inline def apply(
    demands: js.Array[Any],
    executeAs: IdentityRef,
    executionMode: String,
    executionTimeout: Any,
    instanceId: String,
    itemType: TaskOrchestrationItemType,
    name: String,
    tasks: js.Array[TaskInstance],
    variables: StringDictionary[String]
  ): TaskOrchestrationJob = {
    val __obj = js.Dynamic.literal(demands = demands.asInstanceOf[js.Any], executeAs = executeAs.asInstanceOf[js.Any], executionMode = executionMode.asInstanceOf[js.Any], executionTimeout = executionTimeout.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationJob]
  }
  
  extension [Self <: TaskOrchestrationJob](x: Self) {
    
    inline def setDemands(value: js.Array[Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    inline def setDemandsVarargs(value: Any*): Self = StObject.set(x, "demands", js.Array(value*))
    
    inline def setExecuteAs(value: IdentityRef): Self = StObject.set(x, "executeAs", value.asInstanceOf[js.Any])
    
    inline def setExecutionMode(value: String): Self = StObject.set(x, "executionMode", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeout(value: Any): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTasks(value: js.Array[TaskInstance]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksVarargs(value: TaskInstance*): Self = StObject.set(x, "tasks", js.Array(value*))
    
    inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
