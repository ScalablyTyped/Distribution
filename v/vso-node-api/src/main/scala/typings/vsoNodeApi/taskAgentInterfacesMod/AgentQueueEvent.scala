package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentQueueEvent]
  }
}

