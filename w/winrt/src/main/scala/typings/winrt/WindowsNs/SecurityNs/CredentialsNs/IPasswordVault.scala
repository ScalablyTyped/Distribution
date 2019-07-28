package typings.winrt.WindowsNs.SecurityNs.CredentialsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasswordVault extends js.Object {
  def add(credential: PasswordCredential): Unit
  def findAllByResource(resource: String): IVectorView[PasswordCredential]
  def findAllByUserName(userName: String): IVectorView[PasswordCredential]
  def remove(credential: PasswordCredential): Unit
  def retrieve(resource: String, userName: String): PasswordCredential
  def retrieveAll(): IVectorView[PasswordCredential]
}

object IPasswordVault {
  @scala.inline
  def apply(
    add: PasswordCredential => Unit,
    findAllByResource: String => IVectorView[PasswordCredential],
    findAllByUserName: String => IVectorView[PasswordCredential],
    remove: PasswordCredential => Unit,
    retrieve: (String, String) => PasswordCredential,
    retrieveAll: () => IVectorView[PasswordCredential]
  ): IPasswordVault = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), findAllByResource = js.Any.fromFunction1(findAllByResource), findAllByUserName = js.Any.fromFunction1(findAllByUserName), remove = js.Any.fromFunction1(remove), retrieve = js.Any.fromFunction2(retrieve), retrieveAll = js.Any.fromFunction0(retrieveAll))
  
    __obj.asInstanceOf[IPasswordVault]
  }
}

