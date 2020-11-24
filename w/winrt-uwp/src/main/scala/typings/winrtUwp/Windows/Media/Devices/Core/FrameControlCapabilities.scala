package typings.winrtUwp.Windows.Media.Devices.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the variable photo sequence capabilities of the capture device. */
@js.native
trait FrameControlCapabilities extends js.Object {
  
  /** Gets the exposure capabilities of the capture device for variable photo sequences. */
  var exposure: FrameExposureCapabilities = js.native
  
  /** Gets the exposure compensation capabilities of the capture device for variable photo sequences. */
  var exposureCompensation: FrameExposureCompensationCapabilities = js.native
  
  /** Gets the flash capabilities of the capture device for variable photo sequences. */
  var flash: FrameFlashCapabilities = js.native
  
  /** Gets the focus capabilities of the capture device for variable photo sequences. */
  var focus: FrameFocusCapabilities = js.native
  
  /** Gets the ISO speed capabilities of the capture device for variable photo sequences. */
  var isoSpeed: FrameIsoSpeedCapabilities = js.native
  
  /** Gets whether the capture device supports photo confirmation for variable photo sequences. */
  var photoConfirmationSupported: Boolean = js.native
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
  
  @scala.inline
  implicit class FrameControlCapabilitiesOps[Self <: FrameControlCapabilities] (val x: Self) extends AnyVal {
    
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
    def setExposure(value: FrameExposureCapabilities): Self = this.set("exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureCompensation(value: FrameExposureCompensationCapabilities): Self = this.set("exposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash(value: FrameFlashCapabilities): Self = this.set("flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: FrameFocusCapabilities): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoSpeed(value: FrameIsoSpeedCapabilities): Self = this.set("isoSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoConfirmationSupported(value: Boolean): Self = this.set("photoConfirmationSupported", value.asInstanceOf[js.Any])
  }
}
