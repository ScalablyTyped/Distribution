package typings.winrtUwp.Windows.Security.Authentication

import typings.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithOperation
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables both apps and desktop programs to use Live to authenticate users by using their Microsoft account. After authentication, apps can get back a JSON token with an ID that can be used for that user with your application. */
object OnlineId {
  
  @js.native
  sealed trait CredentialPromptType extends StObject
  /** Provides the ability to control when to show or hide the credential prompt user interface. This includes the user interface for the app to collect user consent to access data stored in Live. The user must see the user interface in order for the app to obtain any user data, if not app will see an error when they try to obtain user data. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
  @js.native
  object CredentialPromptType extends StObject {
    
    /** Never show the UI, even if an error occurs. */
    @js.native
    sealed trait doNotPrompt
      extends StObject
         with CredentialPromptType
    
    /** Show the UI only if an error occurred. */
    @js.native
    sealed trait promptIfNeeded
      extends StObject
         with CredentialPromptType
    
    /** Always show the UI. If a default username exists, the username is automatically inserted into the appropriate field. */
    @js.native
    sealed trait retypeCredentials
      extends StObject
         with CredentialPromptType
  }
  
  /** Provides an app with the ability to start the authentication request to get JavaScript Object Notation (JSON) tokens to use with your service or request tickets that can be used to get data that the user has consented to for your app using the Live Connect APIs. */
  @js.native
  trait OnlineIdAuthenticator extends StObject {
    
    /** Returns the ID of the application as a GUID. */
    var applicationId: String = js.native
    
    /**
      * Starts the async authentication request with multiple OnlineIdServiceTicketRequests and provides the ability to control the user experience by setting the CredentialPromptType to get the tickets. If a user is signed into a Windows 8 system with a Microsoft account, this user will be used for the authentication request.
      * @param requests A collection of requests.
      * @param credentialPromptType The type of credentials.
      * @return An object representing the authentication operation.
      */
    def authenticateUserAsync(requests: IIterable[OnlineIdServiceTicketRequest], credentialPromptType: CredentialPromptType): IPromiseWithOperation[js.Any, UserAuthenticationOperation] = js.native
    /**
      * Starts the async authentication request with one OnlineIdServiceTicketRequest . If a user is signed into a Windows 8 system with a Microsoft account, this user will be used for the authentication request.
      * @param request A request object that provides the ability for an app to specify the service and policy used to authenticate a Live user to obtain identity properties and tickets.
      * @return An object representing the authentication operation.
      */
    def authenticateUserAsync(request: OnlineIdServiceTicketRequest): IPromiseWithOperation[js.Any, UserAuthenticationOperation] = js.native
    
    /** Returns the ID of a user who has been successfully authenticated for your app. */
    var authenticatedSafeCustomerId: String = js.native
    
    /** Indicates whether a user can sign out of the app, and whether to show the sign out link in the app. */
    var canSignOut: Boolean = js.native
    
    /**
      * Allows users to sign out of your app.
      * @return An object that contains additional information about the why the user signed out.
      */
    def signOutUserAsync(): IPromiseWithOperation[js.Any, SignOutUserOperation] = js.native
  }
  
  /** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
  trait OnlineIdServiceTicket extends StObject {
    
    /** If there was an error in obtaining the ticket, then the error code is captured here. */
    var errorCode: Double
    
    /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
    var request: OnlineIdServiceTicketRequest
    
    /** The ticket. */
    var value: String
  }
  object OnlineIdServiceTicket {
    
    @scala.inline
    def apply(errorCode: Double, request: OnlineIdServiceTicketRequest, value: String): OnlineIdServiceTicket = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlineIdServiceTicket]
    }
    
    @scala.inline
    implicit class OnlineIdServiceTicketMutableBuilder[Self <: OnlineIdServiceTicket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: OnlineIdServiceTicketRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** Provides the ability for an app to specify the service and policy that is used to authenticate a Live user to obtain identity properties and tickets. */
  trait OnlineIdServiceTicketRequest extends StObject {
    
    /** The policy used to authenticate users. Supported values are JWT, which returns data using the JSON format. For apps that are requesting user consent to access stored in Live, app developer must pass a policy of DELEGATION. */
    var policy: String
    
    /** Identifies the service your app uses. The service name must match the DNS name you supplied when registering your app on http://go.microsoft.com/fwlink/p/?linkid=241860. Tickets are issued only for this service. For apps that are requesting user consent to access stored in Live, you must pass the offers to which your app needs access. The available list of offers can be found at our Scopes and Permissions page. The ticket can then be used with the Live Connect REST apis to access data that a user has consented to give to the app. Check out our REST APIs topic to learn more. Alternatively, the app can use the Live Connect SDK which will make these calls itself. */
    var service: String
  }
  object OnlineIdServiceTicketRequest {
    
    @scala.inline
    def apply(policy: String, service: String): OnlineIdServiceTicketRequest = {
      val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnlineIdServiceTicketRequest]
    }
    
    @scala.inline
    implicit class OnlineIdServiceTicketRequestMutableBuilder[Self <: OnlineIdServiceTicketRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  /** Allows users to sign out of your app. */
  trait SignOutUserOperation extends StObject {
    
    /** Requests the cancellation of the operation. */
    def cancel(): Unit
    
    /** Requests that work associated with the operation should terminate. */
    def close(): Unit
    
    /** Gets or sets a handler that is called when the operation completes. */
    def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit
    /** Gets or sets a handler that is called when the operation completes. */
    @JSName("completed")
    var completed_Original: AsyncActionCompletedHandler
    
    /** Gets the error code should the operation fail. */
    var errorCode: WinRTError
    
    /** Returns the results of the operation. For this class, there are no results to return if the operation succeeds. */
    def getResults(): Unit
    
    /** Gets a unique identifier that represents the operation. */
    var id: Double
    
    /** Gets the current status of the operation. */
    var status: AsyncStatus
  }
  object SignOutUserOperation {
    
    @scala.inline
    def apply(
      cancel: () => Unit,
      close: () => Unit,
      completed: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit,
      errorCode: WinRTError,
      getResults: () => Unit,
      id: Double,
      status: AsyncStatus
    ): SignOutUserOperation = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOutUserOperation]
    }
    
    @scala.inline
    implicit class SignOutUserOperationMutableBuilder[Self <: SignOutUserOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleted(value: (/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetResults(value: () => Unit): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Asynchronously gets the user's identity and corresponding tickets and properties. */
  trait UserAuthenticationOperation extends StObject {
    
    /** Requests the cancellation of the operation. */
    def cancel(): Unit
    
    /** Requests that work associated with the operation should terminate. */
    def close(): Unit
    
    /** Gets or sets a handler that's called when the operation completes. */
    def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit
    /** Gets or sets a handler that's called when the operation completes. */
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[UserIdentity]
    
    /** Gets the error code should the operation fail. */
    var errorCode: WinRTError
    
    /**
      * Returns a UserIdentity object that contains information about the user.
      * @return An object containing information about the user's identity.
      */
    def getResults(): UserIdentity
    
    /** Gets a unique identifier that represents the operation. */
    var id: Double
    
    /** Gets the current status of the operation. */
    var status: AsyncStatus
  }
  object UserAuthenticationOperation {
    
    @scala.inline
    def apply(
      cancel: () => Unit,
      close: () => Unit,
      completed: (/* asyncInfo */ IAsyncOperation[UserIdentity], /* asyncStatus */ AsyncStatus) => Unit,
      errorCode: WinRTError,
      getResults: () => UserIdentity,
      id: Double,
      status: AsyncStatus
    ): UserAuthenticationOperation = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), close = js.Any.fromFunction0(close), completed = js.Any.fromFunction2(completed), errorCode = errorCode.asInstanceOf[js.Any], getResults = js.Any.fromFunction0(getResults), id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAuthenticationOperation]
    }
    
    @scala.inline
    implicit class UserAuthenticationOperationMutableBuilder[Self <: UserAuthenticationOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCompleted(value: (/* asyncInfo */ IAsyncOperation[UserIdentity], /* asyncStatus */ AsyncStatus) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorCode(value: WinRTError): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetResults(value: () => UserIdentity): Self = StObject.set(x, "getResults", js.Any.fromFunction0(value))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: AsyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Contains the ID, tickets, and other information associated with a user. */
  trait UserIdentity extends StObject {
    
    /** Contains the first name of the user. This value is available only to Microsoft application partners. */
    var firstName: String
    
    /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
    var id: String
    
    /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
    var isBetaAccount: Boolean
    
    /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
    var isConfirmedPC: Boolean
    
    /** Contains the user's last name. This value is available only to Microsoft application partners. */
    var lastName: String
    
    /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
    var safeCustomerId: String
    
    /** The sign in name of the user. This value is available only to Microsoft application partners. */
    var signInName: String
    
    /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
    var tickets: IVectorView[OnlineIdServiceTicket]
  }
  object UserIdentity {
    
    @scala.inline
    def apply(
      firstName: String,
      id: String,
      isBetaAccount: Boolean,
      isConfirmedPC: Boolean,
      lastName: String,
      safeCustomerId: String,
      signInName: String,
      tickets: IVectorView[OnlineIdServiceTicket]
    ): UserIdentity = {
      val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserIdentity]
    }
    
    @scala.inline
    implicit class UserIdentityMutableBuilder[Self <: UserIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBetaAccount(value: Boolean): Self = StObject.set(x, "isBetaAccount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsConfirmedPC(value: Boolean): Self = StObject.set(x, "isConfirmedPC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeCustomerId(value: String): Self = StObject.set(x, "safeCustomerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignInName(value: String): Self = StObject.set(x, "signInName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickets(value: IVectorView[OnlineIdServiceTicket]): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    }
  }
}
