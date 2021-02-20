package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationPlanGroupsStartedEvent extends StObject {
  
  var planGroups: js.Array[TaskOrchestrationPlanGroupReference] = js.native
}
object TaskOrchestrationPlanGroupsStartedEvent {
  
  @scala.inline
  def apply(planGroups: js.Array[TaskOrchestrationPlanGroupReference]): TaskOrchestrationPlanGroupsStartedEvent = {
    val __obj = js.Dynamic.literal(planGroups = planGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupsStartedEvent]
  }
  
  @scala.inline
  implicit class TaskOrchestrationPlanGroupsStartedEventMutableBuilder[Self <: TaskOrchestrationPlanGroupsStartedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlanGroups(value: js.Array[TaskOrchestrationPlanGroupReference]): Self = StObject.set(x, "planGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanGroupsVarargs(value: TaskOrchestrationPlanGroupReference*): Self = StObject.set(x, "planGroups", js.Array(value :_*))
  }
}
