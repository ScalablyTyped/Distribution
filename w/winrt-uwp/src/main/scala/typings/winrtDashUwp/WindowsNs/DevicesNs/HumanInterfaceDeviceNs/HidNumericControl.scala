package typings.winrtDashUwp.WindowsNs.DevicesNs.HumanInterfaceDeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidNumericControl")
@js.native
abstract class HidNumericControl () extends js.Object {
  /** Retrieves a control description for the given numeric control. */
  var controlDescription: HidNumericControlDescription = js.native
  /** Retrieves the identifier for the given numeric control. */
  var id: Double = js.native
  /** Retrieves a Boolean value that indicates whether the given numeric control is grouped with other, related controls. */
  var isGrouped: Boolean = js.native
  /** Retrieves, or sets, a scaled numeric-value for the given control. */
  var scaledValue: Double = js.native
  /** Retrieves the usage identifier for the given numeric control. */
  var usageId: Double = js.native
  /** Retrieves the usage page for the given numeric control. */
  var usagePage: Double = js.native
  /** Retrieves, or sets, the numeric value for a given control. */
  var value: Double = js.native
}

