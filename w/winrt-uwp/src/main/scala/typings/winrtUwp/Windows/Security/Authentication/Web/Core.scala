package typings.winrtUwp.Windows.Security.Authentication.Web

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains core methods for obtaining tokens from web account providers. */
object Core {
  
  @js.native
  sealed trait WebTokenRequestPromptType extends StObject
  /** Represents the prompt type of a web token request. */
  @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType")
  @js.native
  object WebTokenRequestPromptType extends StObject {
    
    /** The default request type. */
    @js.native
    sealed trait default extends WebTokenRequestPromptType
    
    /** A request with forced authentication. This will require the user to enter their credentials, regardless of whether they are already logged in. */
    @js.native
    sealed trait forceAuthentication extends WebTokenRequestPromptType
  }
  
  @js.native
  sealed trait WebTokenRequestStatus extends StObject
  /** Represents the status of a web token request. */
  @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestStatus")
  @js.native
  object WebTokenRequestStatus extends StObject {
    
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
  }
  
  /** Contains core methods for obtaining tokens from web account providers. */
  @js.native
  trait WebAuthenticationCoreManager extends StObject
  
  /** Represents an error from a web account provider. */
  @js.native
  trait WebProviderError extends StObject {
    
    /** Gets the error code. */
    var errorCode: Double = js.native
    
    /** Gets the error message. */
    var errorMessage: String = js.native
    
    /** Gets the error properties. */
    var properties: IMap[String, String] = js.native
  }
  object WebProviderError {
    
    @scala.inline
    def apply(errorCode: Double, errorMessage: String, properties: IMap[String, String]): WebProviderError = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebProviderError]
    }
    
    @scala.inline
    implicit class WebProviderErrorMutableBuilder[Self <: WebProviderError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: IMap[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a request to an online identity provider for an authentication token. */
  @js.native
  trait WebTokenRequest extends StObject {
    
    var appProperties: js.Any = js.native
    
    /* unmapped type */
    /** Gets the Id of the client making the request. */
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
  object WebTokenRequest {
    
    @scala.inline
    def apply(
      appProperties: js.Any,
      clientId: String,
      promptType: WebTokenRequestPromptType,
      properties: IMap[String, String],
      scope: String,
      webAccountProvider: WebAccountProvider
    ): WebTokenRequest = {
      val __obj = js.Dynamic.literal(appProperties = appProperties.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], promptType = promptType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], webAccountProvider = webAccountProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebTokenRequest]
    }
    
    @scala.inline
    implicit class WebTokenRequestMutableBuilder[Self <: WebTokenRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppProperties(value: js.Any): Self = StObject.set(x, "appProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptType(value: WebTokenRequestPromptType): Self = StObject.set(x, "promptType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: IMap[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAccountProvider(value: WebAccountProvider): Self = StObject.set(x, "webAccountProvider", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the results of a web token request to an identity provider. */
  @js.native
  trait WebTokenRequestResult extends StObject {
    
    /**
      * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
      * @return This method does not return an object or value.
      */
    def invalidateCacheAsync(): IPromiseWithIAsyncAction = js.native
    
    /** Gets the response data from the web token provider. */
    var responseData: IVectorView[WebTokenResponse] = js.native
    
    /** Gets the error returned by the web provider, if any. */
    var responseError: WebProviderError = js.native
    
    /** Gets the status of the request. */
    var responseStatus: WebTokenRequestStatus = js.native
  }
  object WebTokenRequestResult {
    
    @scala.inline
    def apply(
      invalidateCacheAsync: () => IPromiseWithIAsyncAction,
      responseData: IVectorView[WebTokenResponse],
      responseError: WebProviderError,
      responseStatus: WebTokenRequestStatus
    ): WebTokenRequestResult = {
      val __obj = js.Dynamic.literal(invalidateCacheAsync = js.Any.fromFunction0(invalidateCacheAsync), responseData = responseData.asInstanceOf[js.Any], responseError = responseError.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebTokenRequestResult]
    }
    
    @scala.inline
    implicit class WebTokenRequestResultMutableBuilder[Self <: WebTokenRequestResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalidateCacheAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "invalidateCacheAsync", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResponseData(value: IVectorView[WebTokenResponse]): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseError(value: WebProviderError): Self = StObject.set(x, "responseError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseStatus(value: WebTokenRequestStatus): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the response from a web account provider to a web token request. */
  @js.native
  trait WebTokenResponse extends StObject {
    
    /** Gets the properties of the response */
    var properties: IMap[String, String] = js.native
    
    /** Gets the error returned by the provider, if any. */
    var providerError: WebProviderError = js.native
    
    /** Gets the authentication token. */
    var token: String = js.native
    
    /** Gets the web account for the request. */
    var webAccount: WebAccount = js.native
  }
  object WebTokenResponse {
    
    @scala.inline
    def apply(
      properties: IMap[String, String],
      providerError: WebProviderError,
      token: String,
      webAccount: WebAccount
    ): WebTokenResponse = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], providerError = providerError.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], webAccount = webAccount.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebTokenResponse]
    }
    
    @scala.inline
    implicit class WebTokenResponseMutableBuilder[Self <: WebTokenResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperties(value: IMap[String, String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderError(value: WebProviderError): Self = StObject.set(x, "providerError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebAccount(value: WebAccount): Self = StObject.set(x, "webAccount", value.asInstanceOf[js.Any])
    }
  }
}
