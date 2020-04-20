package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(planGroup = planGroup.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOrchestrationPlanGroupReference]
  }
}

