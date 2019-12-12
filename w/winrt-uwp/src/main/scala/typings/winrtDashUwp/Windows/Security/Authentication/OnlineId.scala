package typings.winrtDashUwp.Windows.Security.Authentication

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtDashUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtDashUwp.Windows.Foundation.AsyncStatus
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IAsyncAction
import typings.winrtDashUwp.Windows.Foundation.IAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithOperation
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.SignOutUserOperation
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.UserAuthenticationOperation
import typings.winrtDashUwp.Windows.Security.Authentication.OnlineId.UserIdentity
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables both apps and desktop programs to use Live to authenticate users by using their Microsoft account. After authentication, apps can get back a JSON token with an ID that can be used for that user with your application. */
@JSGlobal("Windows.Security.Authentication.OnlineId")
@js.native
object OnlineId extends js.Object {
  @js.native
  sealed trait CredentialPromptType extends js.Object
  
  /** Provides an app with the ability to start the authentication request to get JavaScript Object Notation (JSON) tokens to use with your service or request tickets that can be used to get data that the user has consented to for your app using the Live Connect APIs. */
  @js.native
  /** Creates an instance of the OnlineIdAuthenticator . */
  class OnlineIdAuthenticator () extends js.Object {
    /** Returns the ID of the application as a GUID. */
    var applicationId: String = js.native
    /** Returns the ID of a user who has been successfully authenticated for your app. */
    var authenticatedSafeCustomerId: String = js.native
    /** Indicates whether a user can sign out of the app, and whether to show the sign out link in the app. */
    var canSignOut: Boolean = js.native
    /**
      * Starts the async authentication request with multiple OnlineIdServiceTicketRequests and provides the ability to control the user experience by setting the CredentialPromptType to get the tickets. If a user is signed into a Windows 8 system with a Microsoft account, this user will be used for the authentication request.
      * @param requests A collection of requests.
      * @param credentialPromptType The type of credentials.
      * @return An object representing the authentication operation.
      */
    def authenticateUserAsync(requests: IIterable[OnlineIdServiceTicketRequest], credentialPromptType: CredentialPromptType): IPromiseWithOperation[_, UserAuthenticationOperation] = js.native
    /**
      * Starts the async authentication request with one OnlineIdServiceTicketRequest . If a user is signed into a Windows 8 system with a Microsoft account, this user will be used for the authentication request.
      * @param request A request object that provides the ability for an app to specify the service and policy used to authenticate a Live user to obtain identity properties and tickets.
      * @return An object representing the authentication operation.
      */
    def authenticateUserAsync(request: OnlineIdServiceTicketRequest): IPromiseWithOperation[_, UserAuthenticationOperation] = js.native
    /**
      * Allows users to sign out of your app.
      * @return An object that contains additional information about the why the user signed out.
      */
    def signOutUserAsync(): IPromiseWithOperation[_, SignOutUserOperation] = js.native
  }
  
  /** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
  @js.native
  abstract class OnlineIdServiceTicket () extends js.Object {
    /** If there was an error in obtaining the ticket, then the error code is captured here. */
    var errorCode: Double = js.native
    /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
    var request: OnlineIdServiceTicketRequest = js.native
    /** The ticket. */
    var value: String = js.native
  }
  
  /** Provides the ability for an app to specify the service and policy that is used to authenticate a Live user to obtain identity properties and tickets. */
  @js.native
  class OnlineIdServiceTicketRequest protected () extends js.Object {
    /**
      * Creates an instance of the OnlineIdServiceTicketRequest class.
      * @param service The service for the request.
      */
    def this(service: String) = this()
    /**
      * Creates an instance of the OnlineIdServiceTicketRequest class.
      * @param service The service for the request.
      * @param policy The policy for the request.
      */
    def this(service: String, policy: String) = this()
    /** The policy used to authenticate users. Supported values are JWT, which returns data using the JSON format. For apps that are requesting user consent to access stored in Live, app developer must pass a policy of DELEGATION. */
    var policy: String = js.native
    /** Identifies the service your app uses. The service name must match the DNS name you supplied when registering your app on http://go.microsoft.com/fwlink/p/?linkid=241860. Tickets are issued only for this service. For apps that are requesting user consent to access stored in Live, you must pass the offers to which your app needs access. The available list of offers can be found at our Scopes and Permissions page. The ticket can then be used with the Live Connect REST apis to access data that a user has consented to give to the app. Check out our REST APIs topic to learn more. Alternatively, the app can use the Live Connect SDK which will make these calls itself. */
    var service: String = js.native
  }
  
  /** Allows users to sign out of your app. */
  @js.native
  abstract class SignOutUserOperation () extends js.Object {
    /** Gets or sets a handler that is called when the operation completes. */
    @JSName("completed")
    var completed_Original: AsyncActionCompletedHandler = js.native
    /** Gets the error code should the operation fail. */
    var errorCode: WinRTError = js.native
    /** Gets a unique identifier that represents the operation. */
    var id: Double = js.native
    /** Gets the current status of the operation. */
    var status: AsyncStatus = js.native
    /** Requests the cancellation of the operation. */
    def cancel(): Unit = js.native
    /** Requests that work associated with the operation should terminate. */
    def close(): Unit = js.native
    /** Gets or sets a handler that is called when the operation completes. */
    def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
    /** Returns the results of the operation. For this class, there are no results to return if the operation succeeds. */
    def getResults(): Unit = js.native
  }
  
  /** Asynchronously gets the user's identity and corresponding tickets and properties. */
  @js.native
  abstract class UserAuthenticationOperation () extends js.Object {
    /** Gets or sets a handler that's called when the operation completes. */
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[UserIdentity] = js.native
    /** Gets the error code should the operation fail. */
    var errorCode: WinRTError = js.native
    /** Gets a unique identifier that represents the operation. */
    var id: Double = js.native
    /** Gets the current status of the operation. */
    var status: AsyncStatus = js.native
    /** Requests the cancellation of the operation. */
    def cancel(): Unit = js.native
    /** Requests that work associated with the operation should terminate. */
    def close(): Unit = js.native
    /** Gets or sets a handler that's called when the operation completes. */
    def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit = js.native
    /**
      * Returns a UserIdentity object that contains information about the user.
      * @return An object containing information about the user's identity.
      */
    def getResults(): UserIdentity = js.native
  }
  
  /** Contains the ID, tickets, and other information associated with a user. */
  @js.native
  abstract class UserIdentity () extends js.Object {
    /** Contains the first name of the user. This value is available only to Microsoft application partners. */
    var firstName: String = js.native
    /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
    var id: String = js.native
    /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
    var isBetaAccount: Boolean = js.native
    /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
    var isConfirmedPC: Boolean = js.native
    /** Contains the user's last name. This value is available only to Microsoft application partners. */
    var lastName: String = js.native
    /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
    var safeCustomerId: String = js.native
    /** The sign in name of the user. This value is available only to Microsoft application partners. */
    var signInName: String = js.native
    /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
    var tickets: IVectorView[OnlineIdServiceTicket] = js.native
  }
  
  /** Provides the ability to control when to show or hide the credential prompt user interface. This includes the user interface for the app to collect user consent to access data stored in Live. The user must see the user interface in order for the app to obtain any user data, if not app will see an error when they try to obtain user data. */
  @js.native
  object CredentialPromptType extends js.Object {
    /** Never show the UI, even if an error occurs. */
    @js.native
    sealed trait doNotPrompt extends CredentialPromptType
    
    /** Show the UI only if an error occurred. */
    @js.native
    sealed trait promptIfNeeded extends CredentialPromptType
    
    /** Always show the UI. If a default username exists, the username is automatically inserted into the appropriate field. */
    @js.native
    sealed trait retypeCredentials extends CredentialPromptType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CredentialPromptType with Double] = js.native
    /* 2 */ @js.native
    object doNotPrompt extends TopLevel[doNotPrompt with Double]
    
    /* 0 */ @js.native
    object promptIfNeeded extends TopLevel[promptIfNeeded with Double]
    
    /* 1 */ @js.native
    object retypeCredentials extends TopLevel[retypeCredentials with Double]
    
  }
  
}

