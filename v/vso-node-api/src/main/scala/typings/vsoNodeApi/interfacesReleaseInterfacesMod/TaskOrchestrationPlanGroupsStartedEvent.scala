package typings.vsoNodeApi.interfacesReleaseInterfacesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskOrchestrationPlanGroupsStartedEvent] (val x: Self) extends AnyVal {
    
    inline def setPlanGroups(value: js.Array[TaskOrchestrationPlanGroupReference]): Self = StObject.set(x, "planGroups", value.asInstanceOf[js.Any])
    
    inline def setPlanGroupsVarargs(value: TaskOrchestrationPlanGroupReference*): Self = StObject.set(x, "planGroups", js.Array(value*))
  }
}
