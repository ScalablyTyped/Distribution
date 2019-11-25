package typings.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-passwordcredentialdata}
  */
trait PasswordCredentialData extends SiteBoundCredentialData {
  /**
    * The plain-text password.
    */
  var password: String
}

object PasswordCredentialData {
  @scala.inline
  def apply(id: String, password: String, iconURL: String = null, name: String = null): PasswordCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredentialData]
  }
}

