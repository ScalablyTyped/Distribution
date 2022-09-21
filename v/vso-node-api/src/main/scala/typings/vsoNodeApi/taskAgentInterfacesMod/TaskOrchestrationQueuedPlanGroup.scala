package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationQueuedPlanGroup extends StObject {
  
  var definition: TaskOrchestrationOwner
  
  var owner: TaskOrchestrationOwner
  
  var planGroup: String
  
  var plans: js.Array[TaskOrchestrationQueuedPlan]
  
  var project: ProjectReference
  
  var queuePosition: Double
}
object TaskOrchestrationQueuedPlanGroup {
  
  inline def apply(
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    plans: js.Array[TaskOrchestrationQueuedPlan],
    project: ProjectReference,
    queuePosition: Double
  ): TaskOrchestrationQueuedPlanGroup = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationQueuedPlanGroup]
  }
  
  extension [Self <: TaskOrchestrationQueuedPlanGroup](x: Self) {
    
    inline def setDefinition(value: TaskOrchestrationOwner): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: TaskOrchestrationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPlanGroup(value: String): Self = StObject.set(x, "planGroup", value.asInstanceOf[js.Any])
    
    inline def setPlans(value: js.Array[TaskOrchestrationQueuedPlan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansVarargs(value: TaskOrchestrationQueuedPlan*): Self = StObject.set(x, "plans", js.Array(value*))
    
    inline def setProject(value: ProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setQueuePosition(value: Double): Self = StObject.set(x, "queuePosition", value.asInstanceOf[js.Any])
  }
}
