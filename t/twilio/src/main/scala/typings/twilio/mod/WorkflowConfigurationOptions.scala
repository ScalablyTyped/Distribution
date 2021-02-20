package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowConfigurationOptions extends StObject {
  
  var taskRouting: js.UndefOr[TaskRoutingConfigurationOptions] = js.native
  
  var task_routing: js.UndefOr[TaskRoutingConfigurationOptions] = js.native
}
object WorkflowConfigurationOptions {
  
  @scala.inline
  def apply(): WorkflowConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowConfigurationOptions]
  }
  
  @scala.inline
  implicit class WorkflowConfigurationOptionsMutableBuilder[Self <: WorkflowConfigurationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskRouting(value: TaskRoutingConfigurationOptions): Self = StObject.set(x, "taskRouting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskRoutingUndefined: Self = StObject.set(x, "taskRouting", js.undefined)
    
    @scala.inline
    def setTask_routing(value: TaskRoutingConfigurationOptions): Self = StObject.set(x, "task_routing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask_routingUndefined: Self = StObject.set(x, "task_routing", js.undefined)
  }
}
