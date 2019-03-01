package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptAllDevices extends RequestDeviceOptions {
  var acceptAllDevices: scala.Boolean
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object Anon_AcceptAllDevices {
  @scala.inline
  def apply(acceptAllDevices: scala.Boolean, optionalServices: js.Array[BluetoothServiceUUID] = null): Anon_AcceptAllDevices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acceptAllDevices")(acceptAllDevices)
    if (optionalServices != null) __obj.updateDynamic("optionalServices")(optionalServices)
    __obj.asInstanceOf[Anon_AcceptAllDevices]
  }
}

