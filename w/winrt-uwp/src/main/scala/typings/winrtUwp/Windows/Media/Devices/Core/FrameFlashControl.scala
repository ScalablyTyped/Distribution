package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the flash settings for a frame in a variable photo sequence. */
trait FrameFlashControl extends js.Object {
  /** Gets or sets a value indicating whether flash settings are automatically set for a frame in a variable photo sequence. */
  var auto: Boolean
  /** Gets or sets the flash mode for a frame in a variable photo sequence. */
  var mode: FrameFlashMode
  /** Gets or sets the flash power for a frame in a variable photo sequence. */
  var powerPercent: Double
  /** Gets or sets a value indicating if red eye reduction is enabled for a frame in a variable photo sequence. */
  var redEyeReduction: Boolean
}

object FrameFlashControl {
  @scala.inline
  def apply(auto: Boolean, mode: FrameFlashMode, powerPercent: Double, redEyeReduction: Boolean): FrameFlashControl = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], powerPercent = powerPercent.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFlashControl]
  }
}

