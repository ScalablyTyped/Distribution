package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** CredentialsList. */
trait CredentialsList extends js.Object {
  /** An array of credential definitions that were created for this instance. */
  var credentials: js.UndefOr[js.Array[Credentials]] = js.undefined
}

object CredentialsList {
  @scala.inline
  def apply(credentials: js.Array[Credentials] = null): CredentialsList = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsList]
  }
}

