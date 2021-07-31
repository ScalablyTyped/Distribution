package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationQueuedPlan extends StObject {
  
  var assignTime: Date
  
  var definition: TaskOrchestrationOwner
  
  var owner: TaskOrchestrationOwner
  
  var planGroup: String
  
  var planId: String
  
  var poolId: Double
  
  var queuePosition: Double
  
  var queueTime: Date
  
  var scopeIdentifier: String
}
object TaskOrchestrationQueuedPlan {
  
  @scala.inline
  def apply(
    assignTime: Date,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    poolId: Double,
    queuePosition: Double,
    queueTime: Date,
    scopeIdentifier: String
  ): TaskOrchestrationQueuedPlan = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
  
  @scala.inline
  implicit class TaskOrchestrationQueuedPlanMutableBuilder[Self <: TaskOrchestrationQueuedPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignTime(value: Date): Self = StObject.set(x, "assignTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: TaskOrchestrationOwner): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: TaskOrchestrationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanGroup(value: String): Self = StObject.set(x, "planGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolId(value: Double): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuePosition(value: Double): Self = StObject.set(x, "queuePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeIdentifier(value: String): Self = StObject.set(x, "scopeIdentifier", value.asInstanceOf[js.Any])
  }
}
