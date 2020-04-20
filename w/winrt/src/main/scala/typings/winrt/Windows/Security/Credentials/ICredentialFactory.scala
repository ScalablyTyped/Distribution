package typings.winrt.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentialFactory extends js.Object {
  def createPasswordCredential(resource: String, userName: String, password: String): PasswordCredential
}

object ICredentialFactory {
  @scala.inline
  def apply(createPasswordCredential: (String, String, String) => PasswordCredential): ICredentialFactory = {
    val __obj = js.Dynamic.literal(createPasswordCredential = js.Any.fromFunction3(createPasswordCredential))
    __obj.asInstanceOf[ICredentialFactory]
  }
}

