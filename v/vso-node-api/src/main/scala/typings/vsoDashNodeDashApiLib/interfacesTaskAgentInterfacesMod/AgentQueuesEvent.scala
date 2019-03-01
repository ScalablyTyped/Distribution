package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentQueuesEvent extends js.Object {
  var eventType: java.lang.String
  var queues: js.Array[TaskAgentQueue]
}

object AgentQueuesEvent {
  @scala.inline
  def apply(eventType: java.lang.String, queues: js.Array[TaskAgentQueue]): AgentQueuesEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("queues")(queues)
    __obj.asInstanceOf[AgentQueuesEvent]
  }
}

