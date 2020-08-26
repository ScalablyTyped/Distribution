package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Groups parameters used to configure payload-based filtering of received Bluetooth LE advertisements. */
@js.native
trait BluetoothLEAdvertisementFilter extends js.Object {
  /** A BluetoothLEAdvertisement object that can be applied as filters to received Bluetooth LE advertisements. */
  var advertisement: BluetoothLEAdvertisement = js.native
  /** Gets a vector of byte patterns with offsets to match advertisement sections in a received Bluetooth LE advertisement. */
  var bytePatterns: IVector[BluetoothLEAdvertisementBytePattern] = js.native
}

object BluetoothLEAdvertisementFilter {
  @scala.inline
  def apply(
    advertisement: BluetoothLEAdvertisement,
    bytePatterns: IVector[BluetoothLEAdvertisementBytePattern]
  ): BluetoothLEAdvertisementFilter = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], bytePatterns = bytePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementFilter]
  }
  @scala.inline
  implicit class BluetoothLEAdvertisementFilterOps[Self <: BluetoothLEAdvertisementFilter] (val x: Self) extends AnyVal {
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
    def setBytePatterns(value: IVector[BluetoothLEAdvertisementBytePattern]): Self = this.set("bytePatterns", value.asInstanceOf[js.Any])
  }
  
}

