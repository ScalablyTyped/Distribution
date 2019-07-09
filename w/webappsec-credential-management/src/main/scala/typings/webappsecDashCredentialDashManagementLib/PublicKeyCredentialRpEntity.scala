package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrpentity}
  */
trait PublicKeyCredentialRpEntity extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object PublicKeyCredentialRpEntity {
  @scala.inline
  def apply(name: java.lang.String, id: java.lang.String = null): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
}

