package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOrchestrationQueuedPlan extends js.Object {
  var assignTime: stdLib.Date
  var definition: TaskOrchestrationOwner
  var owner: TaskOrchestrationOwner
  var planGroup: java.lang.String
  var planId: java.lang.String
  var poolId: scala.Double
  var queuePosition: scala.Double
  var queueTime: stdLib.Date
  var scopeIdentifier: java.lang.String
}

object TaskOrchestrationQueuedPlan {
  @scala.inline
  def apply(
    assignTime: stdLib.Date,
    definition: TaskOrchestrationOwner,
    owner: TaskOrchestrationOwner,
    planGroup: java.lang.String,
    planId: java.lang.String,
    poolId: scala.Double,
    queuePosition: scala.Double,
    queueTime: stdLib.Date,
    scopeIdentifier: java.lang.String
  ): TaskOrchestrationQueuedPlan = {
    val __obj = js.Dynamic.literal(assignTime = assignTime, definition = definition, owner = owner, planGroup = planGroup, planId = planId, poolId = poolId, queuePosition = queuePosition, queueTime = queueTime, scopeIdentifier = scopeIdentifier)
  
    __obj.asInstanceOf[TaskOrchestrationQueuedPlan]
  }
}

