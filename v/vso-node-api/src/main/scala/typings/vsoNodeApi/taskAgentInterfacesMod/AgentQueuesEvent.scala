package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentQueuesEvent extends js.Object {
  var eventType: String
  var queues: js.Array[TaskAgentQueue]
}

object AgentQueuesEvent {
  @scala.inline
  def apply(eventType: String, queues: js.Array[TaskAgentQueue]): AgentQueuesEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentQueuesEvent]
  }
}

