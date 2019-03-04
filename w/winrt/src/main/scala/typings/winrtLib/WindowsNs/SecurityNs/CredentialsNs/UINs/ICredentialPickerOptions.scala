package typings
package winrtLib.WindowsNs.SecurityNs.CredentialsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICredentialPickerOptions extends js.Object {
  var alwaysDisplayDialog: scala.Boolean
  var authenticationProtocol: AuthenticationProtocol
  var callerSavesCredential: scala.Boolean
  var caption: java.lang.String
  var credentialSaveOption: CredentialSaveOption
  var customAuthenticationProtocol: java.lang.String
  var errorCode: scala.Double
  var message: java.lang.String
  var previousCredential: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  var targetName: java.lang.String
}

object ICredentialPickerOptions {
  @scala.inline
  def apply(
    alwaysDisplayDialog: scala.Boolean,
    authenticationProtocol: AuthenticationProtocol,
    callerSavesCredential: scala.Boolean,
    caption: java.lang.String,
    credentialSaveOption: CredentialSaveOption,
    customAuthenticationProtocol: java.lang.String,
    errorCode: scala.Double,
    message: java.lang.String,
    previousCredential: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    targetName: java.lang.String
  ): ICredentialPickerOptions = {
    val __obj = js.Dynamic.literal(alwaysDisplayDialog = alwaysDisplayDialog, authenticationProtocol = authenticationProtocol, callerSavesCredential = callerSavesCredential, caption = caption, credentialSaveOption = credentialSaveOption, customAuthenticationProtocol = customAuthenticationProtocol, errorCode = errorCode, message = message, previousCredential = previousCredential, targetName = targetName)
  
    __obj.asInstanceOf[ICredentialPickerOptions]
  }
}

