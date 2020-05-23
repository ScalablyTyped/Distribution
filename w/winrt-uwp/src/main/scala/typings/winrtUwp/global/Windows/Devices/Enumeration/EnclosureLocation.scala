package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the physical location of a device in its enclosure. */
@JSGlobal("Windows.Devices.Enumeration.EnclosureLocation")
@js.native
abstract class EnclosureLocation ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.EnclosureLocation {
  /** Indicates whether the device is physically located in the docking station of the portable computer. */
  /* CompleteClass */
  override var inDock: Boolean = js.native
  /** Indicates whether the device is physically located in the lid of the portable computer. */
  /* CompleteClass */
  override var inLid: Boolean = js.native
  /** Indicates which panel of the computer the device is physically located on. */
  /* CompleteClass */
  override var panel: typings.winrtUwp.Windows.Devices.Enumeration.Panel = js.native
}

