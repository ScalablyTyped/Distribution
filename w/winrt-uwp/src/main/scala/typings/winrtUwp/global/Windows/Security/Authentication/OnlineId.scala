package typings.winrtUwp.global.Windows.Security.Authentication

import typings.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables both apps and desktop programs to use Live to authenticate users by using their Microsoft account. After authentication, apps can get back a JSON token with an ID that can be used for that user with your application. */
object OnlineId {
  
  /** Provides the ability to control when to show or hide the credential prompt user interface. This includes the user interface for the app to collect user consent to access data stored in Live. The user must see the user interface in order for the app to obtain any user data, if not app will see an error when they try to obtain user data. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.CredentialPromptType")
  @js.native
  object CredentialPromptType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType & Double
      ] = js.native
    
    /* 2 */ val doNotPrompt: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt & Double = js.native
    
    /* 0 */ val promptIfNeeded: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded & Double = js.native
    
    /* 1 */ val retypeCredentials: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials & Double = js.native
  }
  
  /** Provides an app with the ability to start the authentication request to get JavaScript Object Notation (JSON) tokens to use with your service or request tickets that can be used to get data that the user has consented to for your app using the Live Connect APIs. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator")
  @js.native
  /** Creates an instance of the OnlineIdAuthenticator . */
  open class OnlineIdAuthenticator ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator
  
  /** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket")
  @js.native
  abstract class OnlineIdServiceTicket ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket {
    
    /** If there was an error in obtaining the ticket, then the error code is captured here. */
    /* CompleteClass */
    var errorCode: Double = js.native
    
    /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest = js.native
    
    /** The ticket. */
    /* CompleteClass */
    var value: String = js.native
  }
  
  /** Provides the ability for an app to specify the service and policy that is used to authenticate a Live user to obtain identity properties and tickets. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest")
  @js.native
  open class OnlineIdServiceTicketRequest protected ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest {
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
    /* CompleteClass */
    var policy: String = js.native
    
    /** Identifies the service your app uses. The service name must match the DNS name you supplied when registering your app on http://go.microsoft.com/fwlink/p/?linkid=241860. Tickets are issued only for this service. For apps that are requesting user consent to access stored in Live, you must pass the offers to which your app needs access. The available list of offers can be found at our Scopes and Permissions page. The ticket can then be used with the Live Connect REST apis to access data that a user has consented to give to the app. Check out our REST APIs topic to learn more. Alternatively, the app can use the Live Connect SDK which will make these calls itself. */
    /* CompleteClass */
    var service: String = js.native
  }
  
  /** Allows users to sign out of your app. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.SignOutUserOperation")
  @js.native
  abstract class SignOutUserOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.OnlineId.SignOutUserOperation {
    
    /** Requests the cancellation of the operation. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Requests that work associated with the operation should terminate. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets a handler that is called when the operation completes. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
    /** Gets or sets a handler that is called when the operation completes. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncActionCompletedHandler = js.native
    
    /** Gets the error code should the operation fail. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /** Returns the results of the operation. For this class, there are no results to return if the operation succeeds. */
    /* CompleteClass */
    override def getResults(): Unit = js.native
    
    /** Gets a unique identifier that represents the operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Gets the current status of the operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Asynchronously gets the user's identity and corresponding tickets and properties. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.UserAuthenticationOperation")
  @js.native
  abstract class UserAuthenticationOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserAuthenticationOperation {
    
    /** Requests the cancellation of the operation. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Requests that work associated with the operation should terminate. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets a handler that's called when the operation completes. */
    /* CompleteClass */
    override def completed(
      asyncInfo: IAsyncOperation[typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserIdentity],
      asyncStatus: AsyncStatus
    ): Unit = js.native
    /** Gets or sets a handler that's called when the operation completes. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserIdentity] = js.native
    
    /** Gets the error code should the operation fail. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /**
      * Returns a UserIdentity object that contains information about the user.
      * @return An object containing information about the user's identity.
      */
    /* CompleteClass */
    override def getResults(): typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserIdentity = js.native
    
    /** Gets a unique identifier that represents the operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Gets the current status of the operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Contains the ID, tickets, and other information associated with a user. */
  @JSGlobal("Windows.Security.Authentication.OnlineId.UserIdentity")
  @js.native
  abstract class UserIdentity ()
    extends StObject
       with typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserIdentity {
    
    /** Contains the first name of the user. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    var firstName: String = js.native
    
    /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    var id: String = js.native
    
    /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    var isBetaAccount: Boolean = js.native
    
    /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    var isConfirmedPC: Boolean = js.native
    
    /** Contains the user's last name. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    var lastName: String = js.native
    
    /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
    /* CompleteClass */
    var safeCustomerId: String = js.native
    
    /** The sign in name of the user. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    var signInName: String = js.native
    
    /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
    /* CompleteClass */
    var tickets: IVectorView[typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket] = js.native
  }
}
