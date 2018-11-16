package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.PasswordVault")
@js.native
class PasswordVault () extends IPasswordVault {
  /* CompleteClass */
  override def add(credential: PasswordCredential): scala.Unit = js.native
  /* CompleteClass */
  override def findAllByResource(resource: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential] = js.native
  /* CompleteClass */
  override def findAllByUserName(userName: java.lang.String): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential] = js.native
  /* CompleteClass */
  override def remove(credential: PasswordCredential): scala.Unit = js.native
  /* CompleteClass */
  override def retrieve(resource: java.lang.String, userName: java.lang.String): PasswordCredential = js.native
  /* CompleteClass */
  override def retrieveAll(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[PasswordCredential] = js.native
}

