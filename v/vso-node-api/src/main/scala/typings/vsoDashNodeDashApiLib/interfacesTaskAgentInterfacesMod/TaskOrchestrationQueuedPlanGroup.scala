package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationQueuedPlanGroup extends js.Object {
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planGroup: java.lang.String
  var plans: js.Array[TaskOrchestrationQueuedPlan]
  var project: ProjectReference
  var queuePosition: scala.Double
}

object TaskOrchestrationQueuedPlanGroup {
  @scala.inline
  def apply(
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: java.lang.String,
    plans: js.Array[TaskOrchestrationQueuedPlan],
    project: ProjectReference,
    queuePosition: scala.Double
  ): TaskOrchestrationQueuedPlanGroup = {
    val __obj = js.Dynamic.literal(definition = definition, owner = owner, planGroup = planGroup, plans = plans, project = project, queuePosition = queuePosition)
  
    __obj.asInstanceOf[TaskOrchestrationQueuedPlanGroup]
  }
}

