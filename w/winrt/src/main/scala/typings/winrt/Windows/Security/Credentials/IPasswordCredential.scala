package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordCredential extends js.Object {
  var password: String
  var properties: IPropertySet
  var resource: String
  var userName: String
  def retrievePassword(): Unit
}

object IPasswordCredential {
  @scala.inline
  def apply(
    password: String,
    properties: IPropertySet,
    resource: String,
    retrievePassword: () => Unit,
    userName: String
  ): IPasswordCredential = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], retrievePassword = js.Any.fromFunction0(retrievePassword), userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasswordCredential]
  }
}

