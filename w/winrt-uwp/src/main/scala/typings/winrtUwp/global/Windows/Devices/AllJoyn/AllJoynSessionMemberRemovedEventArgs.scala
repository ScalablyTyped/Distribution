package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a remote app removed from a session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs")
@js.native
class AllJoynSessionMemberRemovedEventArgs protected ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs {
  /**
    * Generates an object containing information about a remote app removed from a session.
    * @param uniqueName The unique bus name of the remote app removed from the session.
    */
  def this(uniqueName: String) = this()
  /** The unique bus name of the remote app removed from the session. */
  /* CompleteClass */
  override var uniqueName: String = js.native
}

