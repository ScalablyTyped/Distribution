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

object IPasswordVault {
  @scala.inline
  def apply(
    add: PasswordCredential => scala.Unit,
    findAllByResource: java.lang.String => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential],
    findAllByUserName: java.lang.String => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential],
    remove: PasswordCredential => scala.Unit,
    retrieve: (java.lang.String, java.lang.String) => PasswordCredential,
    retrieveAll: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential]
  ): IPasswordVault = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), findAllByResource = js.Any.fromFunction1(findAllByResource), findAllByUserName = js.Any.fromFunction1(findAllByUserName), remove = js.Any.fromFunction1(remove), retrieve = js.Any.fromFunction2(retrieve), retrieveAll = js.Any.fromFunction0(retrieveAll))
  
    __obj.asInstanceOf[IPasswordVault]
  }
}

