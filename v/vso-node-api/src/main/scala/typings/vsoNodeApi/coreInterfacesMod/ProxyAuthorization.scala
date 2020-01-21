package typings.vsoNodeApi.coreInterfacesMod

import typings.vsoNodeApi.identitiesInterfacesMod.IdentityDescriptor
import typings.vsoNodeApi.vssinterfacesMod.PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyAuthorization extends js.Object {
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: String
  /**
    * Gets or sets the client identifier for this proxy.
    */
  var clientId: String
  /**
    * Gets or sets the user identity to authorize for on-prem.
    */
  var identity: IdentityDescriptor
  /**
    * Gets or sets the public key used to verify the identity of this proxy. Only specify on hosted.
    */
  var publicKey: PublicKey
}

object ProxyAuthorization {
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, identity: IdentityDescriptor, publicKey: PublicKey): ProxyAuthorization = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxyAuthorization]
  }
}

