package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOnlineIdAuthenticator extends js.Object {
  var applicationId: String = js.native
  var authenticatedSafeCustomerId: String = js.native
  var canSignOut: Boolean = js.native
  def authenticateUserAsync(requests: IIterable[OnlineIdServiceTicketRequest], credentialPromptType: CredentialPromptType): UserAuthenticationOperation = js.native
  def authenticateUserAsync(request: OnlineIdServiceTicketRequest): UserAuthenticationOperation = js.native
  def signOutUserAsync(): SignOutUserOperation = js.native
}

