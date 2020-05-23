package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE advertisement section. */
trait BluetoothLEAdvertisementDataSection extends js.Object {
  /** The Bluetooth LE advertisement data payload. */
  var data: IBuffer
  /** The Bluetooth LE advertisement data type as defined by the Bluetooth Special Interest Group (SIG). */
  var dataType: Double
}

object BluetoothLEAdvertisementDataSection {
  @scala.inline
  def apply(data: IBuffer, dataType: Double): BluetoothLEAdvertisementDataSection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementDataSection]
  }
}

