package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a Received event on a BluetoothLEAdvertisementWatcher . */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementReceivedEventArgs")
@js.native
abstract class BluetoothLEAdvertisementReceivedEventArgs () extends js.Object {
  /** Gets the Bluetooth LE advertisement payload data received. */
  var advertisement: BluetoothLEAdvertisement = js.native
  /** Gets the type of the received Bluetooth LE advertisement packet. */
  var advertisementType: BluetoothLEAdvertisementType = js.native
  /** Gets the Bluetooth address of the device sending the Bluetooth LE advertisement. */
  var bluetoothAddress: Double = js.native
  /** Gets the received signal strength indicator (RSSI) value, in dBm, for this received Bluetooth LE advertisement event. */
  var rawSignalStrengthInDBm: Double = js.native
  /** Gets the timestamp when the Received event occurred. */
  var timestamp: Date = js.native
}

