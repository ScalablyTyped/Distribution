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

