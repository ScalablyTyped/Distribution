package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a simple Boolean control on a HID device that returns on/off values. An example would be the LED light on a keyboard. */
trait HidBooleanControl extends js.Object {
  /** Retrieves a description of the given Boolean control. */
  var controlDescription: HidBooleanControlDescription
  /** Retrieves the identifier for a given Boolean control. */
  var id: Double
  /** Retrieves a Boolean value indicating whether the given Boolean control is active. */
  var isActive: Boolean
  /** Retrieves the usage identifier associated with the given Boolean control. */
  var usageId: Double
  /** Retrieves the usage page for a given Boolean control. */
  var usagePage: Double
}

object HidBooleanControl {
  @scala.inline
  def apply(
    controlDescription: HidBooleanControlDescription,
    id: Double,
    isActive: Boolean,
    usageId: Double,
    usagePage: Double
  ): HidBooleanControl = {
    val __obj = js.Dynamic.literal(controlDescription = controlDescription.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], usageId = usageId.asInstanceOf[js.Any], usagePage = usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidBooleanControl]
  }
}

