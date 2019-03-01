package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentQueueEvent extends js.Object {
  var eventType: java.lang.String
  var queue: TaskAgentQueue
}

object AgentQueueEvent {
  @scala.inline
  def apply(eventType: java.lang.String, queue: TaskAgentQueue): AgentQueueEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("queue")(queue)
    __obj.asInstanceOf[AgentQueueEvent]
  }
}

