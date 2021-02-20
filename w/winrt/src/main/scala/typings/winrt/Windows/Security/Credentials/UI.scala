package typings.winrt.Windows.Security.Credentials

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UI {
  
  @js.native
  sealed trait AuthenticationProtocol extends StObject
  @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
  @js.native
  object AuthenticationProtocol extends StObject {
    
    @js.native
    sealed trait basic extends AuthenticationProtocol
    
    @js.native
    sealed trait credSsp extends AuthenticationProtocol
    
    @js.native
    sealed trait custom extends AuthenticationProtocol
    
    @js.native
    sealed trait digest extends AuthenticationProtocol
    
    @js.native
    sealed trait kerberos extends AuthenticationProtocol
    
    @js.native
    sealed trait negotiate extends AuthenticationProtocol
    
    @js.native
    sealed trait ntlm extends AuthenticationProtocol
  }
  
  @js.native
  sealed trait CredentialSaveOption extends StObject
  @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
  @js.native
  object CredentialSaveOption extends StObject {
    
    @js.native
    sealed trait hidden extends CredentialSaveOption
    
    @js.native
    sealed trait selected extends CredentialSaveOption
    
    @js.native
    sealed trait unselected extends CredentialSaveOption
  }
  
  @js.native
  trait CredentialPicker extends StObject
  
  @js.native
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
  
  @js.native
  trait CredentialPickerResults extends ICredentialPickerResults
  object CredentialPickerResults {
    
    @scala.inline
    def apply(
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
  
  @js.native
  trait ICredentialPickerOptions extends StObject {
    
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
    implicit class ICredentialPickerOptionsMutableBuilder[Self <: ICredentialPickerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysDisplayDialog(value: Boolean): Self = StObject.set(x, "alwaysDisplayDialog", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationProtocol(value: AuthenticationProtocol): Self = StObject.set(x, "authenticationProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallerSavesCredential(value: Boolean): Self = StObject.set(x, "callerSavesCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialSaveOption(value: CredentialSaveOption): Self = StObject.set(x, "credentialSaveOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomAuthenticationProtocol(value: String): Self = StObject.set(x, "customAuthenticationProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousCredential(value: IBuffer): Self = StObject.set(x, "previousCredential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICredentialPickerResults extends StObject {
    
    var credential: IBuffer = js.native
    
    var credentialDomainName: String = js.native
    
    var credentialPassword: String = js.native
    
    var credentialSaveOption: CredentialSaveOption = js.native
    
    var credentialSaved: Boolean = js.native
    
    var credentialUserName: String = js.native
    
    var errorCode: Double = js.native
  }
  object ICredentialPickerResults {
    
    @scala.inline
    def apply(
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
    implicit class ICredentialPickerResultsMutableBuilder[Self <: ICredentialPickerResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredential(value: IBuffer): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialDomainName(value: String): Self = StObject.set(x, "credentialDomainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialPassword(value: String): Self = StObject.set(x, "credentialPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialSaveOption(value: CredentialSaveOption): Self = StObject.set(x, "credentialSaveOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialSaved(value: Boolean): Self = StObject.set(x, "credentialSaved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialUserName(value: String): Self = StObject.set(x, "credentialUserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ICredentialPickerStatics extends StObject {
    
    def pickAsync(options: CredentialPickerOptions): IAsyncOperation[CredentialPickerResults] = js.native
    def pickAsync(targetName: String, message: String): IAsyncOperation[CredentialPickerResults] = js.native
    def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[CredentialPickerResults] = js.native
  }
}
