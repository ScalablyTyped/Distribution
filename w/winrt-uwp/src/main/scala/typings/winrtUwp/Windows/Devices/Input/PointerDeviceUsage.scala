package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies the Human Interface Device (HID) usage details for the input device. */
trait PointerDeviceUsage extends js.Object {
  /** The maximum logical value for Usage. */
  var maxLogical: Double
  /** The maximum physical value for Usage. */
  var maxPhysical: Double
  /** The minimum logical value for Usage. */
  var minLogical: Double
  /** The minimum physical value for Usage. */
  var minPhysical: Double
  /** The multiplier used to convert the usage value reported by the device to a physical value in units of Unit. (Valid only for usages that indicate a static or dynamic value associated with a control, such as pressure or width and height of the touch contact.) */
  var physicalMultiplier: Double
  /** The HID unit of measure. */
  var unit: Double
  /** The HID pointer device usage ID that specifies a device or property in the UsagePage. For example, 0x04 indicates a touch screen device and 0x47 indicates touch confidence. */
  var usage: Double
  /** The HID usage page of the pointer device. */
  var usagePage: Double
}

object PointerDeviceUsage {
  @scala.inline
  def apply(
    maxLogical: Double,
    maxPhysical: Double,
    minLogical: Double,
    minPhysical: Double,
    physicalMultiplier: Double,
    unit: Double,
    usage: Double,
    usagePage: Double
  ): PointerDeviceUsage = {
    val __obj = js.Dynamic.literal(maxLogical = maxLogical.asInstanceOf[js.Any], maxPhysical = maxPhysical.asInstanceOf[js.Any], minLogical = minLogical.asInstanceOf[js.Any], minPhysical = minPhysical.asInstanceOf[js.Any], physicalMultiplier = physicalMultiplier.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerDeviceUsage]
  }
}

