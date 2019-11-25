package typings.webappsecDashCredentialDashManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* ***************** CREDENTIAL MANAGEMENT API DEFINITONS ******************* */
/**
  * Declaration merge for 'navigator' which adds the credential management
  * interface.
  */
trait Navigator extends js.Object {
  val credentials: CredentialsContainer
}

object Navigator {
  @scala.inline
  def apply(credentials: CredentialsContainer): Navigator = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Navigator]
  }
}

