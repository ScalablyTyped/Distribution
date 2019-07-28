package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentQueueEvent extends js.Object {
  var eventType: String
  var queue: TaskAgentQueue
}

object AgentQueueEvent {
  @scala.inline
  def apply(eventType: String, queue: TaskAgentQueue): AgentQueueEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType, queue = queue)
  
    __obj.asInstanceOf[AgentQueueEvent]
  }
}

