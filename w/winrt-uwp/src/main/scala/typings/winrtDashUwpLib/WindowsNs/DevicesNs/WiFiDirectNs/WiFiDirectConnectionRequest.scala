package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest")
@js.native
abstract class WiFiDirectConnectionRequest () extends js.Object {
  /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
  var deviceInformation: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation = js.native
  /** Closes the WiFiDirectConnectionRequest object. */
  def close(): scala.Unit = js.native
}

