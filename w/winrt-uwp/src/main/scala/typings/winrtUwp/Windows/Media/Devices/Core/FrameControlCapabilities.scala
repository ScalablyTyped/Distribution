package typings.winrtUwp.Windows.Media.Devices.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the variable photo sequence capabilities of the capture device. */
@js.native
trait FrameControlCapabilities extends StObject {
  
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
  implicit class FrameControlCapabilitiesMutableBuilder[Self <: FrameControlCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExposure(value: FrameExposureCapabilities): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureCompensation(value: FrameExposureCompensationCapabilities): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlash(value: FrameFlashCapabilities): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: FrameFocusCapabilities): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoSpeed(value: FrameIsoSpeedCapabilities): Self = StObject.set(x, "isoSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoConfirmationSupported(value: Boolean): Self = StObject.set(x, "photoConfirmationSupported", value.asInstanceOf[js.Any])
  }
}
