package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a peer that was added to a session. */
trait AllJoynSessionMemberAddedEventArgs extends js.Object {
  /** The unique bus name of the remote app new to the session. */
  var uniqueName: String
}

object AllJoynSessionMemberAddedEventArgs {
  @scala.inline
  def apply(uniqueName: String): AllJoynSessionMemberAddedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionMemberAddedEventArgs]
  }
}

