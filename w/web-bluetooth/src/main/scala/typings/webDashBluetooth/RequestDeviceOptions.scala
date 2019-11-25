package typings.webDashBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webDashBluetooth.Anon_Filters
  - typings.webDashBluetooth.Anon_AcceptAllDevices
*/
trait RequestDeviceOptions extends js.Object

object RequestDeviceOptions {
  @scala.inline
  def Anon_Filters(
    filters: js.Array[BluetoothRequestDeviceFilter],
    optionalServices: js.Array[BluetoothServiceUUID] = null
  ): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
  @scala.inline
  def Anon_AcceptAllDevices(acceptAllDevices: Boolean, optionalServices: js.Array[BluetoothServiceUUID] = null): RequestDeviceOptions = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDeviceOptions]
  }
}

