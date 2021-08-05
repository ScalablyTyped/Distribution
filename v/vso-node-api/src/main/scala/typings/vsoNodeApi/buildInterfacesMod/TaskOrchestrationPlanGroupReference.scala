package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationPlanGroupReference extends StObject {
  
  /**
    * The name of the plan group.
    */
  var planGroup: String
  
  /**
    * The project ID.
    */
  var projectId: String
}
object TaskOrchestrationPlanGroupReference {
  
  inline def apply(planGroup: String, projectId: String): TaskOrchestrationPlanGroupReference = {
    val __obj = js.Dynamic.literal(planGroup = planGroup.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
  
  extension [Self <: TaskOrchestrationPlanGroupReference](x: Self) {
    
    inline def setPlanGroup(value: String): Self = StObject.set(x, "planGroup", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
