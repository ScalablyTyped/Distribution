package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(assignTime = assignTime, definition = definition, owner = owner, planGroup = planGroup, planId = planId, poolId = poolId, queuePosition = queuePosition, queueTime = queueTime, scopeIdentifier = scopeIdentifier)
  
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
}

