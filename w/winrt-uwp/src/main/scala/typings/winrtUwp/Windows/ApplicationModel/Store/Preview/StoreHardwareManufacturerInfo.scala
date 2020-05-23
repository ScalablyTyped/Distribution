package typings.winrtUwp.Windows.ApplicationModel.Store.Preview

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the manufacturer for the current device. */
trait StoreHardwareManufacturerInfo extends js.Object {
  /** Gets the hardware manufacture ID for the current device. */
  var hardwareManufacturerId: String
  /** Gets the name of the hardware manufacturer for the current device. */
  var manufacturerName: String
  /** Gets the model name for the current device. */
  var modelName: String
  /** Gets the ID of the Windows Store content modifier. */
  var storeContentModifierId: String
}

object StoreHardwareManufacturerInfo {
  @scala.inline
  def apply(
    hardwareManufacturerId: String,
    manufacturerName: String,
    modelName: String,
    storeContentModifierId: String
  ): StoreHardwareManufacturerInfo = {
    val __obj = js.Dynamic.literal(hardwareManufacturerId = hardwareManufacturerId.asInstanceOf[js.Any], manufacturerName = manufacturerName.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], storeContentModifierId = storeContentModifierId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreHardwareManufacturerInfo]
  }
}

