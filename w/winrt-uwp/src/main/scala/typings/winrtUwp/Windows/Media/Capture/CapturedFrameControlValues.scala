package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.CaptureSceneMode
import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the capture device settings that were used for a frame in a variable photo sequence. */
trait CapturedFrameControlValues extends StObject {
  
  /** Gets the exposure time used for a frame in a variable photo sequence. */
  var exposure: Double
  
  /** Gets the exposure compensation value used for a frame in a variable photo sequence. */
  var exposureCompensation: Double
  
  /** Gets the flash power used for a frame in a variable photo sequence. */
  var flashPowerPercent: Double
  
  /** Gets a value indicating if the flash was used for a frame in a variable photo sequence. */
  var flashed: Boolean
  
  /** Gets the focus lens position used for a frame in a variable photo sequence. */
  var focus: Double
  
  /** Gets the focus state for a frame in a variable photo sequence. */
  var focusState: MediaCaptureFocusState
  
  /** Gets the ISO analog gain used for a frame in a variable photo sequence. */
  var isoAnalogGain: Double
  
  /** Gets the ISO digital gain used for a frame in a variable photo sequence. */
  var isoDigitalGain: Double
  
  /** Gets the ISO speed used for a frame in a variable photo sequence. */
  var isoSpeed: Double
  
  /** Gets the scene mode used for a frame in a variable photo sequence. */
  var sceneMode: CaptureSceneMode
  
  /** Gets the sensor frame rate used for a frame in a variable photo sequence. */
  var sensorFrameRate: MediaRatio
  
  /** Gets the white balance setting used for a frame in a variable photo sequence. */
  var whiteBalance: Double
  
  /** Gets the white balance gain used for a frame in a variable photo sequence. */
  var whiteBalanceGain: WhiteBalanceGain
  
  /** Gets the zoom factor used for a frame in a variable photo sequence. */
  var zoomFactor: Double
}
object CapturedFrameControlValues {
  
  @scala.inline
  def apply(
    exposure: Double,
    exposureCompensation: Double,
    flashPowerPercent: Double,
    flashed: Boolean,
    focus: Double,
    focusState: MediaCaptureFocusState,
    isoAnalogGain: Double,
    isoDigitalGain: Double,
    isoSpeed: Double,
    sceneMode: CaptureSceneMode,
    sensorFrameRate: MediaRatio,
    whiteBalance: Double,
    whiteBalanceGain: WhiteBalanceGain,
    zoomFactor: Double
  ): CapturedFrameControlValues = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], flashPowerPercent = flashPowerPercent.asInstanceOf[js.Any], flashed = flashed.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusState = focusState.asInstanceOf[js.Any], isoAnalogGain = isoAnalogGain.asInstanceOf[js.Any], isoDigitalGain = isoDigitalGain.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], sceneMode = sceneMode.asInstanceOf[js.Any], sensorFrameRate = sensorFrameRate.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], whiteBalanceGain = whiteBalanceGain.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedFrameControlValues]
  }
  
  @scala.inline
  implicit class CapturedFrameControlValuesMutableBuilder[Self <: CapturedFrameControlValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExposure(value: Double): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureCompensation(value: Double): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashPowerPercent(value: Double): Self = StObject.set(x, "flashPowerPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashed(value: Boolean): Self = StObject.set(x, "flashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: Double): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusState(value: MediaCaptureFocusState): Self = StObject.set(x, "focusState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoAnalogGain(value: Double): Self = StObject.set(x, "isoAnalogGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoDigitalGain(value: Double): Self = StObject.set(x, "isoDigitalGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoSpeed(value: Double): Self = StObject.set(x, "isoSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneMode(value: CaptureSceneMode): Self = StObject.set(x, "sceneMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorFrameRate(value: MediaRatio): Self = StObject.set(x, "sensorFrameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalance(value: Double): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalanceGain(value: WhiteBalanceGain): Self = StObject.set(x, "whiteBalanceGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
  }
}
