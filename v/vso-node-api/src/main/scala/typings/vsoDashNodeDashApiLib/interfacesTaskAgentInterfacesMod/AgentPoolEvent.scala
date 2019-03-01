package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentPoolEvent extends js.Object {
  var eventType: java.lang.String
  var pool: TaskAgentPool
}

object AgentPoolEvent {
  @scala.inline
  def apply(eventType: java.lang.String, pool: TaskAgentPool): AgentPoolEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("pool")(pool)
    __obj.asInstanceOf[AgentPoolEvent]
  }
}

