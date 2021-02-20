package typings.winrt.global.Windows.Security

import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Authentication {
  
  object OnlineId {
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
    @js.native
    object CredentialPromptType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType with Double
          ] = js.native
      
      /* 2 */ val doNotPrompt: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt with Double = js.native
      
      /* 0 */ val promptIfNeeded: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded with Double = js.native
      
      /* 1 */ val retypeCredentials: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials with Double = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator")
    @js.native
    class OnlineIdAuthenticator ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket")
    @js.native
    class OnlineIdServiceTicket ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest")
    @js.native
    class OnlineIdServiceTicketRequest protected ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest {
      def this(service: String) = this()
      def this(service: String, policy: String) = this()
    }
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.SignOutUserOperation")
    @js.native
    class SignOutUserOperation ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.SignOutUserOperation
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.UserAuthenticationOperation")
    @js.native
    class UserAuthenticationOperation ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.UserAuthenticationOperation
    
    @JSGlobal("Windows.Security.Authentication.OnlineId.UserIdentity")
    @js.native
    class UserIdentity ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.UserIdentity
  }
  
  object Web {
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
    @js.native
    class WebAuthenticationBroker ()
      extends typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationBroker
    /* static members */
    object WebAuthenticationBroker {
      
      @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAndContinue")
      @js.native
      def authenticateAndContinue(requestUri: Uri): Unit = js.native
      @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAndContinue")
      @js.native
      def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
      @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAndContinue")
      @js.native
      def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
      
      @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAsync")
      @js.native
      def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
      @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAsync")
      @js.native
      def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
      
      @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.getCurrentApplicationCallbackUri")
      @js.native
      def getCurrentApplicationCallbackUri(): Uri = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
    @js.native
    object WebAuthenticationOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions with Double
          ] = js.native
      
      /* 0 */ val none: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.none with Double = js.native
      
      /* 1 */ val silentMode: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode with Double = js.native
      
      /* 4 */ val useCorporateNetwork: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork with Double = js.native
      
      /* 3 */ val useHttpPost: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost with Double = js.native
      
      /* 2 */ val useTitle: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle with Double = js.native
    }
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationResult")
    @js.native
    class WebAuthenticationResult ()
      extends typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
    @js.native
    object WebAuthenticationStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus with Double
          ] = js.native
      
      /* 2 */ val errorHttp: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.errorHttp with Double = js.native
      
      /* 0 */ val success: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.success with Double = js.native
      
      /* 1 */ val userCancel: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.userCancel with Double = js.native
    }
  }
}
