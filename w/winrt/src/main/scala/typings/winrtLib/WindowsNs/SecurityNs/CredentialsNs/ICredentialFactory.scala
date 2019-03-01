package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentialFactory extends js.Object {
  def createPasswordCredential(resource: java.lang.String, userName: java.lang.String, password: java.lang.String): PasswordCredential
}

object ICredentialFactory {
  @scala.inline
  def apply(
    createPasswordCredential: js.Function3[java.lang.String, java.lang.String, java.lang.String, PasswordCredential]
  ): ICredentialFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createPasswordCredential")(createPasswordCredential)
    __obj.asInstanceOf[ICredentialFactory]
  }
}

