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

