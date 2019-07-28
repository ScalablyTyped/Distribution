package typings.winrtDashUwp.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a user authentication status changing event. */
@JSGlobal("Windows.System.UserAuthenticationStatusChangingEventArgs")
@js.native
abstract class UserAuthenticationStatusChangingEventArgs () extends js.Object {
  /** Gets the user's current authentication status. */
  var currentStatus: UserAuthenticationStatus = js.native
  /** Gets the user's new authentication status. */
  var newStatus: UserAuthenticationStatus = js.native
  /** Gets the user. */
  var user: User = js.native
  /**
    * Requests a delay before the user's authentication status changes.
    * @return The user authentication status change deferral.
    */
  def getDeferral(): UserAuthenticationStatusChangeDeferral = js.native
}

