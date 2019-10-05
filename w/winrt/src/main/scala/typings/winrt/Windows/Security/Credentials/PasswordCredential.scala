package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.PasswordCredential")
@js.native
class PasswordCredential () extends IPasswordCredential {
  def this(resource: String, userName: String, password: String) = this()
  /* CompleteClass */
  override var password: String = js.native
  /* CompleteClass */
  override var properties: IPropertySet = js.native
  /* CompleteClass */
  override var resource: String = js.native
  /* CompleteClass */
  override var userName: String = js.native
  /* CompleteClass */
  override def retrievePassword(): Unit = js.native
}

