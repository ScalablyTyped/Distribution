package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a user authentication status changing event. */
@js.native
trait UserAuthenticationStatusChangingEventArgs extends js.Object {
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
  @scala.inline
  implicit class UserAuthenticationStatusChangingEventArgsOps[Self <: UserAuthenticationStatusChangingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentStatus(value: UserAuthenticationStatus): Self = this.set("currentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => UserAuthenticationStatusChangeDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setNewStatus(value: UserAuthenticationStatus): Self = this.set("newStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

