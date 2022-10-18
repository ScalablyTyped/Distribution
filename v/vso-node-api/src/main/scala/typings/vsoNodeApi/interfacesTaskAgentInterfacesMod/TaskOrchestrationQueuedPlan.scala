package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationQueuedPlan extends StObject {
  
  var assignTime: js.Date
  
  var definition: TaskOrchestrationOwner
  
  var owner: TaskOrchestrationOwner
  
  var planGroup: String
  
  var planId: String
  
  var poolId: Double
  
  var queuePosition: Double
  
  var queueTime: js.Date
  
  var scopeIdentifier: String
}
object TaskOrchestrationQueuedPlan {
  
  inline def apply(
    assignTime: js.Date,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    poolId: Double,
    queuePosition: Double,
    queueTime: js.Date,
    scopeIdentifier: String
  ): TaskOrchestrationQueuedPlan = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
  
  extension [Self <: TaskOrchestrationQueuedPlan](x: Self) {
    
    inline def setAssignTime(value: js.Date): Self = StObject.set(x, "assignTime", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: TaskOrchestrationOwner): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: TaskOrchestrationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPlanGroup(value: String): Self = StObject.set(x, "planGroup", value.asInstanceOf[js.Any])
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    inline def setPoolId(value: Double): Self = StObject.set(x, "poolId", value.asInstanceOf[js.Any])
    
    inline def setQueuePosition(value: Double): Self = StObject.set(x, "queuePosition", value.asInstanceOf[js.Any])
    
    inline def setQueueTime(value: js.Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    inline def setScopeIdentifier(value: String): Self = StObject.set(x, "scopeIdentifier", value.asInstanceOf[js.Any])
  }
}
