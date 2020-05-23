package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Groups parameters used to configure payload-based filtering of received Bluetooth LE advertisements. */
trait BluetoothLEAdvertisementFilter extends js.Object {
  /** A BluetoothLEAdvertisement object that can be applied as filters to received Bluetooth LE advertisements. */
  var advertisement: BluetoothLEAdvertisement
  /** Gets a vector of byte patterns with offsets to match advertisement sections in a received Bluetooth LE advertisement. */
  var bytePatterns: IVector[BluetoothLEAdvertisementBytePattern]
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
}

