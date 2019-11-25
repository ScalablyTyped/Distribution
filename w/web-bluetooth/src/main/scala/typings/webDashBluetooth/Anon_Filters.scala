package typings.webDashBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filters extends RequestDeviceOptions {
  var filters: js.Array[BluetoothRequestDeviceFilter]
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object Anon_Filters {
  @scala.inline
  def apply(
    filters: js.Array[BluetoothRequestDeviceFilter],
    optionalServices: js.Array[BluetoothServiceUUID] = null
  ): Anon_Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filters]
  }
}

