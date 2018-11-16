package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the flash settings on a capture device. */
@JSGlobal("Windows.Media.Devices.FlashControl")
@js.native
abstract class FlashControl () extends js.Object {
  /** Gets or sets a value indicating whether focus assist light is enabled on the capture device. */
  var assistantLightEnabled: scala.Boolean = js.native
  /** Gets a value indicating whether focus assist light is supported by the capture device. */
  var assistantLightSupported: scala.Boolean = js.native
  /** Gets or sets a value that specifies if flash is automatically set. */
  var auto: scala.Boolean = js.native
  /** Gets a value that specifies if the flash on the capture device is enabled or disabled. */
  var enabled: scala.Boolean = js.native
  /** Gets or sets the intensity of the flash. */
  var powerPercent: scala.Double = js.native
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: scala.Boolean = js.native
  /** Gets a value that specifies if the red eye reduction is enabled or disabled. */
  var redEyeReduction: scala.Boolean = js.native
  /** Gets a value that specifies if the capture device supports red eye reduction. */
  var redEyeReductionSupported: scala.Boolean = js.native
  /** Gets a value that specifies if the capture device supports the flash control. */
  var supported: scala.Boolean = js.native
}

