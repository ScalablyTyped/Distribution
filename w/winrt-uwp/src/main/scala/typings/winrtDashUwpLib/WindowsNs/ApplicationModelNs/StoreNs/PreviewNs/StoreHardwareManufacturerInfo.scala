package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the manufacturer for the current device. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StoreHardwareManufacturerInfo")
@js.native
abstract class StoreHardwareManufacturerInfo () extends js.Object {
  /** Gets the hardware manufacture ID for the current device. */
  var hardwareManufacturerId: java.lang.String = js.native
  /** Gets the name of the hardware manufacturer for the current device. */
  var manufacturerName: java.lang.String = js.native
  /** Gets the model name for the current device. */
  var modelName: java.lang.String = js.native
  /** Gets the ID of the Windows Store content modifier. */
  var storeContentModifierId: java.lang.String = js.native
}

