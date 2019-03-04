package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentRequestEvent extends js.Object {
  var eventType: java.lang.String
  var planId: java.lang.String
  var poolId: scala.Double
  var reservedAgentId: scala.Double
  var result: TaskResult
  var timeStamp: stdLib.Date
}

object AgentRequestEvent {
  @scala.inline
  def apply(
    eventType: java.lang.String,
    planId: java.lang.String,
    poolId: scala.Double,
    reservedAgentId: scala.Double,
    result: TaskResult,
    timeStamp: stdLib.Date
  ): AgentRequestEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType, planId = planId, poolId = poolId, reservedAgentId = reservedAgentId, result = result, timeStamp = timeStamp)
  
    __obj.asInstanceOf[AgentRequestEvent]
  }
}

