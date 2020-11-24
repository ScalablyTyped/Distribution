package typings.winrtUwp.global.Windows.Security.Authentication.Web

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains core methods for obtaining tokens from web account providers. */
@JSGlobal("Windows.Security.Authentication.Web.Core")
@js.native
object Core extends js.Object {
  
  /** Contains core methods for obtaining tokens from web account providers. */
  @js.native
  abstract class WebAuthenticationCoreManager ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager
  /* static members */
  @js.native
  object WebAuthenticationCoreManager extends js.Object {
    
    /**
      * Finds a web account asynchronously.
      * @param provider The web account provider for the web account.
      * @param webAccountId The Id of the web account.
      * @return When this method completes successfully, it returns the found web account.
      */
    def findAccountAsync(provider: WebAccountProvider, webAccountId: String): IPromiseWithIAsyncOperation[WebAccount] = js.native
    
    /**
      * Finds a web account provider asynchronously with one input.
      * @param webAccountProviderId The Id of the web account provider to find.
      * @return When this method completes successfully, it returns the found web account provider.
      */
    def findAccountProviderAsync(webAccountProviderId: String): IPromiseWithIAsyncOperation[WebAccountProvider] = js.native
    /**
      * Finds a web account provider asynchronously with two inputs.
      * @param webAccountProviderId The Id of the web account provider to find.
      * @param authority The authority of the web account provider to find.
      * @return When this method completes successfully, it returns the found web account provider.
      */
    def findAccountProviderAsync(webAccountProviderId: String, authority: String): IPromiseWithIAsyncOperation[WebAccountProvider] = js.native
    /**
      * Finds a web account provider asynchronously with three inputs.
      * @param webAccountProviderId The Id of the web account provider to find.
      * @param authority The authority of the web account provider to find.
      * @param user The user associated with the web account provider to find.
      * @return When this method completes successfully, it returns the found web account provider.
      */
    def findAccountProviderAsync(webAccountProviderId: String, authority: String, user: User): IPromiseWithIAsyncOperation[WebAccountProvider] = js.native
    
    /**
      * Attempts to get a token without showing any UI using one input. The user will never be prompted to enter their credentials.
      * @param request The web token request.
      * @return When this method completes successfully, it returns the result of the web token request.
      */
    def getTokenSilentlyAsync(request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
    /**
      * Attempts to get a token without showing any UI using two inputs. The user will never be prompted to enter their credentials.
      * @param request The web token request.
      * @param webAccount The web account.
      * @return When this method completes successfully, it returns the result of the web token request.
      */
    def getTokenSilentlyAsync(
      request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest,
      webAccount: WebAccount
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
    
    /**
      * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
      * @param request The web token request.
      * @return When this method completes successfully, it returns the results of the web token request.
      */
    def requestTokenAsync(request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
    /**
      * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
      * @param request The web token request.
      * @param webAccount The web account for the request.
      * @return When this method completes successfully, it returns the results of the web token request.
      */
    def requestTokenAsync(
      request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest,
      webAccount: WebAccount
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
  }
  
  /** Represents an error from a web account provider. */
  @js.native
  class WebProviderError protected ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError {
    /**
      * Initializes a new instance of the WebProviderError class.
      * @param errorCode The error code.
      * @param errorMessage The error message.
      */
    def this(errorCode: Double, errorMessage: String) = this()
  }
  
  /** Represents a request to an online identity provider for an authentication token. */
  @js.native
  class WebTokenRequest protected ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest {
    /**
      * Initializes a new instance of the WebTokenRequest class with one inputs.
      * @param provider The web account provider the request is for.
      */
    def this(provider: WebAccountProvider) = this()
    /**
      * Initializes a new instance of the WebTokenRequest class with two inputs.
      * @param provider The web account provider the request is for.
      * @param scope The scope of the request.
      */
    def this(provider: WebAccountProvider, scope: String) = this()
    /**
      * Initializes a new instance of the WebTokenRequest class with three inputs.
      * @param provider The web account provider the request is for.
      * @param scope The scope of the request.
      * @param clientId The client Id.
      */
    def this(provider: WebAccountProvider, scope: String, clientId: String) = this()
    /**
      * Initializes a new instance of the WebTokenRequest class with four inputs.
      * @param provider The web account provider the request is for.
      * @param scope The scope of the request.
      * @param clientId The client Id.
      * @param promptType The request prompt type.
      */
    def this(
      provider: WebAccountProvider,
      scope: String,
      clientId: String,
      promptType: WebTokenRequestPromptType
    ) = this()
  }
  
  /** Represents the prompt type of a web token request. */
  @js.native
  object WebTokenRequestPromptType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType with Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType.default with Double = js.native
    
    /* 1 */ val forceAuthentication: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType.forceAuthentication with Double = js.native
  }
  
  /** Represents the results of a web token request to an identity provider. */
  @js.native
  abstract class WebTokenRequestResult ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult
  
  /** Represents the status of a web token request. */
  @js.native
  object WebTokenRequestStatus extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus with Double
      ] = js.native
    
    /* 4 */ val accountProviderNotAvailable: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.accountProviderNotAvailable with Double = js.native
    
    /* 2 */ val accountSwitch: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.accountSwitch with Double = js.native
    
    /* 5 */ val providerError: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.providerError with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.success with Double = js.native
    
    /* 1 */ val userCancel: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.userCancel with Double = js.native
    
    /* 3 */ val userInteractionRequired: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.userInteractionRequired with Double = js.native
  }
  
  /** Represents the response from a web account provider to a web token request. */
  @js.native
  /** Initializes a new instance of the WebTokenResponse class. */
  class WebTokenResponse ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse {
    /**
      * Initializes a new instance of the WebTokenResponse class with one input.
      * @param token The token.
      */
    def this(token: String) = this()
    /**
      * Initializes a new instance of the WebTokenResponse class with two inputs.
      * @param token The token.
      * @param webAccount The WebAccount .
      */
    def this(token: String, webAccount: WebAccount) = this()
    /**
      * Initializes a new instance of the WebTokenResponse class with three inputs.
      * @param token The token.
      * @param webAccount The WebAccount .
      * @param error The web provider error.
      */
    def this(
      token: String,
      webAccount: WebAccount,
      error: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
    ) = this()
  }
}
