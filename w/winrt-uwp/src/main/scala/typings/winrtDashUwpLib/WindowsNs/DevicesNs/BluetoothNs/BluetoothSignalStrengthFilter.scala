package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Groups parameters used to configure received signal strength indicator (RSSI)-based filtering. */
@JSGlobal("Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter")
@js.native
/** Create a new BluetoothSignalStrengthFilter object. */
class BluetoothSignalStrengthFilter () extends js.Object {
  /** The minimum received signal strength indicator (RSSI) value in dBm on which RSSI events will be propagated or considered in range if the previous events were considered out of range. */
  var inRangeThresholdInDBm: scala.Double = js.native
  /** The minimum received signal strength indicator (RSSI) value in dBm on which RSSI events will be considered out of range. */
  var outOfRangeThresholdInDBm: scala.Double = js.native
  /** The timeout for a received signal strength indicator (RSSI) event to be considered out of range. */
  var outOfRangeTimeout: scala.Double = js.native
  /** The interval at which received signal strength indicator (RSSI) events are sampled. */
  var samplingInterval: scala.Double = js.native
}

