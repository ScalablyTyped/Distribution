package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskOrchestrationPlanGroupReference extends StObject {
  
  var planGroup: String
  
  var projectId: String
}
object TaskOrchestrationPlanGroupReference {
  
  inline def apply(planGroup: String, projectId: String): TaskOrchestrationPlanGroupReference = {
    val __obj = js.Dynamic.literal(planGroup = planGroup.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskOrchestrationPlanGroupReference] (val x: Self) extends AnyVal {
    
    inline def setPlanGroup(value: String): Self = StObject.set(x, "planGroup", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
