package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationPlanGroupsStartedEvent extends StObject {
  
  var planGroups: js.Array[TaskOrchestrationPlanGroupReference]
}
object TaskOrchestrationPlanGroupsStartedEvent {
  
  inline def apply(planGroups: js.Array[TaskOrchestrationPlanGroupReference]): TaskOrchestrationPlanGroupsStartedEvent = {
    val __obj = js.Dynamic.literal(planGroups = planGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupsStartedEvent]
  }
  
  extension [Self <: TaskOrchestrationPlanGroupsStartedEvent](x: Self) {
    
    inline def setPlanGroups(value: js.Array[TaskOrchestrationPlanGroupReference]): Self = StObject.set(x, "planGroups", value.asInstanceOf[js.Any])
    
    inline def setPlanGroupsVarargs(value: TaskOrchestrationPlanGroupReference*): Self = StObject.set(x, "planGroups", js.Array(value*))
  }
}
