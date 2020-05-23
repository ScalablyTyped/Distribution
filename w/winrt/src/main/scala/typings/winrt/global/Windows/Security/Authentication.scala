package typings.winrt.global.Windows.Security

import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions
import typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication")
@js.native
object Authentication extends js.Object {
  @js.native
  object OnlineId extends js.Object {
    @js.native
    class OnlineIdAuthenticator ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator
    
    @js.native
    class OnlineIdServiceTicket ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket {
      /* CompleteClass */
      override var errorCode: Double = js.native
      /* CompleteClass */
      override var request: typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest = js.native
      /* CompleteClass */
      override var value: String = js.native
    }
    
    @js.native
    class OnlineIdServiceTicketRequest protected ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest {
      def this(service: String) = this()
      def this(service: String, policy: String) = this()
      /* CompleteClass */
      override var policy: String = js.native
      /* CompleteClass */
      override var service: String = js.native
    }
    
    @js.native
    class SignOutUserOperation ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.SignOutUserOperation {
      /* CompleteClass */
      override var errorCode: Double = js.native
      /* CompleteClass */
      override var id: Double = js.native
      /* CompleteClass */
      override var status: AsyncStatus = js.native
      /* CompleteClass */
      override def cancel(): Unit = js.native
      /* CompleteClass */
      override def close(): Unit = js.native
    }
    
    @js.native
    class UserAuthenticationOperation ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.UserAuthenticationOperation {
      /* CompleteClass */
      override var errorCode: Double = js.native
      /* CompleteClass */
      override var id: Double = js.native
      /* CompleteClass */
      override var status: AsyncStatus = js.native
      /* CompleteClass */
      override def cancel(): Unit = js.native
      /* CompleteClass */
      override def close(): Unit = js.native
    }
    
    @js.native
    class UserIdentity ()
      extends typings.winrt.Windows.Security.Authentication.OnlineId.UserIdentity {
      /* CompleteClass */
      override var firstName: String = js.native
      /* CompleteClass */
      override var id: String = js.native
      /* CompleteClass */
      override var isBetaAccount: Boolean = js.native
      /* CompleteClass */
      override var isConfirmedPC: Boolean = js.native
      /* CompleteClass */
      override var lastName: String = js.native
      /* CompleteClass */
      override var safeCustomerId: String = js.native
      /* CompleteClass */
      override var signInName: String = js.native
      /* CompleteClass */
      override var tickets: IVectorView[typings.winrt.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket] = js.native
    }
    
    @js.native
    object CredentialPromptType extends js.Object {
      /* 2 */ val doNotPrompt: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt with Double = js.native
      /* 0 */ val promptIfNeeded: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded with Double = js.native
      /* 1 */ val retypeCredentials: typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.Security.Authentication.OnlineId.CredentialPromptType with Double
          ] = js.native
    }
    
  }
  
  @js.native
  object Web extends js.Object {
    @js.native
    class WebAuthenticationBroker ()
      extends typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationBroker
    
    @js.native
    class WebAuthenticationResult ()
      extends typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult {
      /* CompleteClass */
      override var responseData: String = js.native
      /* CompleteClass */
      override var responseErrorDetail: Double = js.native
      /* CompleteClass */
      override var responseStatus: WebAuthenticationStatus = js.native
    }
    
    /* static members */
    @js.native
    object WebAuthenticationBroker extends js.Object {
      def authenticateAndContinue(requestUri: Uri): Unit = js.native
      def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
      def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
      def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IAsyncOperation[typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
      def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IAsyncOperation[typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
      def getCurrentApplicationCallbackUri(): Uri = js.native
    }
    
    @js.native
    object WebAuthenticationOptions extends js.Object {
      /* 0 */ val none: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.none with Double = js.native
      /* 1 */ val silentMode: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode with Double = js.native
      /* 4 */ val useCorporateNetwork: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork with Double = js.native
      /* 3 */ val useHttpPost: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost with Double = js.native
      /* 2 */ val useTitle: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationOptions with Double
          ] = js.native
    }
    
    @js.native
    object WebAuthenticationStatus extends js.Object {
      /* 2 */ val errorHttp: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.errorHttp with Double = js.native
      /* 0 */ val success: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.success with Double = js.native
      /* 1 */ val userCancel: typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus.userCancel with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrt.Windows.Security.Authentication.Web.WebAuthenticationStatus with Double
          ] = js.native
    }
    
  }
  
}

