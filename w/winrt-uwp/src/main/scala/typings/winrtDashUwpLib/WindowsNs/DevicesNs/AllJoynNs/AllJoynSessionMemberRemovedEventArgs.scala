package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.AllJoynNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a remote app removed from a session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs")
@js.native
class AllJoynSessionMemberRemovedEventArgs protected () extends js.Object {
  /**
    * Generates an object containing information about a remote app removed from a session.
    * @param uniqueName The unique bus name of the remote app removed from the session.
    */
  def this(uniqueName: java.lang.String) = this()
  /** The unique bus name of the remote app removed from the session. */
  var uniqueName: java.lang.String = js.native
}

