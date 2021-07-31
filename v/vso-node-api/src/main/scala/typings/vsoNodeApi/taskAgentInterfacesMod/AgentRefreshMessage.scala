package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentRefreshMessage extends StObject {
  
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
  
  @scala.inline
  implicit class AgentRefreshMessageMutableBuilder[Self <: AgentRefreshMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentId(value: Double): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVersion(value: String): Self = StObject.set(x, "targetVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
