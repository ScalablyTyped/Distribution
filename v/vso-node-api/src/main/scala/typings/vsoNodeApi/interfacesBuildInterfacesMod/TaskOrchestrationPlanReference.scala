package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationPlanReference extends StObject {
  
  /**
    * The type of the plan.
    */
  var orchestrationType: Double
  
  /**
    * The ID of the plan.
    */
  var planId: String
}
object TaskOrchestrationPlanReference {
  
  inline def apply(orchestrationType: Double, planId: String): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal(orchestrationType = orchestrationType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
  
  extension [Self <: TaskOrchestrationPlanReference](x: Self) {
    
    inline def setOrchestrationType(value: Double): Self = StObject.set(x, "orchestrationType", value.asInstanceOf[js.Any])
    
    inline def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
  }
}
