package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the DialDeviceSelected event on the DialDevicePicker object. */
@JSGlobal("Windows.Media.DialProtocol.DialDeviceSelectedEventArgs")
@js.native
abstract class DialDeviceSelectedEventArgs () extends js.Object {
  /** Gets the DialDevice object that represents the remote device that has been selected by the user in a DialDevicePicker . */
  var selectedDialDevice: DialDevice = js.native
}

