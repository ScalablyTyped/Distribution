package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* ***************** CREDENTIAL MANAGEMENT API DEFINITONS ******************* */
/**
  * Declaration merge for 'navigator' which adds the credential management
  * interface.
  */
trait Navigator extends js.Object {
  var credentials: js.UndefOr[CredentialsContainer] = js.undefined
}

object Navigator {
  @scala.inline
  def apply(credentials: CredentialsContainer = null): Navigator = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    __obj.asInstanceOf[Navigator]
  }
}

