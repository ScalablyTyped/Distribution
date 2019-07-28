package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Wi-FI Direct connection request received by a WiFiDirectConnectionListener . */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest")
@js.native
abstract class WiFiDirectConnectionRequest () extends js.Object {
  /** Gets device information for the endpoint making the Wi-Fi Direct connection request. */
  var deviceInformation: DeviceInformation = js.native
  /** Closes the WiFiDirectConnectionRequest object. */
  def close(): Unit = js.native
}

