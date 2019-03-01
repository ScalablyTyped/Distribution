package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrpentity}
  */
trait PublicKeyCredentialRpEntity extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
}

object PublicKeyCredentialRpEntity {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
}

