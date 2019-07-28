package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(definition = definition, owner = owner, planGroup = planGroup, plans = plans, project = project, queuePosition = queuePosition)
  
    __obj.asInstanceOf[TaskOrchestrationQueuedPlanGroup]
  }
}

