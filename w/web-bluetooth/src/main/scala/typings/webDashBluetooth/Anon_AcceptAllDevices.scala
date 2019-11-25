package typings.webDashBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptAllDevices extends RequestDeviceOptions {
  var acceptAllDevices: Boolean
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object Anon_AcceptAllDevices {
  @scala.inline
  def apply(acceptAllDevices: Boolean, optionalServices: js.Array[BluetoothServiceUUID] = null): Anon_AcceptAllDevices = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcceptAllDevices]
  }
}

