package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPasswordVault extends js.Object {
  
  def add(credential: PasswordCredential): Unit = js.native
  
  def findAllByResource(resource: String): IVectorView[PasswordCredential] = js.native
  
  def findAllByUserName(userName: String): IVectorView[PasswordCredential] = js.native
  
  def remove(credential: PasswordCredential): Unit = js.native
  
  def retrieve(resource: String, userName: String): PasswordCredential = js.native
  
  def retrieveAll(): IVectorView[PasswordCredential] = js.native
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
  
  @scala.inline
  implicit class IPasswordVaultOps[Self <: IPasswordVault] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: PasswordCredential => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAllByResource(value: String => IVectorView[PasswordCredential]): Self = this.set("findAllByResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAllByUserName(value: String => IVectorView[PasswordCredential]): Self = this.set("findAllByUserName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: PasswordCredential => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRetrieve(value: (String, String) => PasswordCredential): Self = this.set("retrieve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRetrieveAll(value: () => IVectorView[PasswordCredential]): Self = this.set("retrieveAll", js.Any.fromFunction0(value))
  }
}
