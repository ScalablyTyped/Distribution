package typings.winrtDashUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information that identifies the reason for a lost session. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs")
@js.native
class AllJoynSessionLostEventArgs protected () extends js.Object {
  /**
    * Generates an AllJoynSessionLostEventArgs object containing information that identifies the reason for the lost session.
    * @param reason The reason the session was lost.
    */
  def this(reason: AllJoynSessionLostReason) = this()
  /** Retrieves a value that indicates the reason for a lost session. */
  var reason: AllJoynSessionLostReason = js.native
}

