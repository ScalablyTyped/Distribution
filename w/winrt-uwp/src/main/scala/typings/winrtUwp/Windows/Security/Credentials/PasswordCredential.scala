package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the password credential store. */
trait PasswordCredential extends js.Object {
  /** Gets or sets the password string of the credential. */
  var password: String
  /** This API is intended for internal use only should not be used in your code. */
  var properties: IPropertySet
  /** Gets or sets the resource of the credential. */
  var resource: String
  /** Gets or sets the user name of the credential. */
  var userName: String
  /** Populates the password for the credential. After the operation returns successfully, you can get the password from the Password property. */
  def retrievePassword(): Unit
}

object PasswordCredential {
  @scala.inline
  def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: () => Unit,
    userName: String
  ): PasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], retrievePassword = js.Any.fromFunction0(retrievePassword), userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordCredential]
  }
}

