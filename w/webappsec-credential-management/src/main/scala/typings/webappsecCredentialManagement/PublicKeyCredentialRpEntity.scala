package typings.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialrpentity}
  */
trait PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  var id: js.UndefOr[String] = js.undefined
}

object PublicKeyCredentialRpEntity {
  @scala.inline
  def apply(name: String, icon: String = null, id: String = null): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
}

