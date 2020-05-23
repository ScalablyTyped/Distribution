package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE manufacturer-specific data section (one particular type of LE advertisement section) */
trait BluetoothLEManufacturerData extends js.Object {
  /** The Bluetooth LE company identifier code as defined by the Bluetooth Special Interest Group (SIG). */
  var companyId: Double
  /** Bluetooth LE manufacturer-specific section data. */
  var data: IBuffer
}

object BluetoothLEManufacturerData {
  @scala.inline
  def apply(companyId: Double, data: IBuffer): BluetoothLEManufacturerData = {
    val __obj = js.Dynamic.literal(companyId = companyId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEManufacturerData]
  }
}

