package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationQueuedPlan extends js.Object {
  var assignTime: Date
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planGroup: String
  var planId: String
  var poolId: Double
  var queuePosition: Double
  var queueTime: Date
  var scopeIdentifier: String
}

object TaskOrchestrationQueuedPlan {
  @scala.inline
  def apply(
    assignTime: Date,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: String,
    planId: String,
    poolId: Double,
    queuePosition: Double,
    queueTime: Date,
    scopeIdentifier: String
  ): TaskOrchestrationQueuedPlan = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planGroup = planGroup.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], queuePosition = queuePosition.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], scopeIdentifier = scopeIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
}

