package typings.winrtUwp.global.Windows.Security.Authentication

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables both apps and desktop programs to use Live to authenticate users by using their Microsoft account. After authentication, apps can get back a JSON token with an ID that can be used for that user with your application. */
@JSGlobal("Windows.Security.Authentication.OnlineId")
@js.native
object OnlineId extends js.Object {
  /** Provides an app with the ability to start the authentication request to get JavaScript Object Notation (JSON) tokens to use with your service or request tickets that can be used to get data that the user has consented to for your app using the Live Connect APIs. */
  @js.native
  /** Creates an instance of the OnlineIdAuthenticator . */
  class OnlineIdAuthenticator ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator
  
  /** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
  @js.native
  abstract class OnlineIdServiceTicket ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket {
    /** If there was an error in obtaining the ticket, then the error code is captured here. */
    /* CompleteClass */
    override var errorCode: Double = js.native
    /** Represents the OnlineIdServiceTicketRequest for which the ticket was obtained. */
    /* CompleteClass */
    override var request: typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest = js.native
    /** The ticket. */
    /* CompleteClass */
    override var value: String = js.native
  }
  
  /** Provides the ability for an app to specify the service and policy that is used to authenticate a Live user to obtain identity properties and tickets. */
  @js.native
  class OnlineIdServiceTicketRequest protected ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicketRequest {
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
    override var policy: String = js.native
    /** Identifies the service your app uses. The service name must match the DNS name you supplied when registering your app on http://go.microsoft.com/fwlink/p/?linkid=241860. Tickets are issued only for this service. For apps that are requesting user consent to access stored in Live, you must pass the offers to which your app needs access. The available list of offers can be found at our Scopes and Permissions page. The ticket can then be used with the Live Connect REST apis to access data that a user has consented to give to the app. Check out our REST APIs topic to learn more. Alternatively, the app can use the Live Connect SDK which will make these calls itself. */
    /* CompleteClass */
    override var service: String = js.native
  }
  
  /** Allows users to sign out of your app. */
  @js.native
  abstract class SignOutUserOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.SignOutUserOperation
  
  /** Asynchronously gets the user's identity and corresponding tickets and properties. */
  @js.native
  abstract class UserAuthenticationOperation ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserAuthenticationOperation
  
  /** Contains the ID, tickets, and other information associated with a user. */
  @js.native
  abstract class UserIdentity ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserIdentity {
    /** Contains the first name of the user. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    override var firstName: String = js.native
    /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    override var id: String = js.native
    /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    override var isBetaAccount: Boolean = js.native
    /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    override var isConfirmedPC: Boolean = js.native
    /** Contains the user's last name. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    override var lastName: String = js.native
    /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
    /* CompleteClass */
    override var safeCustomerId: String = js.native
    /** The sign in name of the user. This value is available only to Microsoft application partners. */
    /* CompleteClass */
    override var signInName: String = js.native
    /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
    /* CompleteClass */
    override var tickets: IVectorView[typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket] = js.native
  }
  
  /** Provides the ability to control when to show or hide the credential prompt user interface. This includes the user interface for the app to collect user consent to access data stored in Live. The user must see the user interface in order for the app to obtain any user data, if not app will see an error when they try to obtain user data. */
  @js.native
  object CredentialPromptType extends js.Object {
    /* 2 */ val doNotPrompt: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt with Double = js.native
    /* 0 */ val promptIfNeeded: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded with Double = js.native
    /* 1 */ val retypeCredentials: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType with Double
      ] = js.native
  }
  
}

