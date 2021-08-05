package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowConfigurationOptions extends StObject {
  
  var taskRouting: js.UndefOr[TaskRoutingConfigurationOptions] = js.undefined
  
  var task_routing: js.UndefOr[TaskRoutingConfigurationOptions] = js.undefined
}
object WorkflowConfigurationOptions {
  
  inline def apply(): WorkflowConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowConfigurationOptions]
  }
  
  extension [Self <: WorkflowConfigurationOptions](x: Self) {
    
    inline def setTaskRouting(value: TaskRoutingConfigurationOptions): Self = StObject.set(x, "taskRouting", value.asInstanceOf[js.Any])
    
    inline def setTaskRoutingUndefined: Self = StObject.set(x, "taskRouting", js.undefined)
    
    inline def setTask_routing(value: TaskRoutingConfigurationOptions): Self = StObject.set(x, "task_routing", value.asInstanceOf[js.Any])
    
    inline def setTask_routingUndefined: Self = StObject.set(x, "task_routing", js.undefined)
  }
}
