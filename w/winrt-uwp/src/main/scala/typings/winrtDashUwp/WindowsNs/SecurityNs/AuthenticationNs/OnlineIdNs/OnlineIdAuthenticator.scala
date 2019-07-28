package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an app with the ability to start the authentication request to get JavaScript Object Notation (JSON) tokens to use with your service or request tickets that can be used to get data that the user has consented to for your app using the Live Connect APIs. */
@JSGlobal("Windows.Security.Authentication.OnlineId.OnlineIdAuthenticator")
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

