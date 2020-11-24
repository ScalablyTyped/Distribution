package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentRefreshMessage extends js.Object {
  
  var agentId: Double = js.native
  
  var targetVersion: String = js.native
  
  var timeout: js.Any = js.native
}
object AgentRefreshMessage {
  
  @scala.inline
  def apply(agentId: Double, targetVersion: String, timeout: js.Any): AgentRefreshMessage = {
    val __obj = js.Dynamic.literal(agentId = agentId.asInstanceOf[js.Any], targetVersion = targetVersion.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentRefreshMessage]
  }
  
  @scala.inline
  implicit class AgentRefreshMessageOps[Self <: AgentRefreshMessage] (val x: Self) extends AnyVal {
    
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
    def setAgentId(value: Double): Self = this.set("agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersion(value: String): Self = this.set("targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
