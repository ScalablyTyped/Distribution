package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the flash settings on a capture device. */
@JSGlobal("Windows.Media.Devices.FlashControl")
@js.native
abstract class FlashControl ()
  extends typings.winrtUwp.Windows.Media.Devices.FlashControl {
  /** Gets or sets a value indicating whether focus assist light is enabled on the capture device. */
  /* CompleteClass */
  override var assistantLightEnabled: Boolean = js.native
  /** Gets a value indicating whether focus assist light is supported by the capture device. */
  /* CompleteClass */
  override var assistantLightSupported: Boolean = js.native
  /** Gets or sets a value that specifies if flash is automatically set. */
  /* CompleteClass */
  override var auto: Boolean = js.native
  /** Gets a value that specifies if the flash on the capture device is enabled or disabled. */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /** Gets or sets the intensity of the flash. */
  /* CompleteClass */
  override var powerPercent: Double = js.native
  /** Gets a value that specifics if the device allows the torch LED power settings to be changed. */
  /* CompleteClass */
  override var powerSupported: Boolean = js.native
  /** Gets a value that specifies if the red eye reduction is enabled or disabled. */
  /* CompleteClass */
  override var redEyeReduction: Boolean = js.native
  /** Gets a value that specifies if the capture device supports red eye reduction. */
  /* CompleteClass */
  override var redEyeReductionSupported: Boolean = js.native
  /** Gets a value that specifies if the capture device supports the flash control. */
  /* CompleteClass */
  override var supported: Boolean = js.native
}

