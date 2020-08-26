package typings.winrtUwp.Windows.Security.Credentials

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the password credential store. */
@js.native
trait PasswordCredential extends js.Object {
  /** Gets or sets the password string of the credential. */
  var password: String = js.native
  /** This API is intended for internal use only should not be used in your code. */
  var properties: IPropertySet = js.native
  /** Gets or sets the resource of the credential. */
  var resource: String = js.native
  /** Gets or sets the user name of the credential. */
  var userName: String = js.native
  /** Populates the password for the credential. After the operation returns successfully, you can get the password from the Password property. */
  def retrievePassword(): Unit = js.native
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
  @scala.inline
  implicit class PasswordCredentialOps[Self <: PasswordCredential] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IPropertySet): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetrievePassword(value: () => Unit): Self = this.set("retrievePassword", js.Any.fromFunction0(value))
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
  
}

