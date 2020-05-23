package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
trait HidNumericControl extends js.Object {
  /** Retrieves a control description for the given numeric control. */
  var controlDescription: HidNumericControlDescription
  /** Retrieves the identifier for the given numeric control. */
  var id: Double
  /** Retrieves a Boolean value that indicates whether the given numeric control is grouped with other, related controls. */
  var isGrouped: Boolean
  /** Retrieves, or sets, a scaled numeric-value for the given control. */
  var scaledValue: Double
  /** Retrieves the usage identifier for the given numeric control. */
  var usageId: Double
  /** Retrieves the usage page for the given numeric control. */
  var usagePage: Double
  /** Retrieves, or sets, the numeric value for a given control. */
  var value: Double
}

object HidNumericControl {
  @scala.inline
  def apply(
    controlDescription: HidNumericControlDescription,
    id: Double,
    isGrouped: Boolean,
    scaledValue: Double,
    usageId: Double,
    usagePage: Double,
    value: Double
  ): HidNumericControl = {
    val __obj = js.Dynamic.literal(controlDescription = controlDescription.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], scaledValue = scaledValue.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidNumericControl]
  }
}

