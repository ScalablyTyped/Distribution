package typings.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-federatedcredentialdata}
  */
trait FederatedCredentialData extends SiteBoundCredentialData {
  var protocol: js.UndefOr[String] = js.undefined
  var provider: String
}

object FederatedCredentialData {
  @scala.inline
  def apply(id: String, provider: String, iconURL: String = null, name: String = null, protocol: String = null): FederatedCredentialData = {
    val __obj = js.Dynamic.literal(id = id, provider = provider)
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL)
    if (name != null) __obj.updateDynamic("name")(name)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[FederatedCredentialData]
  }
}

