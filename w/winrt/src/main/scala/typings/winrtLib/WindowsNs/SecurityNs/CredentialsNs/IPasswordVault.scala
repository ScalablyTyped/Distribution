package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPasswordVault extends js.Object {
  def add(credential: PasswordCredential): scala.Unit
  def findAllByResource(resource: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
  def findAllByUserName(userName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
  def remove(credential: PasswordCredential): scala.Unit
  def retrieve(resource: java.lang.String, userName: java.lang.String): PasswordCredential
  def retrieveAll(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
}

