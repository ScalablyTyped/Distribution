package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentChangeEvent extends js.Object {
  var agent: TaskAgent
  var eventType: java.lang.String
  var pool: TaskAgentPoolReference
  var poolId: scala.Double
  var timeStamp: stdLib.Date
}

object AgentChangeEvent {
  @scala.inline
  def apply(
    agent: TaskAgent,
    eventType: java.lang.String,
    pool: TaskAgentPoolReference,
    poolId: scala.Double,
    timeStamp: stdLib.Date
  ): AgentChangeEvent = {
    val __obj = js.Dynamic.literal(agent = agent, eventType = eventType, pool = pool, poolId = poolId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[AgentChangeEvent]
  }
}

