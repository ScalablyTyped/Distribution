package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentRequestEvent extends js.Object {
  var eventType: String
  var planId: String
  var poolId: Double
  var reservedAgentId: Double
  var result: TaskResult
  var timeStamp: Date
}

object AgentRequestEvent {
  @scala.inline
  def apply(
    eventType: String,
    planId: String,
    poolId: Double,
    reservedAgentId: Double,
    result: TaskResult,
    timeStamp: Date
  ): AgentRequestEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], poolId = poolId.asInstanceOf[js.Any], reservedAgentId = reservedAgentId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentRequestEvent]
  }
}

