package typings.webBluetooth.anon

import typings.webBluetooth.BluetoothServiceUUID
import typings.webBluetooth.RequestDeviceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptAllDevices extends RequestDeviceOptions {
  var acceptAllDevices: Boolean
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object AcceptAllDevices {
  @scala.inline
  def apply(acceptAllDevices: Boolean, optionalServices: js.Array[BluetoothServiceUUID] = null): AcceptAllDevices = {
    val __obj = js.Dynamic.literal(acceptAllDevices = acceptAllDevices.asInstanceOf[js.Any])
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptAllDevices]
  }
}

