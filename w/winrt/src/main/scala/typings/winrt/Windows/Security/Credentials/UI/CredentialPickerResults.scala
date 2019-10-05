package typings.winrt.Windows.Security.Credentials.UI

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.UI.CredentialPickerResults")
@js.native
class CredentialPickerResults () extends ICredentialPickerResults {
  /* CompleteClass */
  override var credential: IBuffer = js.native
  /* CompleteClass */
  override var credentialDomainName: String = js.native
  /* CompleteClass */
  override var credentialPassword: String = js.native
  /* CompleteClass */
  override var credentialSaveOption: CredentialSaveOption = js.native
  /* CompleteClass */
  override var credentialSaved: Boolean = js.native
  /* CompleteClass */
  override var credentialUserName: String = js.native
  /* CompleteClass */
  override var errorCode: Double = js.native
}

