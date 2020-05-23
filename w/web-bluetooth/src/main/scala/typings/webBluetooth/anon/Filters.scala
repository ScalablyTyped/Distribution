package typings.webBluetooth.anon

import typings.webBluetooth.BluetoothRequestDeviceFilter
import typings.webBluetooth.BluetoothServiceUUID
import typings.webBluetooth.RequestDeviceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters extends RequestDeviceOptions {
  var filters: js.Array[BluetoothRequestDeviceFilter]
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object Filters {
  @scala.inline
  def apply(
    filters: js.Array[BluetoothRequestDeviceFilter],
    optionalServices: js.Array[BluetoothServiceUUID] = null
  ): Filters = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters]
  }
}

