package typings.winrtUwp.global.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies the reason for a lost session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs")
@js.native
class AllJoynSessionLostEventArgs protected ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs {
  /**
    * Generates an AllJoynSessionLostEventArgs object containing information that identifies the reason for the lost session.
    * @param reason The reason the session was lost.
    */
  def this(reason: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynSessionLostReason) = this()
}

