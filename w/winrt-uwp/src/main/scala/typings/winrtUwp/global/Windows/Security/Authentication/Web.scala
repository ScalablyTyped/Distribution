package typings.winrtUwp.global.Windows.Security.Authentication

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope
import typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.System.User
import typings.winrtUwp.Windows.Web.Http.HttpCookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps to integrate with online web services without exposing a user's credentials. The web authentication broker provides a set of APIs and infrastructure for apps to use Internet authentication and authorization protocols like OAuth and OpenID. */
object Web {
  
  /** Contains core methods for obtaining tokens from web account providers. */
  object Core {
    
    /** Contains core methods for obtaining tokens from web account providers. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager")
    @js.native
    abstract class WebAuthenticationCoreManager ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager
    object WebAuthenticationCoreManager {
      
      /**
        * Finds a web account asynchronously.
        * @param provider The web account provider for the web account.
        * @param webAccountId The Id of the web account.
        * @return When this method completes successfully, it returns the found web account.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.findAccountAsync")
      @js.native
      def findAccountAsync(provider: WebAccountProvider, webAccountId: String): IPromiseWithIAsyncOperation[WebAccount] = js.native
      
      /**
        * Finds a web account provider asynchronously with one input.
        * @param webAccountProviderId The Id of the web account provider to find.
        * @return When this method completes successfully, it returns the found web account provider.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.findAccountProviderAsync")
      @js.native
      def findAccountProviderAsync(webAccountProviderId: String): IPromiseWithIAsyncOperation[WebAccountProvider] = js.native
      /**
        * Finds a web account provider asynchronously with two inputs.
        * @param webAccountProviderId The Id of the web account provider to find.
        * @param authority The authority of the web account provider to find.
        * @return When this method completes successfully, it returns the found web account provider.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.findAccountProviderAsync")
      @js.native
      def findAccountProviderAsync(webAccountProviderId: String, authority: String): IPromiseWithIAsyncOperation[WebAccountProvider] = js.native
      /**
        * Finds a web account provider asynchronously with three inputs.
        * @param webAccountProviderId The Id of the web account provider to find.
        * @param authority The authority of the web account provider to find.
        * @param user The user associated with the web account provider to find.
        * @return When this method completes successfully, it returns the found web account provider.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.findAccountProviderAsync")
      @js.native
      def findAccountProviderAsync(webAccountProviderId: String, authority: String, user: User): IPromiseWithIAsyncOperation[WebAccountProvider] = js.native
      
      /**
        * Attempts to get a token without showing any UI using one input. The user will never be prompted to enter their credentials.
        * @param request The web token request.
        * @return When this method completes successfully, it returns the result of the web token request.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.getTokenSilentlyAsync")
      @js.native
      def getTokenSilentlyAsync(request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
      /**
        * Attempts to get a token without showing any UI using two inputs. The user will never be prompted to enter their credentials.
        * @param request The web token request.
        * @param webAccount The web account.
        * @return When this method completes successfully, it returns the result of the web token request.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.getTokenSilentlyAsync")
      @js.native
      def getTokenSilentlyAsync(
        request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest,
        webAccount: WebAccount
      ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
      
      /**
        * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
        * @param request The web token request.
        * @return When this method completes successfully, it returns the results of the web token request.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.requestTokenAsync")
      @js.native
      def requestTokenAsync(request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
      /**
        * Requests a token from a web account provider asynchronously. If needed, the user may be prompted to enter their credentials.
        * @param request The web token request.
        * @param webAccount The web account for the request.
        * @return When this method completes successfully, it returns the results of the web token request.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Core.WebAuthenticationCoreManager.requestTokenAsync")
      @js.native
      def requestTokenAsync(
        request: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest,
        webAccount: WebAccount
      ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult] = js.native
    }
    
    /** Represents an error from a web account provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebProviderError")
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
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequest")
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
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType")
    @js.native
    object WebTokenRequestPromptType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType with Double
          ] = js.native
      
      /* 0 */ val default: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType.default with Double = js.native
      
      /* 1 */ val forceAuthentication: typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestPromptType.forceAuthentication with Double = js.native
    }
    
    /** Represents the results of a web token request to an identity provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestResult")
    @js.native
    abstract class WebTokenRequestResult ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequestResult
    
    /** Represents the status of a web token request. */
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenRequestStatus")
    @js.native
    object WebTokenRequestStatus extends StObject {
      
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
    @JSGlobal("Windows.Security.Authentication.Web.Core.WebTokenResponse")
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
  
  /** Contains classes for managing web accounts and authentication requests as an online identity provider. */
  object Provider {
    
    /** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientView")
    @js.native
    class WebAccountClientView protected ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientView {
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
    }
    
    /** Represents the levels of information about a web account shown to the client. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountClientViewType")
    @js.native
    object WebAccountClientViewType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType with Double
          ] = js.native
      
      /* 1 */ val idAndProperties: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idAndProperties with Double = js.native
      
      /* 0 */ val idOnly: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idOnly with Double = js.native
    }
    
    /** Provides methods for managing web accounts. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager")
    @js.native
    abstract class WebAccountManager ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountManager
    object WebAccountManager {
      
      /**
        * Adds a new web account asynchronously with three inputs.
        * @param webAccountId The Id for the web account.
        * @param webAccountUserName The user name for the web account.
        * @param props Properties for the web account.
        * @return When this method completes, it returns the new web account.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.addWebAccountAsync")
      @js.native
      def addWebAccountAsync(webAccountId: String, webAccountUserName: String, props: IMapView[String, String]): IPromiseWithIAsyncOperation[WebAccount] = js.native
      /**
        * Adds a new web account asynchronously with four inputs.
        * @param webAccountId The Id for the web account.
        * @param webAccountUserName The user name for the web account.
        * @param props Properties for the web account.
        * @param scope The scope of the web account.
        * @return When this method completes, it returns the new web account.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.addWebAccountAsync")
      @js.native
      def addWebAccountAsync(
        webAccountId: String,
        webAccountUserName: String,
        props: IMapView[String, String],
        scope: WebAccountScope
      ): IPromiseWithIAsyncOperation[WebAccount] = js.native
      
      /**
        * Clears the view for a web account.
        * @param webAccount The web account to clear the view for.
        * @param applicationCallbackUri The callback Uri that indicates the completion of the operation. The broker matches this Uri against every Uri that it is about to navigate to. The broker never navigates to this Uri, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.clearViewAsync")
      @js.native
      def clearViewAsync(webAccount: WebAccount, applicationCallbackUri: Uri): IPromiseWithIAsyncAction = js.native
      
      /**
        * Clears a web account picture asynchronously.
        * @param webAccount The web account to clear the picture from.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.clearWebAccountPictureAsync")
      @js.native
      def clearWebAccountPictureAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
      
      /**
        * Deletes a web account asynchronously.
        * @param webAccount The WebAccount to delete.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.deleteWebAccountAsync")
      @js.native
      def deleteWebAccountAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
      
      /**
        * Finds all provider web accounts asynchronously.
        * @return When this method completes, it returns all provider web accounts.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.findAllProviderWebAccountsAsync")
      @js.native
      def findAllProviderWebAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
      
      /**
        * Gets the scope of the web account.
        * @param webAccount The web account to get scope for.
        * @return The scope of the web account.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.getScope")
      @js.native
      def getScope(webAccount: WebAccount): WebAccountScope = js.native
      
      /**
        * Gets the views for a web account asynchronously.
        * @param webAccount The web account to get views for.
        * @return When this method completes, it returns the views for the web account.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.getViewsAsync")
      @js.native
      def getViewsAsync(webAccount: WebAccount): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
      
      /**
        * Pulls cookies asynchronously. Use this to enable single sign-on in an app after a user has entered their credentials into a web browser.
        * @param uriString The Uri to pull cookies from.
        * @param callerPFN The caller's package family name.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.pullCookiesAsync")
      @js.native
      def pullCookiesAsync(uriString: String, callerPFN: String): IPromiseWithIAsyncAction = js.native
      
      /**
        * Pushes cookies asynchronously. Use this to enable single sign-on for a web account in a browser after the user has entered their credentials into the app.
        * @param uri The Uri to push the cookies to.
        * @param cookies The cookies to push.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.pushCookiesAsync")
      @js.native
      def pushCookiesAsync(uri: Uri, cookies: IVectorView[HttpCookie]): IPromiseWithIAsyncAction = js.native
      
      /**
        * Sets the scope of a web account asynchronously.
        * @param webAccount The web account to set scope for.
        * @param scope The scope to set.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.setScopeAsync")
      @js.native
      def setScopeAsync(webAccount: WebAccount, scope: WebAccountScope): IPromiseWithIAsyncAction = js.native
      
      /**
        * Sets the view for a web account asynchronously.
        * @param webAccount The web account to set the view for.
        * @param view The view to set.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.setViewAsync")
      @js.native
      def setViewAsync(
        webAccount: WebAccount,
        view: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientView
      ): IPromiseWithIAsyncAction = js.native
      
      /**
        * Sets the picture of a web account asynchronously.
        * @param webAccount The web account to set the picture for.
        * @param webAccountPicture The picture to set.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.setWebAccountPictureAsync")
      @js.native
      def setWebAccountPictureAsync(webAccount: WebAccount, webAccountPicture: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
      
      /**
        * Updates the properties of a web account asynchronously.
        * @param webAccount The web account to update.
        * @param webAccountUserName The username to update.
        * @param additionalProperties The properties to update.
        * @return This method does not return a value.
        */
      /* static member */
      @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountManager.updateWebAccountPropertiesAsync")
      @js.native
      def updateWebAccountPropertiesAsync(webAccount: WebAccount, webAccountUserName: String, additionalProperties: IMapView[String, String]): IPromiseWithIAsyncAction = js.native
    }
    
    /** Represents an add account operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation")
    @js.native
    abstract class WebAccountProviderAddAccountOperation ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation
    
    /** Represents a delete account operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderDeleteAccountOperation")
    @js.native
    abstract class WebAccountProviderDeleteAccountOperation ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderDeleteAccountOperation
    
    /** Represents a get token silently operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation")
    @js.native
    abstract class WebAccountProviderGetTokenSilentOperation ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation
    
    /** Represents a manage account operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation")
    @js.native
    abstract class WebAccountProviderManageAccountOperation ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation
    
    /** Represents different operations a web account provider can perform. Use this to determine what operation to perform when the provider is activated. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind")
    @js.native
    object WebAccountProviderOperationKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind with Double
          ] = js.native
      
      /* 2 */ val addAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.addAccount with Double = js.native
      
      /* 4 */ val deleteAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.deleteAccount with Double = js.native
      
      /* 1 */ val getTokenSilently: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.getTokenSilently with Double = js.native
      
      /* 3 */ val manageAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.manageAccount with Double = js.native
      
      /* 0 */ val requestToken: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.requestToken with Double = js.native
      
      /* 5 */ val retrieveCookies: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.retrieveCookies with Double = js.native
      
      /* 6 */ val signOutAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.signOutAccount with Double = js.native
    }
    
    /** Represents a request token operation. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation")
    @js.native
    abstract class WebAccountProviderRequestTokenOperation ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation
    
    /** Represents a retrieve cookies operation made by a web account provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation")
    @js.native
    abstract class WebAccountProviderRetrieveCookiesOperation ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation
    
    /** Represents a sign out account operation made by a web account provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation")
    @js.native
    abstract class WebAccountProviderSignOutAccountOperation ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation
    
    /** Provides information about a web account provider trigger. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountProviderTriggerDetails")
    @js.native
    abstract class WebAccountProviderTriggerDetails ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderTriggerDetails
    
    /** Represents the scope of a web account. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountScope")
    @js.native
    object WebAccountScope extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope with Double
          ] = js.native
      
      /* 1 */ val perApplication: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perApplication with Double = js.native
      
      /* 0 */ val perUser: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perUser with Double = js.native
    }
    
    /** Represents web account selection options. Use this to support the use of multiple web accounts in an app, where user might choose to log in with an existing account or add a new account. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions")
    @js.native
    object WebAccountSelectionOptions extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions with Double
          ] = js.native
      
      /* 0 */ val default: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.default with Double = js.native
      
      /* 1 */ val `new`: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.`new` with Double = js.native
    }
    
    /** Represents a request for a token from a client to a provider. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest")
    @js.native
    abstract class WebProviderTokenRequest ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest
    
    /** Represents a web provider token response. */
    @JSGlobal("Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse")
    @js.native
    class WebProviderTokenResponse protected ()
      extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse {
      /**
        * Creates a new instance of the WebProviderTokenResponse class.
        * @param webTokenResponse The web token response from the client.
        */
      def this(webTokenResponse: WebTokenResponse) = this()
    }
  }
  
  /** Gets the type of key used for token binding. */
  @JSGlobal("Windows.Security.Authentication.Web.TokenBindingKeyType")
  @js.native
  object TokenBindingKeyType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType with Double
      ] = js.native
    
    /* 1 */ val ecdsaP256: typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType.ecdsaP256 with Double = js.native
    
    /* 0 */ val rsa2048: typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType.rsa2048 with Double = js.native
  }
  
  /** Starts the authentication operation. You can call the methods of this class multiple times in a single application or across multiple applications at the same time. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker")
  @js.native
  abstract class WebAuthenticationBroker ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationBroker
  object WebAuthenticationBroker {
    
    /**
      * Starts the authentication operation with one input.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAndContinue")
    @js.native
    def authenticateAndContinue(requestUri: Uri): Unit = js.native
    /**
      * Starts the authentication operation with two inputs.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAndContinue")
    @js.native
    def authenticateAndContinue(requestUri: Uri, callbackUri: Uri): Unit = js.native
    /**
      * Starts the authentication operation with four inputs.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
      * @param continuationData Continuation data to be passed as part of the authentication operation.
      * @param options The options for the authentication operation.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAndContinue")
    @js.native
    def authenticateAndContinue(requestUri: Uri, callbackUri: Uri, continuationData: ValueSet, options: WebAuthenticationOptions): Unit = js.native
    
    /**
      * Starts the asynchronous authentication operation with two inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param options The options for the authentication operation.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAsync")
    @js.native
    def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
    /**
      * Starts the asynchronous authentication operation with three inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param options The options for the authentication operation.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param callbackUri The callback URI that indicates the completion of the web authentication. The broker matches this URI against every URI that it is about to navigate to. The broker never navigates to this URI, instead the broker returns the control back to the application when the user clicks a link or a web server redirection is made.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateAsync")
    @js.native
    def authenticateAsync(options: WebAuthenticationOptions, requestUri: Uri, callbackUri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
    
    /**
      * Starts the asynchronous authentication operation silently (no UI will be shown) with one input. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateSilentlyAsync")
    @js.native
    def authenticateSilentlyAsync(requestUri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
    /**
      * Starts the asynchronous authentication operation silently (no UI will be shown) with two inputs. You can call this method multiple times in a single application or across multiple applications at the same time.
      * @param requestUri The starting URI of the web service. This URI must be a secure address of https://.
      * @param options The options for the authentication operation.
      * @return The way to query the status and get the results of the authentication operation. If you are getting an invalid parameter error, the most common cause is that you are not using HTTPS for the requestUri parameter.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.authenticateSilentlyAsync")
    @js.native
    def authenticateSilentlyAsync(requestUri: Uri, options: WebAuthenticationOptions): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult] = js.native
    
    /**
      * Gets the current application callback URI.
      * @return The URI of the current application.
      */
    /* static member */
    @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationBroker.getCurrentApplicationCallbackUri")
    @js.native
    def getCurrentApplicationCallbackUri(): Uri = js.native
  }
  
  /** Contains the options available to the asynchronous operation. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationOptions")
  @js.native
  object WebAuthenticationOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions with Double
      ] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.none with Double = js.native
    
    /* 1 */ val silentMode: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.silentMode with Double = js.native
    
    /* 4 */ val useCorporateNetwork: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useCorporateNetwork with Double = js.native
    
    /* 3 */ val useHttpPost: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useHttpPost with Double = js.native
    
    /* 2 */ val useTitle: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationOptions.useTitle with Double = js.native
  }
  
  /** Indicates the result of the authentication operation. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationResult")
  @js.native
  abstract class WebAuthenticationResult ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationResult
  
  /** Contains the status of the authentication operation. */
  @JSGlobal("Windows.Security.Authentication.Web.WebAuthenticationStatus")
  @js.native
  object WebAuthenticationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus with Double
      ] = js.native
    
    /* 2 */ val errorHttp: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus.errorHttp with Double = js.native
    
    /* 0 */ val success: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus.success with Double = js.native
    
    /* 1 */ val userCancel: typings.winrtUwp.Windows.Security.Authentication.Web.WebAuthenticationStatus.userCancel with Double = js.native
  }
}
