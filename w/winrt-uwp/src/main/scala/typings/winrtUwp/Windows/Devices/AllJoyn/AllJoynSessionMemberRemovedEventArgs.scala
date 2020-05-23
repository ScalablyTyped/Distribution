package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a remote app removed from a session. */
trait AllJoynSessionMemberRemovedEventArgs extends js.Object {
  /** The unique bus name of the remote app removed from the session. */
  var uniqueName: String
}

object AllJoynSessionMemberRemovedEventArgs {
  @scala.inline
  def apply(uniqueName: String): AllJoynSessionMemberRemovedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynSessionMemberRemovedEventArgs]
  }
}

