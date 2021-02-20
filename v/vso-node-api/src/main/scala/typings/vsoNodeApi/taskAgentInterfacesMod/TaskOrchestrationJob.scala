package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationJob extends TaskOrchestrationItem {
  
  var demands: js.Array[_] = js.native
  
  var executeAs: IdentityRef = js.native
  
  var executionMode: String = js.native
  
  var executionTimeout: js.Any = js.native
  
  var instanceId: String = js.native
  
  var name: String = js.native
  
  var tasks: js.Array[TaskInstance] = js.native
  
  var variables: StringDictionary[String] = js.native
}
object TaskOrchestrationJob {
  
  @scala.inline
  def apply(
    demands: js.Array[_],
    executeAs: IdentityRef,
    executionMode: String,
    executionTimeout: js.Any,
    instanceId: String,
    itemType: TaskOrchestrationItemType,
    name: String,
    tasks: js.Array[TaskInstance],
    variables: StringDictionary[String]
  ): TaskOrchestrationJob = {
    val __obj = js.Dynamic.literal(demands = demands.asInstanceOf[js.Any], executeAs = executeAs.asInstanceOf[js.Any], executionMode = executionMode.asInstanceOf[js.Any], executionTimeout = executionTimeout.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationJob]
  }
  
  @scala.inline
  implicit class TaskOrchestrationJobMutableBuilder[Self <: TaskOrchestrationJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemands(value: js.Array[_]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = StObject.set(x, "demands", js.Array(value :_*))
    
    @scala.inline
    def setExecuteAs(value: IdentityRef): Self = StObject.set(x, "executeAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionMode(value: String): Self = StObject.set(x, "executionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionTimeout(value: js.Any): Self = StObject.set(x, "executionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasks(value: js.Array[TaskInstance]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksVarargs(value: TaskInstance*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
