package typings.winrtUwp.global.Windows.Security.Authentication.Web

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebProviderError
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenRequest
import typings.winrtUwp.Windows.Security.Authentication.Web.Core.WebTokenResponse
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope
import typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Cryptography.Core.CryptographicKey
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains classes for managing web accounts and authentication requests as an online identity provider. */
@JSGlobal("Windows.Security.Authentication.Web.Provider")
@js.native
object Provider extends js.Object {
  /** Represents the client view for a web account. Use this to control what information about an account from a provider is available to the client. */
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
    /** Gets the account pairwise Id. */
    /* CompleteClass */
    override var accountPairwiseId: String = js.native
    /** Gets the app callback Uri. */
    /* CompleteClass */
    override var applicationCallbackUri: Uri = js.native
    /** Gets the type of web account client view. */
    /* CompleteClass */
    override var `type`: WebAccountClientViewType = js.native
  }
  
  /** Provides methods for managing web accounts. */
  @js.native
  abstract class WebAccountManager ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountManager
  
  /** Represents an add account operation. */
  @js.native
  abstract class WebAccountProviderAddAccountOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderAddAccountOperation {
    /** Gets the kind of web account provider operation. */
    /* CompleteClass */
    override var kind: WebAccountProviderOperationKind = js.native
    /** Informs the activating app that the operation completed successfully. */
    /* CompleteClass */
    override def reportCompleted(): Unit = js.native
  }
  
  /** Represents a delete account operation. */
  @js.native
  abstract class WebAccountProviderDeleteAccountOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderDeleteAccountOperation {
    /** Gets the kind of web account provider operation. */
    /* CompleteClass */
    override var kind: WebAccountProviderOperationKind = js.native
    /** Gets the web account to delete. */
    /* CompleteClass */
    override var webAccount: WebAccount = js.native
    /** Informs the activating app that the operation completed successfully. */
    /* CompleteClass */
    override def reportCompleted(): Unit = js.native
    /**
      * Informs the activating app that the operation encountered an error.
      * @param value The type of error encountered.
      */
    /* CompleteClass */
    override def reportError(value: WebProviderError): Unit = js.native
  }
  
  /** Represents a get token silently operation. */
  @js.native
  abstract class WebAccountProviderGetTokenSilentOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderGetTokenSilentOperation
  
  /** Represents a manage account operation. */
  @js.native
  abstract class WebAccountProviderManageAccountOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderManageAccountOperation {
    /** Gets the kind of web provider operation. */
    /* CompleteClass */
    override var kind: WebAccountProviderOperationKind = js.native
    /** Gets the web account to manage. */
    /* CompleteClass */
    override var webAccount: WebAccount = js.native
    /** Informs the activating application that the operation completed successfully. */
    /* CompleteClass */
    override def reportCompleted(): Unit = js.native
  }
  
  /** Represents a request token operation. */
  @js.native
  abstract class WebAccountProviderRequestTokenOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRequestTokenOperation {
    /** Gets or sets the cache expiration time. */
    /* CompleteClass */
    override var cacheExpirationTime: Date = js.native
    /** Gets the kind of web account provider operation. */
    /* CompleteClass */
    override var kind: WebAccountProviderOperationKind = js.native
    /** Gets the web provider token request. */
    /* CompleteClass */
    override var providerRequest: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest = js.native
    /** Gets the web provider token responses. */
    /* CompleteClass */
    override var providerResponses: IVector[
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
  @js.native
  abstract class WebAccountProviderRetrieveCookiesOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderRetrieveCookiesOperation {
    /** Gets the app callback Uri. */
    /* CompleteClass */
    override var applicationCallbackUri: Uri = js.native
    /** Gets the context of the retrieve cookies operation. */
    /* CompleteClass */
    override var context: Uri = js.native
    /** Gets the cookies. */
    /* CompleteClass */
    override var cookies: IVector[HttpCookie] = js.native
    /** Gets the kind of web account provider operation. */
    /* CompleteClass */
    override var kind: WebAccountProviderOperationKind = js.native
    /** Gets or sets the Uri to retrieve cookies from. */
    /* CompleteClass */
    override var uri: Uri = js.native
    /** Informs the activating app that the operation completed successfully. */
    /* CompleteClass */
    override def reportCompleted(): Unit = js.native
    /**
      * Informs the activating app that the operation encountered an error.
      * @param value The type of error encountered.
      */
    /* CompleteClass */
    override def reportError(value: WebProviderError): Unit = js.native
  }
  
  /** Represents a sign out account operation made by a web account provider. */
  @js.native
  abstract class WebAccountProviderSignOutAccountOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderSignOutAccountOperation {
    /** Gets the app callback Uri. */
    /* CompleteClass */
    override var applicationCallbackUri: Uri = js.native
    /** Gets the client Id. */
    /* CompleteClass */
    override var clientId: String = js.native
    /** Gets the kind of web account provider operation. */
    /* CompleteClass */
    override var kind: WebAccountProviderOperationKind = js.native
    /** Gets the web account to sign out. */
    /* CompleteClass */
    override var webAccount: WebAccount = js.native
    /** Informs the activating app that the operation completed successfully. */
    /* CompleteClass */
    override def reportCompleted(): Unit = js.native
    /**
      * Informs the activating app that the operation encountered an error.
      * @param value The type of error encountered.
      */
    /* CompleteClass */
    override def reportError(value: WebProviderError): Unit = js.native
  }
  
  /** Provides information about a web account provider trigger. */
  @js.native
  abstract class WebAccountProviderTriggerDetails ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderTriggerDetails {
    /** Gets the web account provider operation. */
    /* CompleteClass */
    override var operation: IWebAccountProviderOperation = js.native
  }
  
  /** Represents a request for a token from a client to a provider. */
  @js.native
  abstract class WebProviderTokenRequest ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenRequest {
    /** Gets the app callback Uri. */
    /* CompleteClass */
    override var applicationCallbackUri: Uri = js.native
    /** Gets the web token request made by the client. */
    /* CompleteClass */
    override var clientRequest: WebTokenRequest = js.native
    /** Gets the web account selection options. */
    /* CompleteClass */
    override var webAccountSelectionOptions: WebAccountSelectionOptions = js.native
    /** Gets the web accounts for the request. */
    /* CompleteClass */
    override var webAccounts: IVectorView[WebAccount] = js.native
    /**
      * Gets a token binding key for the app asynchronously.
      * @param keyType The type of key to get.
      * @param target The target Uri.
      * @return When this method completes, it returns a cryptographic key.
      */
    /* CompleteClass */
    override def getApplicationTokenBindingKeyAsync(keyType: typings.winrtUwp.Windows.Security.Authentication.Web.TokenBindingKeyType, target: Uri): IPromiseWithIAsyncOperation[CryptographicKey] = js.native
  }
  
  /** Represents a web provider token response. */
  @js.native
  class WebProviderTokenResponse protected ()
    extends typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebProviderTokenResponse {
    /**
      * Creates a new instance of the WebProviderTokenResponse class.
      * @param webTokenResponse The web token response from the client.
      */
    def this(webTokenResponse: WebTokenResponse) = this()
    /** Gets the response from the provider to the client. */
    /* CompleteClass */
    override var clientResponse: WebTokenResponse = js.native
  }
  
  /** Represents the levels of information about a web account shown to the client. */
  @js.native
  object WebAccountClientViewType extends js.Object {
    /* 1 */ val idAndProperties: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idAndProperties with Double = js.native
    /* 0 */ val idOnly: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType.idOnly with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountClientViewType with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object WebAccountManager extends js.Object {
    /**
      * Adds a new web account asynchronously with three inputs.
      * @param webAccountId The Id for the web account.
      * @param webAccountUserName The user name for the web account.
      * @param props Properties for the web account.
      * @return When this method completes, it returns the new web account.
      */
    def addWebAccountAsync(webAccountId: String, webAccountUserName: String, props: IMapView[String, String]): IPromiseWithIAsyncOperation[WebAccount] = js.native
    /**
      * Adds a new web account asynchronously with four inputs.
      * @param webAccountId The Id for the web account.
      * @param webAccountUserName The user name for the web account.
      * @param props Properties for the web account.
      * @param scope The scope of the web account.
      * @return When this method completes, it returns the new web account.
      */
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
    def clearViewAsync(webAccount: WebAccount, applicationCallbackUri: Uri): IPromiseWithIAsyncAction = js.native
    /**
      * Clears a web account picture asynchronously.
      * @param webAccount The web account to clear the picture from.
      * @return This method does not return a value.
      */
    def clearWebAccountPictureAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
    /**
      * Deletes a web account asynchronously.
      * @param webAccount The WebAccount to delete.
      * @return This method does not return a value.
      */
    def deleteWebAccountAsync(webAccount: WebAccount): IPromiseWithIAsyncAction = js.native
    /**
      * Finds all provider web accounts asynchronously.
      * @return When this method completes, it returns all provider web accounts.
      */
    def findAllProviderWebAccountsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Gets the scope of the web account.
      * @param webAccount The web account to get scope for.
      * @return The scope of the web account.
      */
    def getScope(webAccount: WebAccount): WebAccountScope = js.native
    /**
      * Gets the views for a web account asynchronously.
      * @param webAccount The web account to get views for.
      * @return When this method completes, it returns the views for the web account.
      */
    def getViewsAsync(webAccount: WebAccount): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Pulls cookies asynchronously. Use this to enable single sign-on in an app after a user has entered their credentials into a web browser.
      * @param uriString The Uri to pull cookies from.
      * @param callerPFN The caller's package family name.
      * @return This method does not return a value.
      */
    def pullCookiesAsync(uriString: String, callerPFN: String): IPromiseWithIAsyncAction = js.native
    /**
      * Pushes cookies asynchronously. Use this to enable single sign-on for a web account in a browser after the user has entered their credentials into the app.
      * @param uri The Uri to push the cookies to.
      * @param cookies The cookies to push.
      * @return This method does not return a value.
      */
    def pushCookiesAsync(uri: Uri, cookies: IVectorView[HttpCookie]): IPromiseWithIAsyncAction = js.native
    /**
      * Sets the scope of a web account asynchronously.
      * @param webAccount The web account to set scope for.
      * @param scope The scope to set.
      * @return This method does not return a value.
      */
    def setScopeAsync(webAccount: WebAccount, scope: WebAccountScope): IPromiseWithIAsyncAction = js.native
    /**
      * Sets the view for a web account asynchronously.
      * @param webAccount The web account to set the view for.
      * @param view The view to set.
      * @return This method does not return a value.
      */
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
    def setWebAccountPictureAsync(webAccount: WebAccount, webAccountPicture: IRandomAccessStream): IPromiseWithIAsyncAction = js.native
    /**
      * Updates the properties of a web account asynchronously.
      * @param webAccount The web account to update.
      * @param webAccountUserName The username to update.
      * @param additionalProperties The properties to update.
      * @return This method does not return a value.
      */
    def updateWebAccountPropertiesAsync(webAccount: WebAccount, webAccountUserName: String, additionalProperties: IMapView[String, String]): IPromiseWithIAsyncAction = js.native
  }
  
  /** Represents different operations a web account provider can perform. Use this to determine what operation to perform when the provider is activated. */
  @js.native
  object WebAccountProviderOperationKind extends js.Object {
    /* 2 */ val addAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.addAccount with Double = js.native
    /* 4 */ val deleteAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.deleteAccount with Double = js.native
    /* 1 */ val getTokenSilently: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.getTokenSilently with Double = js.native
    /* 3 */ val manageAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.manageAccount with Double = js.native
    /* 0 */ val requestToken: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.requestToken with Double = js.native
    /* 5 */ val retrieveCookies: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.retrieveCookies with Double = js.native
    /* 6 */ val signOutAccount: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind.signOutAccount with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountProviderOperationKind with Double
      ] = js.native
  }
  
  /** Represents the scope of a web account. */
  @js.native
  object WebAccountScope extends js.Object {
    /* 1 */ val perApplication: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perApplication with Double = js.native
    /* 0 */ val perUser: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope.perUser with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountScope with Double
      ] = js.native
  }
  
  /** Represents web account selection options. Use this to support the use of multiple web accounts in an app, where user might choose to log in with an existing account or add a new account. */
  @js.native
  object WebAccountSelectionOptions extends js.Object {
    /* 0 */ val default: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.default with Double = js.native
    /* 1 */ val `new`: typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions.`new` with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.Web.Provider.WebAccountSelectionOptions with Double
      ] = js.native
  }
  
}

