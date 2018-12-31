package typings
package webDashBluetoothLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothRequestDeviceFilter extends js.Object {
  var manufacturerId: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var namePrefix: js.UndefOr[java.lang.String] = js.undefined
  var serviceDataUUID: js.UndefOr[BluetoothServiceUUID] = js.undefined
  var services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

