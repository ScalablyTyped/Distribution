package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a Received event on a BluetoothLEAdvertisementWatcher . */
trait BluetoothLEAdvertisementReceivedEventArgs extends js.Object {
  /** Gets the Bluetooth LE advertisement payload data received. */
  var advertisement: BluetoothLEAdvertisement
  /** Gets the type of the received Bluetooth LE advertisement packet. */
  var advertisementType: BluetoothLEAdvertisementType
  /** Gets the Bluetooth address of the device sending the Bluetooth LE advertisement. */
  var bluetoothAddress: Double
  /** Gets the received signal strength indicator (RSSI) value, in dBm, for this received Bluetooth LE advertisement event. */
  var rawSignalStrengthInDBm: Double
  /** Gets the timestamp when the Received event occurred. */
  var timestamp: Date
}

object BluetoothLEAdvertisementReceivedEventArgs {
  @scala.inline
  def apply(
    advertisement: BluetoothLEAdvertisement,
    advertisementType: BluetoothLEAdvertisementType,
    bluetoothAddress: Double,
    rawSignalStrengthInDBm: Double,
    timestamp: Date
  ): BluetoothLEAdvertisementReceivedEventArgs = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], advertisementType = advertisementType.asInstanceOf[js.Any], bluetoothAddress = bluetoothAddress.asInstanceOf[js.Any], rawSignalStrengthInDBm = rawSignalStrengthInDBm.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementReceivedEventArgs]
  }
}

