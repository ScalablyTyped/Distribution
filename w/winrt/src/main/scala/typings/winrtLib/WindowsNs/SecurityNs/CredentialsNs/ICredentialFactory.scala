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
    createPasswordCredential: (java.lang.String, java.lang.String, java.lang.String) => PasswordCredential
  ): ICredentialFactory = {
    val __obj = js.Dynamic.literal(createPasswordCredential = js.Any.fromFunction3(createPasswordCredential))
  
    __obj.asInstanceOf[ICredentialFactory]
  }
}

