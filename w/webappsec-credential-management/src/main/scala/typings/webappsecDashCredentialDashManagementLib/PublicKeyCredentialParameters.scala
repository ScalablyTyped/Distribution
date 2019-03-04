package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialparameters}
  */
trait PublicKeyCredentialParameters extends js.Object {
  var alg: scala.Double
  var `type`: PublicKeyCredentialType
}

object PublicKeyCredentialParameters {
  @scala.inline
  def apply(alg: scala.Double, `type`: PublicKeyCredentialType): PublicKeyCredentialParameters = {
    val __obj = js.Dynamic.literal(alg = alg)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PublicKeyCredentialParameters]
  }
}

