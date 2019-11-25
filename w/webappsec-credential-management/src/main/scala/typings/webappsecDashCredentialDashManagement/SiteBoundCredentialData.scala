package typings.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-siteboundcredentialdata}
  */
trait SiteBoundCredentialData extends CredentialData {
  /**
    * A URL pointing to an image for the credential. This URL MUST be an
    * {@link
    * https://w3c.github.io/webappsec-mixed-content/#a-priori-authenticated-url|
    * a priori authenticated URL}.
    */
  var iconURL: js.UndefOr[String] = js.undefined
  /**
    * A name associated with the credential, intended as a human-understandable
    * public name.
    */
  var name: js.UndefOr[String] = js.undefined
}

object SiteBoundCredentialData {
  @scala.inline
  def apply(id: String, iconURL: String = null, name: String = null): SiteBoundCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteBoundCredentialData]
  }
}

