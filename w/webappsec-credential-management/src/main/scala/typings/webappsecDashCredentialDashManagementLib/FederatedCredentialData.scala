package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-federatedcredentialdata}
  */
trait FederatedCredentialData extends SiteBoundCredentialData {
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var provider: java.lang.String
}

object FederatedCredentialData {
  @scala.inline
  def apply(
    id: java.lang.String,
    provider: java.lang.String,
    iconURL: java.lang.String = null,
    name: java.lang.String = null,
    protocol: java.lang.String = null
  ): FederatedCredentialData = {
    val __obj = js.Dynamic.literal(id = id, provider = provider)
    if (iconURL != null) __obj.updateDynamic("iconURL")(iconURL)
    if (name != null) __obj.updateDynamic("name")(name)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[FederatedCredentialData]
  }
}

