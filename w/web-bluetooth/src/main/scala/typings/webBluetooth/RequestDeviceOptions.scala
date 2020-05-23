package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webBluetooth.anon.Filters
  - typings.webBluetooth.anon.AcceptAllDevices
*/
trait RequestDeviceOptions extends js.Object

object RequestDeviceOptions {
  @scala.inline
  def Filters(
    filters: js.Array[BluetoothRequestDeviceFilter],
    optionalServices: js.Array[BluetoothServiceUUID] = null
  ): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
  @scala.inline
  def AcceptAllDevices(acceptAllDevices: Boolean, optionalServices: js.Array[BluetoothServiceUUID] = null): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
}

