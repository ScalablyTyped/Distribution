package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOnlineIdAuthenticator extends js.Object {
  var applicationId: java.lang.String = js.native
  var authenticatedSafeCustomerId: java.lang.String = js.native
  var canSignOut: scala.Boolean = js.native
  def authenticateUserAsync(
    requests: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[OnlineIdServiceTicketRequest],
    credentialPromptType: CredentialPromptType
  ): UserAuthenticationOperation = js.native
  def authenticateUserAsync(request: OnlineIdServiceTicketRequest): UserAuthenticationOperation = js.native
  def signOutUserAsync(): SignOutUserOperation = js.native
}

