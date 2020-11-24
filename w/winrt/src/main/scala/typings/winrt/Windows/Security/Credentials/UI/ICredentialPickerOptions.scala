package typings.winrt.Windows.Security.Credentials.UI

import typings.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICredentialPickerOptions extends js.Object {
  
  var alwaysDisplayDialog: Boolean = js.native
  
  var authenticationProtocol: AuthenticationProtocol = js.native
  
  var callerSavesCredential: Boolean = js.native
  
  var caption: String = js.native
  
  var credentialSaveOption: CredentialSaveOption = js.native
  
  var customAuthenticationProtocol: String = js.native
  
  var errorCode: Double = js.native
  
  var message: String = js.native
  
  var previousCredential: IBuffer = js.native
  
  var targetName: String = js.native
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
    val __obj = js.Dynamic.literal(alwaysDisplayDialog = alwaysDisplayDialog.asInstanceOf[js.Any], authenticationProtocol = authenticationProtocol.asInstanceOf[js.Any], callerSavesCredential = callerSavesCredential.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], customAuthenticationProtocol = customAuthenticationProtocol.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], previousCredential = previousCredential.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICredentialPickerOptions]
  }
  
  @scala.inline
  implicit class ICredentialPickerOptionsOps[Self <: ICredentialPickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlwaysDisplayDialog(value: Boolean): Self = this.set("alwaysDisplayDialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationProtocol(value: AuthenticationProtocol): Self = this.set("authenticationProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerSavesCredential(value: Boolean): Self = this.set("callerSavesCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialSaveOption(value: CredentialSaveOption): Self = this.set("credentialSaveOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAuthenticationProtocol(value: String): Self = this.set("customAuthenticationProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousCredential(value: IBuffer): Self = this.set("previousCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetName(value: String): Self = this.set("targetName", value.asInstanceOf[js.Any])
  }
}
