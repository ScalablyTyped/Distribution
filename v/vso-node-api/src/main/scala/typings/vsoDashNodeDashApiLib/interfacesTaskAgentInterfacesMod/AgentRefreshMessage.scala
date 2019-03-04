package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentRefreshMessage extends js.Object {
  var agentId: scala.Double
  var targetVersion: java.lang.String
  var timeout: js.Any
}

object AgentRefreshMessage {
  @scala.inline
  def apply(agentId: scala.Double, targetVersion: java.lang.String, timeout: js.Any): AgentRefreshMessage = {
    val __obj = js.Dynamic.literal(agentId = agentId, targetVersion = targetVersion, timeout = timeout)
  
    __obj.asInstanceOf[AgentRefreshMessage]
  }
}

