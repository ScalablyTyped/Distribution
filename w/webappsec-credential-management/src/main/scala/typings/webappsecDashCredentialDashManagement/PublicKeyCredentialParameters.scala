package typings.webappsecDashCredentialDashManagement

import typings.webappsecDashCredentialDashManagement.webappsecDashCredentialDashManagementStrings.`public-key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialparameters}
  */
trait PublicKeyCredentialParameters extends js.Object {
  var alg: Double
  var `type`: `public-key`
}

object PublicKeyCredentialParameters {
  @scala.inline
  def apply(alg: Double, `type`: `public-key`): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
}

