package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies the reason for a lost session. */
trait AllJoynSessionLostEventArgs extends js.Object {
  /** Retrieves a value that indicates the reason for a lost session. */
  var reason: AllJoynSessionLostReason
}

object AllJoynSessionLostEventArgs {
  @scala.inline
  def apply(reason: AllJoynSessionLostReason): AllJoynSessionLostEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionLostEventArgs]
  }
}

