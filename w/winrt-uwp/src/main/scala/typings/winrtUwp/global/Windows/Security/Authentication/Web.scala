package typings.winrtUwp.global.Windows.Security.Authentication

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions
import typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.Windows.Web.Http.HttpCookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps to integrate with online web services without exposing a user's credentials. The web authentication broker provides a set of APIs and infrastructure for apps to use Internet authentication and authorization protocols like OAuth and OpenID. */
object Web {
  
  /** Contains core methods for obtaining tokens from web account providers. */
  object Core {
    
    /** Contains core methods for obtaining tokens from web account providers. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager")
    @js.native
    abstract class WebAuthenticationCoreManager ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager
    object WebAuthenticationCoreManager {
      
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Finds a web account asynchronously.
        * @param provider The web account provider for the web account.
        * @param webAccountId The Id of the web account.
        * @return When this method completes successfully, it returns the found web account.
        */
      /* static member */
      @scala.inline
      def findAccountAsync(provider: WebAccountProvider, webAccountId: String): IPromiseWithIAsyncOperation[WebAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAccountAsync")(provider.asInstanceOf[js.Any], webAccountId.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[WebAccount]]
      
      /**
        * Finds a web account provider asynchronously with one input.
        * @param webAccountProviderId The Id of the web account provider to find.
        * @return When this method completes successfully, it returns the found web account provider.
        */
      /* static member */
      @scala.inline
      def findAccountProviderAsync(webAccountProviderId: String): IPromiseWithIAsyncOperation[WebAccountProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAccountProviderAsync")(webAccountProviderId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[WebAccountProvider]]
      /**
        * Finds a web account provider asynchronously with two inputs.
        * @param webAccountProviderId The Id of the web account provider to find.
        * @param authority The authority of the web account provider to find.
        * @return When this method completes successfully, it returns the found web account provider.
        */
      /* static member */
      @scala.inline
      def findAccountProviderAsync(webAccountProviderId: String, authority: String): IPromiseWithIAsyncOperation[WebAccountProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAccountProviderAsync")(webAccountProviderId.asInstanceOf[js.Any], authority.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[WebAccountProvider]]
      /**
        * Finds a web account provider asynchronously with three inputs.
        * @param webAccountProviderId The Id of the web account provider to find.
        * @param authority The authority of the web account provider to find.
        * @param user The user associated with the web account provider to find.
        * @return When this method completes successfully, it returns the found web account provider.
        */
      /* static member */
      @scala.inline
      def findAccountProviderAsync(webAccountProviderId: String, authority: String, user: User): IPromiseWithIAsyncOperation[WebAccountProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAccountProviderAsync")(webAccountProviderId.asInstanceOf[js.Any], authority.asInstanceOf[js.Any], user.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[WebAccountProvider]]
      
      /**
        * Attempts to get a token without showing any UI using one input. The user will never be prompted to enter their credentials.
        * @param request The web token request.
        * @return When this method completes successfully, it returns the result of the web token request.
        */
      /* static member */
      @scala.inline
      def getTokenSilentlyAsync(request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenSilentlyAsync")(request.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult]]
      /**
        * Attempts to get a token without showing any UI using two inputs. The user will never be prompted to enter their credentials.
        * @param request The web token request.
        * @param webAccount The web account.
        * @return When this method completes successfully, it returns the result of the web token request.
        */
      /* static member */
      @scala.inline
      def getTokenSilentlyAsync(
        request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest,
        webAccount: WebAccount
      ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenSilentlyAsync")(request.asInstanceOf[js.Any], webAccount.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult]]
      
      /**
        * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
        * @param request The web token request.
        * @return When this method completes successfully, it returns the results of the web token request.
        */
      /* static member */
      @scala.inline
      def requestTokenAsync(request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestTokenAsync")(request.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult]]
      /**
        * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
        * @param request The web token request.
        * @param webAccount The web account for the request.
        * @return When this method completes successfully, it returns the results of the web token request.
        */
      /* static member */
      @scala.inline
      def requestTokenAsync(
        request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest,
        webAccount: WebAccount
      ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestTokenAsync")(request.asInstanceOf[js.Any], webAccount.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult]]
    }
    
    /** Represents an error from a web account provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebProviderError")
    @js.native
    class WebProviderError protected ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError {
      /**
        * Initializes a new instance of the WebProviderError class.
        * @param errorCode The error code.
        * @param errorMessage The error message.
        */
      def this(errorCode: Double, errorMessage: String) = this()
      
      /** Gets the error code. */
      /* CompleteClass */
      var errorCode: Double = js.native
      
      /** Gets the error message. */
      /* CompleteClass */
      var errorMessage: String = js.native
      
      /** Gets the error properties. */
      /* CompleteClass */
      var properties: IMap[String, String] = js.native
    }
    
    /** Represents a request to an online identity provider for an authentication token. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequest")
    @js.native
    class WebTokenRequest protected ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest {
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
      
      /* CompleteClass */
      var appProperties: js.Any = js.native
      
      /* unmapped type */
      /** Gets the Id of the client making the request. */
      /* CompleteClass */
      var clientId: String = js.native
      
      /** Gets the prompt type of the request. */
      /* CompleteClass */
      var promptType: WebTokenRequestPromptType = js.native
      
      /** Gets the properties of the request. */
      /* CompleteClass */
      var properties: IMap[String, String] = js.native
      
      /** Gets the scope of the request. */
      /* CompleteClass */
      var scope: String = js.native
      
      /** Gets the web account provider for the request. */
      /* CompleteClass */
      var webAccountProvider: WebAccountProvider = js.native
    }
    
    /** Represents the prompt type of a web token request. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType")
    @js.native
    object WebTokenRequestPromptType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType & Double
          ] = js.native
      
      /* 0 */ val default: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType.default & Double = js.native
      
      /* 1 */ val forceAuthentication: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType.forceAuthentication & Double = js.native
    }
    
    /** Represents the results of a web token request to an identity provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestResult")
    @js.native
    abstract class WebTokenRequestResult ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult {
      
      /**
        * Invalidates the current cached WebTokenRequestResult . Use this method if an access denied error is returned when trying to use a token.
        * @return This method does not return an object or value.
        */
      /* CompleteClass */
      override def invalidateCacheAsync(): IPromiseWithIAsyncAction = js.native
      
      /** Gets the response data from the web token provider. */
      /* CompleteClass */
      var responseData: IVectorView[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse] = js.native
      
      /** Gets the error returned by the web provider, if any. */
      /* CompleteClass */
      var responseError: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError = js.native
      
      /** Gets the status of the request. */
      /* CompleteClass */
      var responseStatus: WebTokenRequestStatus = js.native
    }
    
    /** Represents the status of a web token request. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestStatus")
    @js.native
    object WebTokenRequestStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus & Double
          ] = js.native
      
      /* 4 */ val accountProviderNotAvailable: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.accountProviderNotAvailable & Double = js.native
      
      /* 2 */ val accountSwitch: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.accountSwitch & Double = js.native
      
      /* 5 */ val providerError: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.providerError & Double = js.native
      
      /* 0 */ val success: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.success & Double = js.native
      
      /* 1 */ val userCancel: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.userCancel & Double = js.native
      
      /* 3 */ val userInteractionRequired: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestStatus.userInteractionRequired & Double = js.native
    }
    
    /** Represents the response from a web account provider to a web token request. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenResponse")
    @js.native
    /** Initializes a new instance of the WebTokenResponse class. */
    class WebTokenResponse ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse {
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
      
      /** Gets the properties of the response */
      /* CompleteClass */
      var properties: IMap[String, String] = js.native
      
      /** Gets the error returned by the provider, if any. */
      /* CompleteClass */
      var providerError: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError = js.native
      
      /** Gets the authentication token. */
      /* CompleteClass */
      var token: String = js.native
      
      /** Gets the web account for the request. */
      /* CompleteClass */
      var webAccount: WebAccount = js.native
    }
  }
  
  /** Contains classes for managing web accounts and authentication requests as an online identity provider. */
  object Provider {
    
    /** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientView")
    @js.native
    class WebAccountClientView protected ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientView {
      /**
        * Creates a new instance of the WebAccountClientView class.
        * @param viewType The client view type.
        * @param applicationCallbackUri The callback URI that indicates the completion of the operation.
        */
      def this(viewType: WebAccountClientViewType, applicationCallbackUri: Uri) = this()
      /**
        * Creates a new instance of the WebAccountClientView class.
        * @param viewType The client view type.
        * @param applicationCallbackUri The callback URI that indicates the completion of the operation.
        * @param accountPairwiseId The account pairwise Id.
        */
      def this(viewType: WebAccountClientViewType, applicationCallbackUri: Uri, accountPairwiseId: String) = this()
      
      /** Gets the account pairwise Id. */
      /* CompleteClass */
      var accountPairwiseId: String = js.native
      
      /** Gets the app callback Uri. */
      /* CompleteClass */
      var applicationCallbackUri: Uri = js.native
      
      /** Gets the type of web account client view. */
      /* CompleteClass */
      var `type`: WebAccountClientViewType = js.native
    }
    
    /** Represents the levels of information about a web account shown to the client. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientViewType")
    @js.native
    object WebAccountClientViewType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType & Double
          ] = js.native
      
      /* 1 */ val idAndProperties: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idAndProperties & Double = js.native
      
      /* 0 */ val idOnly: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idOnly & Double = js.native
    }
    
    /** Provides methods for managing web accounts. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager")
    @js.native
    abstract class WebAccountManager ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountManager
    object WebAccountManager {
      
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Adds a new web account asynchronously with three inputs.
        * @param webAccountId The Id for the web account.
        * @param webAccountUserName The user name for the web account.
        * @param props Properties for the web account.
        * @return When this method completes, it returns the new web account.
        */
      /* static member */
      @scala.inline
      def addWebAccountAsync(webAccountId: String, webAccountUserName: String, props: IMapView[String, String]): IPromiseWithIAsyncOperation[WebAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("addWebAccountAsync")(webAccountId.asInstanceOf[js.Any], webAccountUserName.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[WebAccount]]
      /**
        * Adds a new web account asynchronously with four inputs.
        * @param webAccountId The Id for the web account.
        * @param webAccountUserName The user name for the web account.
        * @param props Properties for the web account.
        * @param scope The scope of the web account.
        * @return When this method completes, it returns the new web account.
        */
      /* static member */
      @scala.inline
      def addWebAccountAsync(
        webAccountId: String,
        webAccountUserName: String,
        props: IMapView[String, String],
        scope: WebAccountScope
      ): IPromiseWithIAsyncOperation[WebAccount] = (^.asInstanceOf[js.Dynamic].applyDynamic("addWebAccountAsync")(webAccountId.asInstanceOf[js.Any], webAccountUserName.asInstanceOf[js.Any], props.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[WebAccount]]
      
      /**
        * Clears the view for a web account.
        * @param webAccount The web account to clear the view for.
        * @param applicationCallbackUri The callback Uri that indicates the completion of the operation. The broker matches this Uri against every Uri that it is about to navigate to. The broker never navigates to this Uri, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def clearViewAsync(webAccount: WebAccount, applicationCallbackUri: Uri): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearViewAsync")(webAccount.asInstanceOf[js.Any], applicationCallbackUri.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Clears a web account picture asynchronously.
        * @param webAccount The web account to clear the picture from.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def clearWebAccountPictureAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearWebAccountPictureAsync")(webAccount.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Deletes a web account asynchronously.
        * @param webAccount The WebAccount to delete.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def deleteWebAccountAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteWebAccountAsync")(webAccount.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Finds all provider web accounts asynchronously.
        * @return When this method completes, it returns all provider web accounts.
        */
      /* static member */
      @scala.inline
      def findAllProviderWebAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllProviderWebAccountsAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
      
      /**
        * Gets the scope of the web account.
        * @param webAccount The web account to get scope for.
        * @return The scope of the web account.
        */
      /* static member */
      @scala.inline
      def getScope(webAccount: WebAccount): WebAccountScope = ^.asInstanceOf[js.Dynamic].applyDynamic("getScope")(webAccount.asInstanceOf[js.Any]).asInstanceOf[WebAccountScope]
      
      /**
        * Gets the views for a web account asynchronously.
        * @param webAccount The web account to get views for.
        * @return When this method completes, it returns the views for the web account.
        */
      /* static member */
      @scala.inline
      def getViewsAsync(webAccount: WebAccount): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewsAsync")(webAccount.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
      
      /**
        * Pulls cookies asynchronously. Use this to enable single sign-on in an app after a user has entered their credentials into a web browser.
        * @param uriString The Uri to pull cookies from.
        * @param callerPFN The caller's package family name.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def pullCookiesAsync(uriString: String, callerPFN: String): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("pullCookiesAsync")(uriString.asInstanceOf[js.Any], callerPFN.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Pushes cookies asynchronously. Use this to enable single sign-on for a web account in a browser after the user has entered their credentials into the app.
        * @param uri The Uri to push the cookies to.
        * @param cookies The cookies to push.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def pushCookiesAsync(uri: Uri, cookies: IVectorView[HttpCookie]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("pushCookiesAsync")(uri.asInstanceOf[js.Any], cookies.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Sets the scope of a web account asynchronously.
        * @param webAccount The web account to set scope for.
        * @param scope The scope to set.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def setScopeAsync(webAccount: WebAccount, scope: WebAccountScope): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setScopeAsync")(webAccount.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Sets the view for a web account asynchronously.
        * @param webAccount The web account to set the view for.
        * @param view The view to set.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def setViewAsync(
        webAccount: WebAccount,
        view: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientView
      ): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setViewAsync")(webAccount.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Sets the picture of a web account asynchronously.
        * @param webAccount The web account to set the picture for.
        * @param webAccountPicture The picture to set.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def setWebAccountPictureAsync(webAccount: WebAccount, webAccountPicture: IRandomAccessStream): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("setWebAccountPictureAsync")(webAccount.asInstanceOf[js.Any], webAccountPicture.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
      
      /**
        * Updates the properties of a web account asynchronously.
        * @param webAccount The web account to update.
        * @param webAccountUserName The username to update.
        * @param additionalProperties The properties to update.
        * @return This method does not return a value.
        */
      /* static member */
      @scala.inline
      def updateWebAccountPropertiesAsync(webAccount: WebAccount, webAccountUserName: String, additionalProperties: IMapView[String, String]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateWebAccountPropertiesAsync")(webAccount.asInstanceOf[js.Any], webAccountUserName.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
    }
    
    /** Represents an add account operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation")
    @js.native
    abstract class WebAccountProviderAddAccountOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation {
      
      /** Gets the kind of web account provider operation. */
      /* CompleteClass */
      var kind: WebAccountProviderOperationKind = js.native
      
      /** Informs the activating app that the operation completed successfully. */
      /* CompleteClass */
      override def reportCompleted(): Unit = js.native
    }
    
    /** Represents a delete account operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderDeleteAccountOperation")
    @js.native
    abstract class WebAccountProviderDeleteAccountOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderDeleteAccountOperation {
      
      /** Gets the kind of web account provider operation. */
      /* CompleteClass */
      var kind: WebAccountProviderOperationKind = js.native
      
      /** Informs the activating app that the operation completed successfully. */
      /* CompleteClass */
      override def reportCompleted(): Unit = js.native
      
      /**
        * Informs the activating app that the operation encountered an error.
        * @param value The type of error encountered.
        */
      /* CompleteClass */
      override def reportError(value: WebProviderError): Unit = js.native
      
      /** Gets the web account to delete. */
      /* CompleteClass */
      var webAccount: WebAccount = js.native
    }
    
    /** Represents a get token silently operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation")
    @js.native
    abstract class WebAccountProviderGetTokenSilentOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation
    
    /** Represents a manage account operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation")
    @js.native
    abstract class WebAccountProviderManageAccountOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation {
      
      /** Gets the kind of web provider operation. */
      /* CompleteClass */
      var kind: WebAccountProviderOperationKind = js.native
      
      /** Informs the activating application that the operation completed successfully. */
      /* CompleteClass */
      override def reportCompleted(): Unit = js.native
      
      /** Gets the web account to manage. */
      /* CompleteClass */
      var webAccount: WebAccount = js.native
    }
    
    /** Represents different operations a web account provider can perform. Use this to determine what operation to perform when the provider is activated. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind")
    @js.native
    object WebAccountProviderOperationKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind & Double
          ] = js.native
      
      /* 2 */ val addAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.addAccount & Double = js.native
      
      /* 4 */ val deleteAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.deleteAccount & Double = js.native
      
      /* 1 */ val getTokenSilently: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.getTokenSilently & Double = js.native
      
      /* 3 */ val manageAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.manageAccount & Double = js.native
      
      /* 0 */ val requestToken: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.requestToken & Double = js.native
      
      /* 5 */ val retrieveCookies: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.retrieveCookies & Double = js.native
      
      /* 6 */ val signOutAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.signOutAccount & Double = js.native
    }
    
    /** Represents a request token operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation")
    @js.native
    abstract class WebAccountProviderRequestTokenOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation {
      
      /** Gets or sets the cache expiration time. */
      /* CompleteClass */
      var cacheExpirationTime: Date = js.native
      
      /** Gets the kind of web account provider operation. */
      /* CompleteClass */
      var kind: WebAccountProviderOperationKind = js.native
      
      /** Gets the web provider token request. */
      /* CompleteClass */
      var providerRequest: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest = js.native
      
      /** Gets the web provider token responses. */
      /* CompleteClass */
      var providerResponses: IVector[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse
          ] = js.native
      
      /** Informs the activating app that the operation completed successfully. */
      /* CompleteClass */
      override def reportCompleted(): Unit = js.native
      
      /**
        * Informs the activating app that the operation encountered an error.
        * @param value The type of error encountered.
        */
      /* CompleteClass */
      override def reportError(value: WebProviderError): Unit = js.native
      
      /** Informs the activating app that the user cancelled the operation. */
      /* CompleteClass */
      override def reportUserCanceled(): Unit = js.native
    }
    
    /** Represents a retrieve cookies operation made by a web account provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation")
    @js.native
    abstract class WebAccountProviderRetrieveCookiesOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation {
      
      /** Gets the app callback Uri. */
      /* CompleteClass */
      var applicationCallbackUri: Uri = js.native
      
      /** Gets the context of the retrieve cookies operation. */
      /* CompleteClass */
      var context: Uri = js.native
      
      /** Gets the cookies. */
      /* CompleteClass */
      var cookies: IVector[HttpCookie] = js.native
      
      /** Gets the kind of web account provider operation. */
      /* CompleteClass */
      var kind: WebAccountProviderOperationKind = js.native
      
      /** Informs the activating app that the operation completed successfully. */
      /* CompleteClass */
      override def reportCompleted(): Unit = js.native
      
      /**
        * Informs the activating app that the operation encountered an error.
        * @param value The type of error encountered.
        */
      /* CompleteClass */
      override def reportError(value: WebProviderError): Unit = js.native
      
      /** Gets or sets the Uri to retrieve cookies from. */
      /* CompleteClass */
      var uri: Uri = js.native
    }
    
    /** Represents a sign out account operation made by a web account provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation")
    @js.native
    abstract class WebAccountProviderSignOutAccountOperation ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation {
      
      /** Gets the app callback Uri. */
      /* CompleteClass */
      var applicationCallbackUri: Uri = js.native
      
      /** Gets the client Id. */
      /* CompleteClass */
      var clientId: String = js.native
      
      /** Gets the kind of web account provider operation. */
      /* CompleteClass */
      var kind: WebAccountProviderOperationKind = js.native
      
      /** Informs the activating app that the operation completed successfully. */
      /* CompleteClass */
      override def reportCompleted(): Unit = js.native
      
      /**
        * Informs the activating app that the operation encountered an error.
        * @param value The type of error encountered.
        */
      /* CompleteClass */
      override def reportError(value: WebProviderError): Unit = js.native
      
      /** Gets the web account to sign out. */
      /* CompleteClass */
      var webAccount: WebAccount = js.native
    }
    
    /** Provides information about a web account provider trigger. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderTriggerDetails")
    @js.native
    abstract class WebAccountProviderTriggerDetails ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderTriggerDetails {
      
      /** Gets the web account provider operation. */
      /* CompleteClass */
      var operation: IWebAccountProviderOperation = js.native
    }
    
    /** Represents the scope of a web account. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountScope")
    @js.native
    object WebAccountScope extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope & Double
          ] = js.native
      
      /* 1 */ val perApplication: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perApplication & Double = js.native
      
      /* 0 */ val perUser: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perUser & Double = js.native
    }
    
    /** Represents web account selection options. Use this to support the use of multiple web accounts in an app, where user might choose to log in with an existing account or add a new account. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions")
    @js.native
    object WebAccountSelectionOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions & Double
          ] = js.native
      
      /* 0 */ val default: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.default & Double = js.native
      
      /* 1 */ val `new`: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.`new` & Double = js.native
    }
    
    /** Represents a request for a token from a client to a provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest")
    @js.native
    abstract class WebProviderTokenRequest ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest {
      
      /** Gets the app callback Uri. */
      /* CompleteClass */
      var applicationCallbackUri: Uri = js.native
      
      /** Gets the web token request made by the client. */
      /* CompleteClass */
      var clientRequest: WebTokenRequest = js.native
      
      /**
        * Gets a token binding key for the app asynchronously.
        * @param keyType The type of key to get.
        * @param target The target Uri.
        * @return When this method completes, it returns a cryptographic key.
        */
      /* CompleteClass */
      override def getApplicationTokenBindingKeyAsync(keyType: TokenBindingKeyType, target: Uri): IPromiseWithIAsyncOperation[CryptographicKey] = js.native
      
      /** Gets the web account selection options. */
      /* CompleteClass */
      var webAccountSelectionOptions: WebAccountSelectionOptions = js.native
      
      /** Gets the web accounts for the request. */
      /* CompleteClass */
      var webAccounts: IVectorView[WebAccount] = js.native
    }
    
    /** Represents a web provider token response. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse")
    @js.native
    class WebProviderTokenResponse protected ()
      extends StObject
         with typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse {
      /**
        * Creates a new instance of the WebProviderTokenResponse class.
        * @param webTokenResponse The web token response from the client.
        */
      def this(webTokenResponse: WebTokenResponse) = this()
      
      /** Gets the response from the provider to the client. */
      /* CompleteClass */
      var clientResponse: WebTokenResponse = js.native
    }
  }
  
  /** Gets the type of key used for token binding. */
  @JSGlobal("Windows.Security.Authentication.Web.TokenBindingKeyType")
  @js.native
  object TokenBindingKeyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType & Double
      ] = js.native
    
    /* 1 */ val ecdsaP256: typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType.ecdsaP256 & Double = js.native
    
    /* 0 */ val rsa2048: typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType.rsa2048 & Double = js.native
  }
  
  /** Starts the authentication operation. You can call the methods of this class multiple times in a single application or across multiple applications at the same time. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
  @js.native
  abstract class WebAuthenticationBroker ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationBroker
  object WebAuthenticationBroker {
    
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Starts the authentication operation with one input.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      */
    /* static member */
    @scala.inline
    def authenticateAndContinue(requestUri: Uri): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAndContinue")(requestUri.asInstanceOf[js.Any]).asInstanceOf[Unit]
    /**
      * Starts the authentication operation with two inputs.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
      */
    /* static member */
    @scala.inline
    def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAndContinue")(requestUri.asInstanceOf[js.Any], callbackUri.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Starts the authentication operation with four inputs.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
      * @param continuationData Continuation data to be passed as part of the authentication operation.
      * @param options The options for the authentication operation.
      */
    /* static member */
    @scala.inline
    def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAndContinue")(requestUri.asInstanceOf[js.Any], callbackUri.asInstanceOf[js.Any], continuationData.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Starts the asynchronous authentication operation with two inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param options The options for the authentication operation.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @scala.inline
    def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsync")(options.asInstanceOf[js.Any], requestUri.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult]]
    /**
      * Starts the asynchronous authentication operation with three inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param options The options for the authentication operation.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @scala.inline
    def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateAsync")(options.asInstanceOf[js.Any], requestUri.asInstanceOf[js.Any], callbackUri.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult]]
    
    /**
      * Starts the asynchronous authentication operation silently (no UI will be shown) with one input. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @scala.inline
    def authenticateSilentlyAsync(requestUri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateSilentlyAsync")(requestUri.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult]]
    /**
      * Starts the asynchronous authentication operation silently (no UI will be shown) with two inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param options The options for the authentication operation.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @scala.inline
    def authenticateSilentlyAsync(requestUri: Uri, options: WebAuthenticationOptions): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateSilentlyAsync")(requestUri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult]]
    
    /**
      * Gets the current application callback URI.
      * @return The URI of the current application.
      */
    /* static member */
    @scala.inline
    def getCurrentApplicationCallbackUri(): Uri = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentApplicationCallbackUri")().asInstanceOf[Uri]
  }
  
  /** Contains the options available to the asynchronous operation. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
  @js.native
  object WebAuthenticationOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions & Double
      ] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.none & Double = js.native
    
    /* 1 */ val silentMode: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode & Double = js.native
    
    /* 4 */ val useCorporateNetwork: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork & Double = js.native
    
    /* 3 */ val useHttpPost: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost & Double = js.native
    
    /* 2 */ val useTitle: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle & Double = js.native
  }
  
  /** Indicates the result of the authentication operation. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationResult")
  @js.native
  abstract class WebAuthenticationResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult {
    
    /** Contains the protocol data when the operation successfully completes. */
    /* CompleteClass */
    var responseData: String = js.native
    
    /** Returns the HTTP error code when ResponseStatus is equal to WebAuthenticationStatus.ErrorHttp . This is only available if there is an error. */
    /* CompleteClass */
    var responseErrorDetail: Double = js.native
    
    /** Contains the status of the asynchronous operation when it completes. */
    /* CompleteClass */
    var responseStatus: WebAuthenticationStatus = js.native
  }
  
  /** Contains the status of the authentication operation. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
  @js.native
  object WebAuthenticationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus & Double
      ] = js.native
    
    /* 2 */ val errorHttp: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus.errorHttp & Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus.success & Double = js.native
    
    /* 1 */ val userCancel: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus.userCancel & Double = js.native
  }
}
