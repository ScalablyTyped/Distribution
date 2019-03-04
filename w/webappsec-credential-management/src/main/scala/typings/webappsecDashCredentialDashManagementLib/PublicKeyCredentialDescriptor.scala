package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialdescriptor}
  */
trait PublicKeyCredentialDescriptor extends js.Object {
  var id: stdLib.BufferSource
  var transports: js.UndefOr[js.Array[AuthenticatorTransport]] = js.undefined
  var `type`: PublicKeyCredentialType
}

object PublicKeyCredentialDescriptor {
  @scala.inline
  def apply(
    id: stdLib.BufferSource,
    `type`: PublicKeyCredentialType,
    transports: js.Array[AuthenticatorTransport] = null
  ): PublicKeyCredentialDescriptor = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[PublicKeyCredentialDescriptor]
  }
}

