package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordCredential extends js.Object {
  var password: java.lang.String
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet
  var resource: java.lang.String
  var userName: java.lang.String
  def retrievePassword(): scala.Unit
}

object IPasswordCredential {
  @scala.inline
  def apply(
    password: java.lang.String,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet,
    resource: java.lang.String,
    retrievePassword: js.Function0[scala.Unit],
    userName: java.lang.String
  ): IPasswordCredential = {
    val __obj = js.Dynamic.literal(password = password, properties = properties, resource = resource, retrievePassword = retrievePassword, userName = userName)
  
    __obj.asInstanceOf[IPasswordCredential]
  }
}

