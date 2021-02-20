package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentAuthorization extends StObject {
  
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: String = js.native
  
  /**
    * Gets or sets the client identifier for this agent.
    */
  var clientId: String = js.native
  
  /**
    * Gets or sets the public key used to verify the identity of this agent.
    */
  var publicKey: TaskAgentPublicKey = js.native
}
object TaskAgentAuthorization {
  
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, publicKey: TaskAgentPublicKey): TaskAgentAuthorization = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentAuthorization]
  }
  
  @scala.inline
  implicit class TaskAgentAuthorizationMutableBuilder[Self <: TaskAgentAuthorization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: TaskAgentPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
