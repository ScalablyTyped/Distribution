package typings.webDashBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothRequestDeviceFilter extends js.Object {
  var manufacturerId: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namePrefix: js.UndefOr[String] = js.undefined
  var serviceDataUUID: js.UndefOr[BluetoothServiceUUID] = js.undefined
  var services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object BluetoothRequestDeviceFilter {
  @scala.inline
  def apply(
    manufacturerId: Int | Double = null,
    name: String = null,
    namePrefix: String = null,
    serviceDataUUID: BluetoothServiceUUID = null,
    services: js.Array[BluetoothServiceUUID] = null
  ): BluetoothRequestDeviceFilter = {
    val __obj = js.Dynamic.literal()
    if (manufacturerId != null) __obj.updateDynamic("manufacturerId")(manufacturerId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (serviceDataUUID != null) __obj.updateDynamic("serviceDataUUID")(serviceDataUUID.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothRequestDeviceFilter]
  }
}

