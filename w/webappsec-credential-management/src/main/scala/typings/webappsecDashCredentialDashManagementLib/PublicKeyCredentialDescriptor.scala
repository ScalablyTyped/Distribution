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

