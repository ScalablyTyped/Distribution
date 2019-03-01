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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysDisplayDialog")(alwaysDisplayDialog)
    __obj.updateDynamic("authenticationProtocol")(authenticationProtocol)
    __obj.updateDynamic("callerSavesCredential")(callerSavesCredential)
    __obj.updateDynamic("caption")(caption)
    __obj.updateDynamic("credentialSaveOption")(credentialSaveOption)
    __obj.updateDynamic("customAuthenticationProtocol")(customAuthenticationProtocol)
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("previousCredential")(previousCredential)
    __obj.updateDynamic("targetName")(targetName)
    __obj.asInstanceOf[ICredentialPickerOptions]
  }
}

