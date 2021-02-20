package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskOrchestrationPlanGroupReference extends StObject {
  
  var planGroup: String = js.native
  
  var projectId: String = js.native
}
object TaskOrchestrationPlanGroupReference {
  
  @scala.inline
  def apply(planGroup: String, projectId: String): TaskOrchestrationPlanGroupReference = {
    val __obj = js.Dynamic.literal(planGroup = planGroup.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
  
  @scala.inline
  implicit class TaskOrchestrationPlanGroupReferenceMutableBuilder[Self <: TaskOrchestrationPlanGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlanGroup(value: String): Self = StObject.set(x, "planGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
