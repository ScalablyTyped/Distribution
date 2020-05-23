package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a user authentication status change deferral returned by the UserAuthenticationStatusChangingEventArgs.GetDeferral method. */
trait UserAuthenticationStatusChangeDeferral extends js.Object {
  /** Reports that the application has completed its user authentication status change deferral. */
  def complete(): Unit
}

object UserAuthenticationStatusChangeDeferral {
  @scala.inline
  def apply(complete: () => Unit): UserAuthenticationStatusChangeDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[UserAuthenticationStatusChangeDeferral]
  }
}

