package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Bluetooth LE advertisement section. */
@js.native
trait BluetoothLEAdvertisementDataSection extends js.Object {
  /** The Bluetooth LE advertisement data payload. */
  var data: IBuffer = js.native
  /** The Bluetooth LE advertisement data type as defined by the Bluetooth Special Interest Group (SIG). */
  var dataType: Double = js.native
}

object BluetoothLEAdvertisementDataSection {
  @scala.inline
  def apply(data: IBuffer, dataType: Double): BluetoothLEAdvertisementDataSection = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementDataSection]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementDataSectionOps[Self <: BluetoothLEAdvertisementDataSection] (val x: Self) extends AnyVal {
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
    def setData(value: IBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataType(value: Double): Self = this.set("dataType", value.asInstanceOf[js.Any])
  }
  
}

