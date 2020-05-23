package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the flash capabilities of the capture device for frames in a variable photo sequences. */
trait FrameFlashCapabilities extends js.Object {
  /** Gets a value indicating whether flash power is supported for frames in a variable photo sequences. */
  var powerSupported: Boolean
  /** Gets a value indicating whether red eye reduction is supported for frames in a variable photo sequences. */
  var redEyeReductionSupported: Boolean
  /** Gets a value that indicates if the capture device supports the flash control for frames in a variable photo sequence. */
  var supported: Boolean
}

object FrameFlashCapabilities {
  @scala.inline
  def apply(powerSupported: Boolean, redEyeReductionSupported: Boolean, supported: Boolean): FrameFlashCapabilities = {
    val __obj = js.Dynamic.literal(powerSupported = powerSupported.asInstanceOf[js.Any], redEyeReductionSupported = redEyeReductionSupported.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameFlashCapabilities]
  }
}

