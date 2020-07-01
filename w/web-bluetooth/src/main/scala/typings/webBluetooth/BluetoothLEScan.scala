package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothLEScan extends RequestLEScanOptions {
  var active: Boolean
  def stop(): Unit
}

object BluetoothLEScan {
  @scala.inline
  def apply(
    active: Boolean,
    stop: () => Unit,
    acceptAllAdvertisements: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[BluetoothLEScanFilter] = null,
    keepRepeatedDevices: js.UndefOr[Boolean] = js.undefined
  ): BluetoothLEScan = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    if (!js.isUndefined(acceptAllAdvertisements)) __obj.updateDynamic("acceptAllAdvertisements")(acceptAllAdvertisements.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(keepRepeatedDevices)) __obj.updateDynamic("keepRepeatedDevices")(keepRepeatedDevices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEScan]
  }
}

