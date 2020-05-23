package typings.winrt.Windows.Security.Credentials.UI

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialPickerOptions extends ICredentialPickerOptions

object CredentialPickerOptions {
  @scala.inline
  def apply(
    alwaysDisplayDialog: Boolean,
    authenticationProtocol: AuthenticationProtocol,
    callerSavesCredential: Boolean,
    caption: String,
    credentialSaveOption: CredentialSaveOption,
    customAuthenticationProtocol: String,
    errorCode: Double,
    message: String,
    previousCredential: IBuffer,
    targetName: String
  ): CredentialPickerOptions = {
    val __obj = js.Dynamic.literal(alwaysDisplayDialog = alwaysDisplayDialog.asInstanceOf[js.Any], authenticationProtocol = authenticationProtocol.asInstanceOf[js.Any], callerSavesCredential = callerSavesCredential.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], customAuthenticationProtocol = customAuthenticationProtocol.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], previousCredential = previousCredential.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialPickerOptions]
  }
}

