package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyAuthorization extends js.Object {
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: java.lang.String
  /**
    * Gets or sets the client identifier for this proxy.
    */
  var clientId: java.lang.String
  /**
    * Gets or sets the user identity to authorize for on-prem.
    */
  var identity: vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.IdentityDescriptor
  /**
    * Gets or sets the public key used to verify the identity of this proxy. Only specify on hosted.
    */
  var publicKey: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.PublicKey
}

object ProxyAuthorization {
  @scala.inline
  def apply(
    authorizationUrl: java.lang.String,
    clientId: java.lang.String,
    identity: vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.IdentityDescriptor,
    publicKey: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.PublicKey
  ): ProxyAuthorization = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationUrl")(authorizationUrl)
    __obj.updateDynamic("clientId")(clientId)
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[ProxyAuthorization]
  }
}

