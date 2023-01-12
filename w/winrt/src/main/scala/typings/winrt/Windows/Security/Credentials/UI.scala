package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UI {
  
  @js.native
  sealed trait AuthenticationProtocol extends StObject
  @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
  @js.native
  object AuthenticationProtocol extends StObject {
    
    @js.native
    sealed trait basic
      extends StObject
         with AuthenticationProtocol
    
    @js.native
    sealed trait credSsp
      extends StObject
         with AuthenticationProtocol
    
    @js.native
    sealed trait custom
      extends StObject
         with AuthenticationProtocol
    
    @js.native
    sealed trait digest
      extends StObject
         with AuthenticationProtocol
    
    @js.native
    sealed trait kerberos
      extends StObject
         with AuthenticationProtocol
    
    @js.native
    sealed trait negotiate
      extends StObject
         with AuthenticationProtocol
    
    @js.native
    sealed trait ntlm
      extends StObject
         with AuthenticationProtocol
  }
  
  @js.native
  sealed trait CredentialSaveOption extends StObject
  @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
  @js.native
  object CredentialSaveOption extends StObject {
    
    @js.native
    sealed trait hidden
      extends StObject
         with CredentialSaveOption
    
    @js.native
    sealed trait selected
      extends StObject
         with CredentialSaveOption
    
    @js.native
    sealed trait unselected
      extends StObject
         with CredentialSaveOption
  }
  
  trait CredentialPicker extends StObject
  
  trait CredentialPickerOptions
    extends StObject
       with ICredentialPickerOptions
  object CredentialPickerOptions {
    
    inline def apply(
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
  
  trait CredentialPickerResults
    extends StObject
       with ICredentialPickerResults
  object CredentialPickerResults {
    
    inline def apply(
      credential: IBuffer,
      credentialDomainName: String,
      credentialPassword: String,
      credentialSaveOption: CredentialSaveOption,
      credentialSaved: Boolean,
      credentialUserName: String,
      errorCode: Double
    ): CredentialPickerResults = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialDomainName = credentialDomainName.asInstanceOf[js.Any], credentialPassword = credentialPassword.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], credentialSaved = credentialSaved.asInstanceOf[js.Any], credentialUserName = credentialUserName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialPickerResults]
    }
  }
  
  trait ICredentialPickerOptions extends StObject {
    
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
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ICredentialPickerOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysDisplayDialog(value: Boolean): Self = StObject.set(x, "alwaysDisplayDialog", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationProtocol(value: AuthenticationProtocol): Self = StObject.set(x, "authenticationProtocol", value.asInstanceOf[js.Any])
      
      inline def setCallerSavesCredential(value: Boolean): Self = StObject.set(x, "callerSavesCredential", value.asInstanceOf[js.Any])
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCredentialSaveOption(value: CredentialSaveOption): Self = StObject.set(x, "credentialSaveOption", value.asInstanceOf[js.Any])
      
      inline def setCustomAuthenticationProtocol(value: String): Self = StObject.set(x, "customAuthenticationProtocol", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPreviousCredential(value: IBuffer): Self = StObject.set(x, "previousCredential", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICredentialPickerResults extends StObject {
    
    var credential: IBuffer
    
    var credentialDomainName: String
    
    var credentialPassword: String
    
    var credentialSaveOption: CredentialSaveOption
    
    var credentialSaved: Boolean
    
    var credentialUserName: String
    
    var errorCode: Double
  }
  object ICredentialPickerResults {
    
    inline def apply(
      credential: IBuffer,
      credentialDomainName: String,
      credentialPassword: String,
      credentialSaveOption: CredentialSaveOption,
      credentialSaved: Boolean,
      credentialUserName: String,
      errorCode: Double
    ): ICredentialPickerResults = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialDomainName = credentialDomainName.asInstanceOf[js.Any], credentialPassword = credentialPassword.asInstanceOf[js.Any], credentialSaveOption = credentialSaveOption.asInstanceOf[js.Any], credentialSaved = credentialSaved.asInstanceOf[js.Any], credentialUserName = credentialUserName.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICredentialPickerResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICredentialPickerResults] (val x: Self) extends AnyVal {
      
      inline def setCredential(value: IBuffer): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialDomainName(value: String): Self = StObject.set(x, "credentialDomainName", value.asInstanceOf[js.Any])
      
      inline def setCredentialPassword(value: String): Self = StObject.set(x, "credentialPassword", value.asInstanceOf[js.Any])
      
      inline def setCredentialSaveOption(value: CredentialSaveOption): Self = StObject.set(x, "credentialSaveOption", value.asInstanceOf[js.Any])
      
      inline def setCredentialSaved(value: Boolean): Self = StObject.set(x, "credentialSaved", value.asInstanceOf[js.Any])
      
      inline def setCredentialUserName(value: String): Self = StObject.set(x, "credentialUserName", value.asInstanceOf[js.Any])
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICredentialPickerStatics extends StObject {
    
    def pickAsync(options: CredentialPickerOptions): IAsyncOperation[CredentialPickerResults] = js.native
    def pickAsync(targetName: String, message: String): IAsyncOperation[CredentialPickerResults] = js.native
    def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[CredentialPickerResults] = js.native
  }
}
