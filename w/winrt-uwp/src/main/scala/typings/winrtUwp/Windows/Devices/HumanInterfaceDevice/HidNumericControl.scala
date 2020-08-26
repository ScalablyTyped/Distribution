package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a numeric control on a HID device that returns a range of values. An example would be the volume control on a speaker. */
@js.native
trait HidNumericControl extends js.Object {
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
  @scala.inline
  implicit class HidNumericControlOps[Self <: HidNumericControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setControlDescription(value: HidNumericControlDescription): Self = this.set("controlDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGrouped(value: Boolean): Self = this.set("isGrouped", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaledValue(value: Double): Self = this.set("scaledValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsageId(value: Double): Self = this.set("usageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsagePage(value: Double): Self = this.set("usagePage", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

