package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information for the DialRequested event. */
@JSGlobal("Windows.Media.Devices.DialRequestedEventArgs")
@js.native
abstract class DialRequestedEventArgs () extends js.Object {
  /** Returns the contact that was dialed. */
  var contact: js.Any = js.native
  /** Indicates that the DialRequested event has been handled. */
  def handled(): scala.Unit = js.native
}

