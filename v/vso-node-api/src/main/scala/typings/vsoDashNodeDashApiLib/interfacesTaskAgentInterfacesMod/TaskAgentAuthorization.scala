package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentAuthorization extends js.Object {
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: java.lang.String
  /**
    * Gets or sets the client identifier for this agent.
    */
  var clientId: java.lang.String
  /**
    * Gets or sets the public key used to verify the identity of this agent.
    */
  var publicKey: TaskAgentPublicKey
}

object TaskAgentAuthorization {
  @scala.inline
  def apply(authorizationUrl: java.lang.String, clientId: java.lang.String, publicKey: TaskAgentPublicKey): TaskAgentAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationUrl")(authorizationUrl)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[TaskAgentAuthorization]
  }
}

