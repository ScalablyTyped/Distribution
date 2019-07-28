package typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Credentials.UI.CredentialPickerOptions")
@js.native
class CredentialPickerOptions () extends ICredentialPickerOptions {
  /* CompleteClass */
  override var alwaysDisplayDialog: Boolean = js.native
  /* CompleteClass */
  override var authenticationProtocol: AuthenticationProtocol = js.native
  /* CompleteClass */
  override var callerSavesCredential: Boolean = js.native
  /* CompleteClass */
  override var caption: String = js.native
  /* CompleteClass */
  override var credentialSaveOption: CredentialSaveOption = js.native
  /* CompleteClass */
  override var customAuthenticationProtocol: String = js.native
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var previousCredential: IBuffer = js.native
  /* CompleteClass */
  override var targetName: String = js.native
}

