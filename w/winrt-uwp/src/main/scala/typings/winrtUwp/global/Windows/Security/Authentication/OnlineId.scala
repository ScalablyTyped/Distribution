package typings.winrtUwp.global.Windows.Security.Authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables both apps and desktop programs to use Live to authenticate users by using their Microsoft account. After authentication, apps can get back a JSON token with an ID that can be used for that user with your application. */
@JSGlobal("Windows.Security.Authentication.OnlineId")
@js.native
object OnlineId extends js.Object {
  
  /** Provides the ability to control when to show or hide the credential prompt user interface. This includes the user interface for the app to collect user consent to access data stored in Live. The user must see the user interface in order for the app to obtain any user data, if not app will see an error when they try to obtain user data. */
  @js.native
  object CredentialPromptType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType with Double
      ] = js.native
    
    /* 2 */ val doNotPrompt: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.doNotPrompt with Double = js.native
    
    /* 0 */ val promptIfNeeded: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.promptIfNeeded with Double = js.native
    
    /* 1 */ val retypeCredentials: typings.winrtUwp.Windows.Security.Authentication.OnlineId.CredentialPromptType.retypeCredentials with Double = js.native
  }
  
  /** Provides an app with the ability to start the authentication request to get JavaScript Object Notation (JSON) tokens to use with your service or request tickets that can be used to get data that the user has consented to for your app using the Live Connect APIs. */
  @js.native
  /** Creates an instance of the OnlineIdAuthenticator . */
  class OnlineIdAuthenticator ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator
  
  /** Contains the ticket that is obtained after the user authenticates to this app or has provided consent to access user data stored in Live. */
  @js.native
  abstract class OnlineIdServiceTicket ()
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.OnlineIdServiceTicket
  
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
    extends typings.winrtUwp.Windows.Security.Authentication.OnlineId.UserIdentity
}
