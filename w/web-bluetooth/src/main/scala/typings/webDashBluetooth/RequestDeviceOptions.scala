package typings.webDashBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDeviceOptions extends js.Object {
  var acceptAllDevices: js.UndefOr[Boolean] = js.undefined
  var filters: js.UndefOr[js.Array[BluetoothRequestDeviceFilter]] = js.undefined
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object RequestDeviceOptions {
  @scala.inline
  def apply(
    acceptAllDevices: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[BluetoothRequestDeviceFilter] = null,
    optionalServices: js.Array[BluetoothServiceUUID] = null
  ): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptAllDevices)) __obj.updateDynamic("acceptAllDevices")(acceptAllDevices)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices)
    __obj.asInstanceOf[RequestDeviceOptions]
  }
}

