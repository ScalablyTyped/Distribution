package typings.winrtUwp.Windows.Security.Credentials.UI

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls the appearance and behavior of a credential prompt. */
trait CredentialPickerOptions extends js.Object {
  /** Gets or sets the option of whether the dialog box is displayed. */
  var alwaysDisplayDialog: Boolean
  /** Gets or sets the authentication protocol. */
  var authenticationProtocol: AuthenticationProtocol
  /** Gets or sets whether the caller wants to save the credentials. */
  var callerSavesCredential: Boolean
  /** Gets or sets the caption text that is displayed to the user. */
  var caption: String
  /** Gets or sets the option on saving credentials. */
  var credentialSaveOption: CredentialSaveOption
  /** Gets or sets whether the authentication protocol is custom rather than a standard authentication protocol. */
  var customAuthenticationProtocol: String
  /** Gets or sets the error code. */
  var errorCode: Double
  /** Gets or sets the body of text that displays to the user. */
  var message: String
  /** Gets or sets whether to fill dialog box fields with previous credentials. */
  var previousCredential: IBuffer
  /** Gets or sets the name of the target computer. */
  var targetName: String
}

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

