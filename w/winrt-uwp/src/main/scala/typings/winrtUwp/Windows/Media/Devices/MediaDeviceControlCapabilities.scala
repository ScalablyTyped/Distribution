package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets the capabilities of a camera setting. */
trait MediaDeviceControlCapabilities extends js.Object {
  /** Queries whether the camera supports automatic adjustment of the setting. */
  var autoModeSupported: Boolean
  /** Gets the default value of the camera setting. */
  var default: Double
  /** Sets the maximum value of the camera setting. */
  var max: Double
  /** Gets the minimum value of the camera setting. */
  var min: Double
  /** Ges the step size for the setting. The step size is the smallest increment by which the property can change. */
  var step: Double
  /** Indicates whether the camera supports this camera setting. */
  var supported: Boolean
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
}

