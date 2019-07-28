package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentChangeEvent extends js.Object {
  var agent: TaskAgent
  var eventType: String
  var pool: TaskAgentPoolReference
  var poolId: Double
  var timeStamp: Date
}

object AgentChangeEvent {
  @scala.inline
  def apply(agent: TaskAgent, eventType: String, pool: TaskAgentPoolReference, poolId: Double, timeStamp: Date): AgentChangeEvent = {
    val __obj = js.Dynamic.literal(agent = agent, eventType = eventType, pool = pool, poolId = poolId, timeStamp = timeStamp)
  
    __obj.asInstanceOf[AgentChangeEvent]
  }
}

