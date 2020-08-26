package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets the capabilities of a camera setting. */
@js.native
trait MediaDeviceControlCapabilities extends js.Object {
  /** Queries whether the camera supports automatic adjustment of the setting. */
  var autoModeSupported: Boolean = js.native
  /** Gets the default value of the camera setting. */
  var default: Double = js.native
  /** Sets the maximum value of the camera setting. */
  var max: Double = js.native
  /** Gets the minimum value of the camera setting. */
  var min: Double = js.native
  /** Ges the step size for the setting. The step size is the smallest increment by which the property can change. */
  var step: Double = js.native
  /** Indicates whether the camera supports this camera setting. */
  var supported: Boolean = js.native
}

object MediaDeviceControlCapabilities {
  @scala.inline
  def apply(
    autoModeSupported: Boolean,
    default: Double,
    max: Double,
    min: Double,
    step: Double,
    supported: Boolean
  ): MediaDeviceControlCapabilities = {
    val __obj = js.Dynamic.literal(autoModeSupported = autoModeSupported.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDeviceControlCapabilities]
  }
  @scala.inline
  implicit class MediaDeviceControlCapabilitiesOps[Self <: MediaDeviceControlCapabilities] (val x: Self) extends AnyVal {
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
    def setAutoModeSupported(value: Boolean): Self = this.set("autoModeSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Double): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
  
}

