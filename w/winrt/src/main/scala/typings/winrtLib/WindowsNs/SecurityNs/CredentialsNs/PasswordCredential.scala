package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.PasswordCredential")
@js.native
class PasswordCredential () extends IPasswordCredential {
  def this(resource: java.lang.String, userName: java.lang.String, password: java.lang.String) = this()
  /* CompleteClass */
  override var password: java.lang.String = js.native
  /* CompleteClass */
  override var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet = js.native
  /* CompleteClass */
  override var resource: java.lang.String = js.native
  /* CompleteClass */
  override var userName: java.lang.String = js.native
  /* CompleteClass */
  override def retrievePassword(): scala.Unit = js.native
}

