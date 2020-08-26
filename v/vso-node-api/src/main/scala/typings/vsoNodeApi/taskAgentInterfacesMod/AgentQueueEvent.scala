package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentQueueEvent extends js.Object {
  var eventType: String = js.native
  var queue: TaskAgentQueue = js.native
}

object AgentQueueEvent {
  @scala.inline
  def apply(eventType: String, queue: TaskAgentQueue): AgentQueueEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentQueueEvent]
  }
  @scala.inline
  implicit class AgentQueueEventOps[Self <: AgentQueueEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueue(value: TaskAgentQueue): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
  
}

