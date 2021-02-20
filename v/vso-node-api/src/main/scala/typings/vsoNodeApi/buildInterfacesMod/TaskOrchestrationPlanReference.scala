package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationPlanReference extends StObject {
  
  /**
    * The type of the plan.
    */
  var orchestrationType: Double = js.native
  
  /**
    * The ID of the plan.
    */
  var planId: String = js.native
}
object TaskOrchestrationPlanReference {
  
  @scala.inline
  def apply(orchestrationType: Double, planId: String): TaskOrchestrationPlanReference = {
    val __obj = js.Dynamic.literal(orchestrationType = orchestrationType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanReference]
  }
  
  @scala.inline
  implicit class TaskOrchestrationPlanReferenceMutableBuilder[Self <: TaskOrchestrationPlanReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrchestrationType(value: Double): Self = StObject.set(x, "orchestrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
  }
}
