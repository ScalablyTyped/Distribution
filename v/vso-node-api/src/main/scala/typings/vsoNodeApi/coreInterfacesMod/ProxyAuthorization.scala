package typings.vsoNodeApi.coreInterfacesMod

import typings.vsoNodeApi.identitiesInterfacesMod.IdentityDescriptor
import typings.vsoNodeApi.vssinterfacesMod.PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyAuthorization extends js.Object {
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: String = js.native
  /**
    * Gets or sets the client identifier for this proxy.
    */
  var clientId: String = js.native
  /**
    * Gets or sets the user identity to authorize for on-prem.
    */
  var identity: IdentityDescriptor = js.native
  /**
    * Gets or sets the public key used to verify the identity of this proxy. Only specify on hosted.
    */
  var publicKey: PublicKey = js.native
}

object ProxyAuthorization {
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, identity: IdentityDescriptor, publicKey: PublicKey): ProxyAuthorization = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyAuthorization]
  }
  @scala.inline
  implicit class ProxyAuthorizationOps[Self <: ProxyAuthorization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: IdentityDescriptor): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: PublicKey): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

