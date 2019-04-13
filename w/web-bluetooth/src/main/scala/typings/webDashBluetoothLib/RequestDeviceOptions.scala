package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDeviceOptions extends js.Object {
  var acceptAllDevices: js.UndefOr[scala.Boolean] = js.native
  var filters: js.UndefOr[js.Array[BluetoothRequestDeviceFilter]] = js.native
  var optionalServices: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.native
}

