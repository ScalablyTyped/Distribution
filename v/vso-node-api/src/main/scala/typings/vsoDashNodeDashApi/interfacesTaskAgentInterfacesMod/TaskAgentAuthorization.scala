package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentAuthorization extends js.Object {
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
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, publicKey: TaskAgentPublicKey): TaskAgentAuthorization = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl, clientId = clientId, publicKey = publicKey)
  
    __obj.asInstanceOf[TaskAgentAuthorization]
  }
}

