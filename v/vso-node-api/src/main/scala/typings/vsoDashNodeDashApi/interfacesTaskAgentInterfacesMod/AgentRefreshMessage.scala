package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentRefreshMessage extends js.Object {
  var agentId: Double
  var targetVersion: String
  var timeout: js.Any
}

object AgentRefreshMessage {
  @scala.inline
  def apply(agentId: Double, targetVersion: String, timeout: js.Any): AgentRefreshMessage = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentRefreshMessage]
  }
}

