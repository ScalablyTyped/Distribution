package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcceptAllDevices extends RequestDeviceOptions {
  var acceptAllDevices: Boolean
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object AnonAcceptAllDevices {
  @scala.inline
  def apply(acceptAllDevices: Boolean, optionalServices: js.Array[BluetoothServiceUUID] = null): AnonAcceptAllDevices = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcceptAllDevices]
  }
}

