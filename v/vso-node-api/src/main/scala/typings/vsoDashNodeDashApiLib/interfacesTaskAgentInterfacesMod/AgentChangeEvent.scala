package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentChangeEvent extends js.Object {
  var agent: TaskAgent
  var eventType: java.lang.String
  var pool: TaskAgentPoolReference
  var poolId: scala.Double
  var timeStamp: stdLib.Date
}

object AgentChangeEvent {
  @scala.inline
  def apply(
    agent: TaskAgent,
    eventType: java.lang.String,
    pool: TaskAgentPoolReference,
    poolId: scala.Double,
    timeStamp: stdLib.Date
  ): AgentChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agent")(agent)
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("pool")(pool)
    __obj.updateDynamic("poolId")(poolId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[AgentChangeEvent]
  }
}

