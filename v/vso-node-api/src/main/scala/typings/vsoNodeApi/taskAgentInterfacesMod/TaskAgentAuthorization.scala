package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentAuthorization extends StObject {
  
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: String
  
  /**
    * Gets or sets the client identifier for this agent.
    */
  var clientId: String
  
  /**
    * Gets or sets the public key used to verify the identity of this agent.
    */
  var publicKey: TaskAgentPublicKey
}
object TaskAgentAuthorization {
  
  inline def apply(authorizationUrl: String, clientId: String, publicKey: TaskAgentPublicKey): TaskAgentAuthorization = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentAuthorization]
  }
  
  extension [Self <: TaskAgentAuthorization](x: Self) {
    
    inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: TaskAgentPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
