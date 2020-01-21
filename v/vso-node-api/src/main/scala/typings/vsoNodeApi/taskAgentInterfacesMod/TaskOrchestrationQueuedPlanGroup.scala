package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationQueuedPlanGroup extends js.Object {
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planGroup: String
  var plans: js.Array[TaskOrchestrationQueuedPlan]
  var project: ProjectReference
  var queuePosition: Double
}

object TaskOrchestrationQueuedPlanGroup {
  @scala.inline
  def apply(
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
}

