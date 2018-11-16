package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets the capabilities of a camera setting. */
@JSGlobal("Windows.Media.Devices.MediaDeviceControlCapabilities")
@js.native
abstract class MediaDeviceControlCapabilities () extends js.Object {
  /** Queries whether the camera supports automatic adjustment of the setting. */
  var autoModeSupported: scala.Boolean = js.native
  /** Gets the default value of the camera setting. */
  var default: scala.Double = js.native
  /** Sets the maximum value of the camera setting. */
  var max: scala.Double = js.native
  /** Gets the minimum value of the camera setting. */
  var min: scala.Double = js.native
  /** Ges the step size for the setting. The step size is the smallest increment by which the property can change. */
  var step: scala.Double = js.native
  /** Indicates whether the camera supports this camera setting. */
  var supported: scala.Boolean = js.native
}

