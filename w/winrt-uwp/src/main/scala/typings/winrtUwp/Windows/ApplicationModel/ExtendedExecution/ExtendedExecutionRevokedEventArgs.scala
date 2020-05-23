package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when the system revokes background execution. */
trait ExtendedExecutionRevokedEventArgs extends js.Object {
  /** Gets the reason background execution was revoked. */
  var reason: ExtendedExecutionRevokedReason
}

object ExtendedExecutionRevokedEventArgs {
  @scala.inline
  def apply(reason: ExtendedExecutionRevokedReason): ExtendedExecutionRevokedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedExecutionRevokedEventArgs]
  }
}

