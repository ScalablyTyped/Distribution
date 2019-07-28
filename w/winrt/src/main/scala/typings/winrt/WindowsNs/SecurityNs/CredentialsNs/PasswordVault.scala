package typings.winrt.WindowsNs.SecurityNs.CredentialsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.PasswordVault")
@js.native
class PasswordVault () extends IPasswordVault {
  /* CompleteClass */
  override def add(credential: PasswordCredential): Unit = js.native
  /* CompleteClass */
  override def findAllByResource(resource: String): IVectorView[PasswordCredential] = js.native
  /* CompleteClass */
  override def findAllByUserName(userName: String): IVectorView[PasswordCredential] = js.native
  /* CompleteClass */
  override def remove(credential: PasswordCredential): Unit = js.native
  /* CompleteClass */
  override def retrieve(resource: String, userName: String): PasswordCredential = js.native
  /* CompleteClass */
  override def retrieveAll(): IVectorView[PasswordCredential] = js.native
}

