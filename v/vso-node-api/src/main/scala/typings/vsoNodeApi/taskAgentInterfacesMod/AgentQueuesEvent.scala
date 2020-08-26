package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentQueuesEvent extends js.Object {
  var eventType: String = js.native
  var queues: js.Array[TaskAgentQueue] = js.native
}

object AgentQueuesEvent {
  @scala.inline
  def apply(eventType: String, queues: js.Array[TaskAgentQueue]): AgentQueuesEvent = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentQueuesEvent]
  }
  @scala.inline
  implicit class AgentQueuesEventOps[Self <: AgentQueuesEvent] (val x: Self) extends AnyVal {
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
    def setQueuesVarargs(value: TaskAgentQueue*): Self = this.set("queues", js.Array(value :_*))
    @scala.inline
    def setQueues(value: js.Array[TaskAgentQueue]): Self = this.set("queues", value.asInstanceOf[js.Any])
  }
  
}

