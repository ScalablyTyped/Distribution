package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentMigrationMessage extends StObject {
  
  var accessToken: String
}
object AgentMigrationMessage {
  
  inline def apply(accessToken: String): AgentMigrationMessage = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentMigrationMessage]
  }
  
  extension [Self <: AgentMigrationMessage](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
  }
}
