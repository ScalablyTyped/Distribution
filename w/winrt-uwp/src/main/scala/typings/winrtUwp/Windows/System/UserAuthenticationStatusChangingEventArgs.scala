package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a user authentication status changing event. */
trait UserAuthenticationStatusChangingEventArgs extends js.Object {
  /** Gets the user's current authentication status. */
  var currentStatus: UserAuthenticationStatus
  /** Gets the user's new authentication status. */
  var newStatus: UserAuthenticationStatus
  /** Gets the user. */
  var user: User
  /**
    * Requests a delay before the user's authentication status changes.
    * @return The user authentication status change deferral.
    */
  def getDeferral(): UserAuthenticationStatusChangeDeferral
}

object UserAuthenticationStatusChangingEventArgs {
  @scala.inline
  def apply(
    currentStatus: UserAuthenticationStatus,
    getDeferral: () => UserAuthenticationStatusChangeDeferral,
    newStatus: UserAuthenticationStatus,
    user: User
  ): UserAuthenticationStatusChangingEventArgs = {
    val __obj = js.Dynamic.literal(currentStatus = currentStatus.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), newStatus = newStatus.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAuthenticationStatusChangingEventArgs]
  }
}

