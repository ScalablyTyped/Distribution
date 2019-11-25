package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolEvent extends js.Object {
  var eventType: String
  var pool: TaskAgentPool
}

object AgentPoolEvent {
  @scala.inline
  def apply(eventType: String, pool: TaskAgentPool): AgentPoolEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentPoolEvent]
  }
}

