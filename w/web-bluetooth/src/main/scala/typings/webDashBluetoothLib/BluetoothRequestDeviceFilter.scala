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

object BluetoothRequestDeviceFilter {
  @scala.inline
  def apply(
    manufacturerId: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    namePrefix: java.lang.String = null,
    serviceDataUUID: BluetoothServiceUUID = null,
    services: js.Array[BluetoothServiceUUID] = null
  ): BluetoothRequestDeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (manufacturerId != null) __obj.updateDynamic("manufacturerId")(manufacturerId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix)
    if (serviceDataUUID != null) __obj.updateDynamic("serviceDataUUID")(serviceDataUUID.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[BluetoothRequestDeviceFilter]
  }
}

