package typings.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-publickeycredentialentity}
  */
trait PublicKeyCredentialEntity extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var name: String
}

object PublicKeyCredentialEntity {
  @scala.inline
  def apply(name: String, icon: String = null): PublicKeyCredentialEntity = {
    val __obj = js.Dynamic.literal(name = name)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[PublicKeyCredentialEntity]
  }
}

