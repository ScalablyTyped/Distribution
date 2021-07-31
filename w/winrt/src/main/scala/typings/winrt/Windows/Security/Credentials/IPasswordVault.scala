package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPasswordVault extends StObject {
  
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
  
  @scala.inline
  implicit class IPasswordVaultMutableBuilder[Self <: IPasswordVault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: PasswordCredential => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAllByResource(value: String => IVectorView[PasswordCredential]): Self = StObject.set(x, "findAllByResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindAllByUserName(value: String => IVectorView[PasswordCredential]): Self = StObject.set(x, "findAllByUserName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: PasswordCredential => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRetrieve(value: (String, String) => PasswordCredential): Self = StObject.set(x, "retrieve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRetrieveAll(value: () => IVectorView[PasswordCredential]): Self = StObject.set(x, "retrieveAll", js.Any.fromFunction0(value))
  }
}
