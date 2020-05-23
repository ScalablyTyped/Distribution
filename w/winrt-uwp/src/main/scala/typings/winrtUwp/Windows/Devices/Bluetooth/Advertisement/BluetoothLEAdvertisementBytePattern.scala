package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE advertisement byte pattern for filters to match. */
trait BluetoothLEAdvertisementBytePattern extends js.Object {
  /** The Bluetooth LE advertisement data byte pattern to match. */
  var data: IBuffer
  /** The Bluetooth LE advertisement data type defined by the Bluetooth Special Interest Group (SIG) to match. */
  var dataType: Double
  /** The offset of byte pattern from beginning of advertisement data section. */
  var offset: Double
}

object BluetoothLEAdvertisementBytePattern {
  @scala.inline
  def apply(data: IBuffer, dataType: Double, offset: Double): BluetoothLEAdvertisementBytePattern = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementBytePattern]
  }
}

