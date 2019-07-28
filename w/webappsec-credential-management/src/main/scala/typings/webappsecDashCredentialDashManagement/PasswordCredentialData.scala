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
    val __obj = js.Dynamic.literal(id = id, password = password)
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PasswordCredentialData]
  }
}

