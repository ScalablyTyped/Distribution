package typings.winrtDashUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the physical location of a device in its enclosure. */
@JSGlobal("Windows.Devices.Enumeration.EnclosureLocation")
@js.native
abstract class EnclosureLocation () extends js.Object {
  /** Indicates whether the device is physically located in the docking station of the portable computer. */
  var inDock: Boolean = js.native
  /** Indicates whether the device is physically located in the lid of the portable computer. */
  var inLid: Boolean = js.native
  /** Indicates which panel of the computer the device is physically located on. */
  var panel: Panel = js.native
}

