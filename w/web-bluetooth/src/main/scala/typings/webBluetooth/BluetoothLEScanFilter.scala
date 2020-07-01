package typings.webBluetooth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothLEScanFilter extends js.Object {
  val manufacturerData: js.UndefOr[BluetoothManufacturerDataFilter] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  val namePrefix: js.UndefOr[String] = js.undefined
  val serviceData: js.UndefOr[BluetoothServiceDataFilter] = js.undefined
  val services: js.UndefOr[js.Array[BluetoothServiceUUID]] = js.undefined
}

object BluetoothLEScanFilter {
  @scala.inline
  def apply(
    manufacturerData: BluetoothManufacturerDataFilter = null,
    name: String = null,
    namePrefix: String = null,
    serviceData: BluetoothServiceDataFilter = null,
    services: js.Array[BluetoothServiceUUID] = null
  ): BluetoothLEScanFilter = {
    val __obj = js.Dynamic.literal()
    if (manufacturerData != null) __obj.updateDynamic("manufacturerData")(manufacturerData.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (serviceData != null) __obj.updateDynamic("serviceData")(serviceData.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEScanFilter]
  }
}

