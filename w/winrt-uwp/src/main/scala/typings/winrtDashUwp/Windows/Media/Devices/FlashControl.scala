package typings.winrtDashUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the flash settings on a capture device. */
@JSGlobal("Windows.Media.Devices.FlashControl")
@js.native
abstract class FlashControl () extends js.Object {
  /** Gets or sets a value indicating whether focus assist light is enabled on the capture device. */
  var assistantLightEnabled: Boolean = js.native
  /** Gets a value indicating whether focus assist light is supported by the capture device. */
  var assistantLightSupported: Boolean = js.native
  /** Gets or sets a value that specifies if flash is automatically set. */
  var auto: Boolean = js.native
  /** Gets a value that specifies if the flash on the capture device is enabled or disabled. */
  var enabled: Boolean = js.native
  /** Gets or sets the intensity of the flash. */
  var powerPercent: Double = js.native
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  var powerSupported: Boolean = js.native
  /** Gets a value that specifies if the red eye reduction is enabled or disabled. */
  var redEyeReduction: Boolean = js.native
  /** Gets a value that specifies if the capture device supports red eye reduction. */
  var redEyeReductionSupported: Boolean = js.native
  /** Gets a value that specifies if the capture device supports the flash control. */
  var supported: Boolean = js.native
}

