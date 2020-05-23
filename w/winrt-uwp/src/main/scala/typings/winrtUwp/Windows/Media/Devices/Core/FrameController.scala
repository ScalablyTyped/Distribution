package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for a frame in a variable photo sequence. */
trait FrameController extends js.Object {
  /** Gets the exposure compensation settings for a frame in a variable photo sequence. */
  var exposureCompensationControl: FrameExposureCompensationControl
  /** Gets the exposure settings for a frame in a variable photo sequence. */
  var exposureControl: FrameExposureControl
  /** Gets the flash settings for a frame in a variable photo sequence. */
  var flashControl: FrameFlashControl
  /** Gets the focus settings for a frame in a variable photo sequence. */
  var focusControl: FrameFocusControl
  /** Gets the ISO speed settings for a frame in a variable photo sequence. */
  var isoSpeedControl: FrameIsoSpeedControl
  /** Gets or sets whether photo confirmation is enabled for a frame in a variable photo sequence. */
  var photoConfirmationEnabled: Boolean
}

object FrameController {
  @scala.inline
  def apply(
    exposureCompensationControl: FrameExposureCompensationControl,
    exposureControl: FrameExposureControl,
    flashControl: FrameFlashControl,
    focusControl: FrameFocusControl,
    isoSpeedControl: FrameIsoSpeedControl,
    photoConfirmationEnabled: Boolean
  ): FrameController = {
    val __obj = js.Dynamic.literal(exposureCompensationControl = exposureCompensationControl.asInstanceOf[js.Any], exposureControl = exposureControl.asInstanceOf[js.Any], flashControl = flashControl.asInstanceOf[js.Any], focusControl = focusControl.asInstanceOf[js.Any], isoSpeedControl = isoSpeedControl.asInstanceOf[js.Any], photoConfirmationEnabled = photoConfirmationEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameController]
  }
}

