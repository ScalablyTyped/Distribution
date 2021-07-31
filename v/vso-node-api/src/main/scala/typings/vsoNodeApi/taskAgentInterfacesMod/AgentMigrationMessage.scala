package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentMigrationMessage extends StObject {
  
  var accessToken: String
}
object AgentMigrationMessage {
  
  @scala.inline
  def apply(accessToken: String): AgentMigrationMessage = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentMigrationMessage]
  }
  
  @scala.inline
  implicit class AgentMigrationMessageMutableBuilder[Self <: AgentMigrationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
  }
}
