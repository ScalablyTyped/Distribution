package typings.winrt.global.Windows.Security

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Security.Credentials")
@js.native
object Credentials extends js.Object {
  
  @js.native
  class PasswordCredential ()
    extends typings.winrt.Windows.Security.Credentials.PasswordCredential {
    def this(resource: String, userName: String, password: String) = this()
  }
  
  @js.native
  class PasswordCredentialPropertyStore ()
    extends typings.winrt.Windows.Security.Credentials.PasswordCredentialPropertyStore
  
  @js.native
  class PasswordVault ()
    extends typings.winrt.Windows.Security.Credentials.PasswordVault
  
  @js.native
  object UI extends js.Object {
    
    @js.native
    object AuthenticationProtocol extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol with Double] = js.native
      
      /* 0 */ val basic: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.basic with Double = js.native
      
      /* 5 */ val credSsp: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.credSsp with Double = js.native
      
      /* 6 */ val custom: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.custom with Double = js.native
      
      /* 1 */ val digest: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.digest with Double = js.native
      
      /* 3 */ val kerberos: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.kerberos with Double = js.native
      
      /* 4 */ val negotiate: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.negotiate with Double = js.native
      
      /* 2 */ val ntlm: typings.winrt.Windows.Security.Credentials.UI.AuthenticationProtocol.ntlm with Double = js.native
    }
    
    @js.native
    class CredentialPicker ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPicker
    /* static members */
    @js.native
    object CredentialPicker extends js.Object {
      
      def pickAsync(options: typings.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      def pickAsync(targetName: String, message: String): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    }
    
    @js.native
    class CredentialPickerOptions ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions
    
    @js.native
    class CredentialPickerResults ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults
    
    @js.native
    object CredentialSaveOption extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption with Double] = js.native
      
      /* 2 */ val hidden: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
      
      /* 1 */ val selected: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
      
      /* 0 */ val unselected: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
    }
  }
}
