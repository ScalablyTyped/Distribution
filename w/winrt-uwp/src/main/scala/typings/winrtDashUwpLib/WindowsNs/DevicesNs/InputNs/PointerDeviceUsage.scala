package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies the Human Interface Device (HID) usage details for the input device. */

trait PointerDeviceUsage extends js.Object {
  /** The maximum logical value for Usage. */
  var maxLogical: scala.Double
  /** The maximum physical value for Usage. */
  var maxPhysical: scala.Double
  /** The minimum logical value for Usage. */
  var minLogical: scala.Double
  /** The minimum physical value for Usage. */
  var minPhysical: scala.Double
  /** The multiplier used to convert the usage value reported by the device to a physical value in units of Unit. (Valid only for usages that indicate a static or dynamic value associated with a control, such as pressure or width and height of the touch contact.) */
  var physicalMultiplier: scala.Double
  /** The HID unit of measure. */
  var unit: scala.Double
  /** The HID pointer device usage ID that specifies a device or property in the UsagePage. For example, 0x04 indicates a touch screen device and 0x47 indicates touch confidence. */
  var usage: scala.Double
  /** The HID usage page of the pointer device. */
  var usagePage: scala.Double
}

