package typings.winrt.WindowsNs.SecurityNs.CredentialsNs.UINs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentialPickerOptions extends js.Object {
  var alwaysDisplayDialog: Boolean
  var authenticationProtocol: AuthenticationProtocol
  var callerSavesCredential: Boolean
  var caption: String
  var credentialSaveOption: CredentialSaveOption
  var customAuthenticationProtocol: String
  var errorCode: Double
  var message: String
  var previousCredential: IBuffer
  var targetName: String
}

object ICredentialPickerOptions {
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
  ): ICredentialPickerOptions = {
    val __obj = js.Dynamic.literal(alwaysDisplayDialog = alwaysDisplayDialog, authenticationProtocol = authenticationProtocol, callerSavesCredential = callerSavesCredential, caption = caption, credentialSaveOption = credentialSaveOption, customAuthenticationProtocol = customAuthenticationProtocol, errorCode = errorCode, message = message, previousCredential = previousCredential, targetName = targetName)
  
    __obj.asInstanceOf[ICredentialPickerOptions]
  }
}

