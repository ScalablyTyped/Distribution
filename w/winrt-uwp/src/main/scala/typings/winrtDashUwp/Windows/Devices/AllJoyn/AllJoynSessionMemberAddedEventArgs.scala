package typings.winrtDashUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a peer that was added to a session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs")
@js.native
class AllJoynSessionMemberAddedEventArgs protected () extends js.Object {
  /**
    * Generates an object that contains information about the remote app added to the session.
    * @param uniqueName The unique Consumer name.
    */
  def this(uniqueName: String) = this()
  /** The unique bus name of the remote app new to the session. */
  var uniqueName: String = js.native
}

