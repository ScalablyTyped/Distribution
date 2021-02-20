package typings.winrt.global.Windows.Security

import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Credentials {
  
  @JSGlobal("Windows.Security.Credentials.PasswordCredential")
  @js.native
  class PasswordCredential ()
    extends typings.winrt.Windows.Security.Credentials.PasswordCredential {
    def this(resource: String, userName: String, password: String) = this()
  }
  
  @JSGlobal("Windows.Security.Credentials.PasswordCredentialPropertyStore")
  @js.native
  class PasswordCredentialPropertyStore ()
    extends typings.winrt.Windows.Security.Credentials.PasswordCredentialPropertyStore
  
  @JSGlobal("Windows.Security.Credentials.PasswordVault")
  @js.native
  class PasswordVault ()
    extends typings.winrt.Windows.Security.Credentials.PasswordVault
  
  object UI {
    
    @JSGlobal("Windows.Security.Credentials.UI.AuthenticationProtocol")
    @js.native
    object AuthenticationProtocol extends StObject {
      
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
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker")
    @js.native
    class CredentialPicker ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPicker
    /* static members */
    object CredentialPicker {
      
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(options: typings.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(targetName: String, message: String): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
      @JSGlobal("Windows.Security.Credentials.UI.CredentialPicker.pickAsync")
      @js.native
      def pickAsync(targetName: String, message: String, caption: String): IAsyncOperation[typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults] = js.native
    }
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerOptions")
    @js.native
    class CredentialPickerOptions ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPickerOptions
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialPickerResults")
    @js.native
    class CredentialPickerResults ()
      extends typings.winrt.Windows.Security.Credentials.UI.CredentialPickerResults
    
    @JSGlobal("Windows.Security.Credentials.UI.CredentialSaveOption")
    @js.native
    object CredentialSaveOption extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption with Double] = js.native
      
      /* 2 */ val hidden: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.hidden with Double = js.native
      
      /* 1 */ val selected: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.selected with Double = js.native
      
      /* 0 */ val unselected: typings.winrt.Windows.Security.Credentials.UI.CredentialSaveOption.unselected with Double = js.native
    }
  }
}
