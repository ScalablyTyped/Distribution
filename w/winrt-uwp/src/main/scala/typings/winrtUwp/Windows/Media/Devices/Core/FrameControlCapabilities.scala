package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the variable photo sequence capabilities of the capture device. */
trait FrameControlCapabilities extends js.Object {
  /** Gets the exposure capabilities of the capture device for variable photo sequences. */
  var exposure: FrameExposureCapabilities
  /** Gets the exposure compensation capabilities of the capture device for variable photo sequences. */
  var exposureCompensation: FrameExposureCompensationCapabilities
  /** Gets the flash capabilities of the capture device for variable photo sequences. */
  var flash: FrameFlashCapabilities
  /** Gets the focus capabilities of the capture device for variable photo sequences. */
  var focus: FrameFocusCapabilities
  /** Gets the ISO speed capabilities of the capture device for variable photo sequences. */
  var isoSpeed: FrameIsoSpeedCapabilities
  /** Gets whether the capture device supports photo confirmation for variable photo sequences. */
  var photoConfirmationSupported: Boolean
}

object FrameControlCapabilities {
  @scala.inline
  def apply(
    exposure: FrameExposureCapabilities,
    exposureCompensation: FrameExposureCompensationCapabilities,
    flash: FrameFlashCapabilities,
    focus: FrameFocusCapabilities,
    isoSpeed: FrameIsoSpeedCapabilities,
    photoConfirmationSupported: Boolean
  ): FrameControlCapabilities = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], photoConfirmationSupported = photoConfirmationSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameControlCapabilities]
  }
}

