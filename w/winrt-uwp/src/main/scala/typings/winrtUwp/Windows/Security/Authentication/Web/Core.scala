package typings.winrtUwp.Windows.Security.Authentication.Web

import org.scalablytyped.runtime.TopLevel
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import typings.winrtUwp.Windows.System.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains core methods for obtaining tokens from web account providers. */
@JSGlobal("Windows.Security.Authentication.Web.Core")
@js.native
object Core extends js.Object {
  /** Contains core methods for obtaining tokens from web account providers. */
  @js.native
  abstract class WebAuthenticationCoreManager () extends js.Object
  
  /** Represents an error from a web account provider. */
  @js.native
  class WebProviderError protected () extends js.Object {
    /**
      * Initializes a new instance of the WebProviderError class.
      * @param errorCode The error code.
      * @param errorMessage The error message.
      */
    def this(errorCode: Double, errorMessage: String) = this()
    /** Gets the error code. */
    var errorCode: Double = js.native
    /** Gets the error message. */
    var errorMessage: String = js.native
    /** Gets the error properties. */
    var properties: IMap[String, String] = js.native
  }
  
  /** Represents a request to an online identity provider for an authentication token. */
  @js.native
  class WebTokenRequest protected () extends js.Object {
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
    var appProperties: js.Any = js.native
     /* unmapped type */ /** Gets the Id of the client making the request. */
    var clientId: String = js.native
    /** Gets the prompt type of the request. */
    var promptType: WebTokenRequestPromptType = js.native
    /** Gets the properties of the request. */
    var properties: IMap[String, String] = js.native
    /** Gets the scope of the request. */
    var scope: String = js.native
    /** Gets the web account provider for the request. */
    var webAccountProvider: WebAccountProvider = js.native
  }
  
  @js.native
  sealed trait WebTokenRequestPromptType extends js.Object
  
  /** Represents the results of a web token request to an identity provider. */
  @js.native
  abstract class WebTokenRequestResult () extends js.Object {
    /** Gets the response data from the web token provider. */
    var responseData: IVectorView[WebTokenResponse] = js.native
    /** Gets the error returned by the web provider, if any. */
    var responseError: WebProviderError = js.native
    /** Gets the status of the request. */
    var responseStatus: WebTokenRequestStatus = js.native
    /**
      * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
      * @return This method does not return an object or value.
      */
    def invalidateCacheAsync(): IPromiseWithIAsyncAction = js.native
  }
  
  @js.native
  sealed trait WebTokenRequestStatus extends js.Object
  
  /** Represents the response from a web account provider to a web token request. */
  @js.native
  /** Initializes a new instance of the WebTokenResponse class. */
  class WebTokenResponse () extends js.Object {
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
    def this(token: String, webAccount: WebAccount, error: WebProviderError) = this()
    /** Gets the properties of the response */
    var properties: IMap[String, String] = js.native
    /** Gets the error returned by the provider, if any. */
    var providerError: WebProviderError = js.native
    /** Gets the authentication token. */
    var token: String = js.native
    /** Gets the web account for the request. */
    var webAccount: WebAccount = js.native
  }
  
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
    def getTokenSilentlyAsync(request: WebTokenRequest): IPromiseWithIAsyncOperation[WebTokenRequestResult] = js.native
    /**
      * Attempts to get a token without showing any UI using two inputs. The user will never be prompted to enter their credentials.
      * @param request The web token request.
      * @param webAccount The web account.
      * @return When this method completes successfully, it returns the result of the web token request.
      */
    def getTokenSilentlyAsync(request: WebTokenRequest, webAccount: WebAccount): IPromiseWithIAsyncOperation[WebTokenRequestResult] = js.native
    /**
      * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
      * @param request The web token request.
      * @return When this method completes successfully, it returns the results of the web token request.
      */
    def requestTokenAsync(request: WebTokenRequest): IPromiseWithIAsyncOperation[WebTokenRequestResult] = js.native
    /**
      * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
      * @param request The web token request.
      * @param webAccount The web account for the request.
      * @return When this method completes successfully, it returns the results of the web token request.
      */
    def requestTokenAsync(request: WebTokenRequest, webAccount: WebAccount): IPromiseWithIAsyncOperation[WebTokenRequestResult] = js.native
  }
  
  /** Represents the prompt type of a web token request. */
  @js.native
  object WebTokenRequestPromptType extends js.Object {
    /** The default request type. */
    @js.native
    sealed trait default extends WebTokenRequestPromptType
    
    /** A request with forced authentication. This will require the user to enter their credentials, regardless of whether they are already logged in. */
    @js.native
    sealed trait forceAuthentication extends WebTokenRequestPromptType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebTokenRequestPromptType with Double] = js.native
    /* 0 */ @js.native
    object default extends TopLevel[default with Double]
    
    /* 1 */ @js.native
    object forceAuthentication extends TopLevel[forceAuthentication with Double]
    
  }
  
  /** Represents the status of a web token request. */
  @js.native
  object WebTokenRequestStatus extends js.Object {
    /** The account provider was not available. */
    @js.native
    sealed trait accountProviderNotAvailable extends WebTokenRequestStatus
    
    /** The account associated with the request has switched. This status occurs when you attempt to use one web account, but the user indicates they wish to use a different web account instead. */
    @js.native
    sealed trait accountSwitch extends WebTokenRequestStatus
    
    /** There was a provider error. For information on how to handle this error, consult the provider's documentation. */
    @js.native
    sealed trait providerError extends WebTokenRequestStatus
    
    /** The request was successful. */
    @js.native
    sealed trait success extends WebTokenRequestStatus
    
    /** The request was cancelled by the user. */
    @js.native
    sealed trait userCancel extends WebTokenRequestStatus
    
    /** User interaction is required to complete the request. This option is only applicable to requests made with GetTokenSilentlyAsync . If this status is returned, repeat the request with RequestTokenAsync . */
    @js.native
    sealed trait userInteractionRequired extends WebTokenRequestStatus
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WebTokenRequestStatus with Double] = js.native
    /* 4 */ @js.native
    object accountProviderNotAvailable extends TopLevel[accountProviderNotAvailable with Double]
    
    /* 2 */ @js.native
    object accountSwitch extends TopLevel[accountSwitch with Double]
    
    /* 5 */ @js.native
    object providerError extends TopLevel[providerError with Double]
    
    /* 0 */ @js.native
    object success extends TopLevel[success with Double]
    
    /* 1 */ @js.native
    object userCancel extends TopLevel[userCancel with Double]
    
    /* 3 */ @js.native
    object userInteractionRequired extends TopLevel[userInteractionRequired with Double]
    
  }
  
}

