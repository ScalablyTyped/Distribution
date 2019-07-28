package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationPlanGroupReference extends js.Object {
  var planGroup: String
  var projectId: String
}

object TaskOrchestrationPlanGroupReference {
  @scala.inline
  def apply(planGroup: String, projectId: String): TaskOrchestrationPlanGroupReference = {
    val __obj = js.Dynamic.literal(planGroup = planGroup, projectId = projectId)
  
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
}

