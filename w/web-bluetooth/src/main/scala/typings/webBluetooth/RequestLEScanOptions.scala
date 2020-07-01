package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestLEScanOptions extends js.Object {
  val acceptAllAdvertisements: js.UndefOr[Boolean] = js.undefined
  val filters: js.UndefOr[js.Array[BluetoothLEScanFilter]] = js.undefined
  val keepRepeatedDevices: js.UndefOr[Boolean] = js.undefined
}

object RequestLEScanOptions {
  @scala.inline
  def apply(
    acceptAllAdvertisements: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[BluetoothLEScanFilter] = null,
    keepRepeatedDevices: js.UndefOr[Boolean] = js.undefined
  ): RequestLEScanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptAllAdvertisements)) __obj.updateDynamic("acceptAllAdvertisements")(acceptAllAdvertisements.get.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(keepRepeatedDevices)) __obj.updateDynamic("keepRepeatedDevices")(keepRepeatedDevices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLEScanOptions]
  }
}

