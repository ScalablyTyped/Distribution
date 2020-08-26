package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a Received event on a BluetoothLEAdvertisementWatcher . */
@js.native
trait BluetoothLEAdvertisementReceivedEventArgs extends js.Object {
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
  @scala.inline
  implicit class BluetoothLEAdvertisementReceivedEventArgsOps[Self <: BluetoothLEAdvertisementReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvertisement(value: BluetoothLEAdvertisement): Self = this.set("advertisement", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvertisementType(value: BluetoothLEAdvertisementType): Self = this.set("advertisementType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBluetoothAddress(value: Double): Self = this.set("bluetoothAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawSignalStrengthInDBm(value: Double): Self = this.set("rawSignalStrengthInDBm", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

