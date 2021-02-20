package typings.w3cImageCapture

import typings.w3cImageCapture.W3C.ConstrainPoint2D
import typings.webrtc.W3C.ConstrainBoolean
import typings.webrtc.W3C.ConstrainDouble
import typings.webrtc.W3C.ConstrainString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaTrackConstraintSet extends StObject {
  
  var brightness: js.UndefOr[ConstrainDouble] = js.native
  
  var colorTemperature: js.UndefOr[ConstrainDouble] = js.native
  
  var contrast: js.UndefOr[ConstrainDouble] = js.native
  
  var exposureCompensation: js.UndefOr[ConstrainDouble] = js.native
  
  var exposureMode: js.UndefOr[ConstrainString] = js.native
  
  var focusDistance: js.UndefOr[ConstrainDouble] = js.native
  
  var focusMode: js.UndefOr[ConstrainString] = js.native
  
  var iso: js.UndefOr[ConstrainDouble] = js.native
  
  var pointsOfInterest: js.UndefOr[ConstrainPoint2D] = js.native
  
  var saturation: js.UndefOr[ConstrainDouble] = js.native
  
  var sharpness: js.UndefOr[ConstrainDouble] = js.native
  
  var torch: js.UndefOr[ConstrainBoolean] = js.native
  
  var whiteBalanceMode: js.UndefOr[ConstrainString] = js.native
  
  var zoom: js.UndefOr[ConstrainDouble] = js.native
}
object MediaTrackConstraintSet {
  
  @scala.inline
  def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  
  @scala.inline
  implicit class MediaTrackConstraintSetMutableBuilder[Self <: MediaTrackConstraintSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrightness(value: ConstrainDouble): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    @scala.inline
    def setColorTemperature(value: ConstrainDouble): Self = StObject.set(x, "colorTemperature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTemperatureUndefined: Self = StObject.set(x, "colorTemperature", js.undefined)
    
    @scala.inline
    def setContrast(value: ConstrainDouble): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    @scala.inline
    def setExposureCompensation(value: ConstrainDouble): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureCompensationUndefined: Self = StObject.set(x, "exposureCompensation", js.undefined)
    
    @scala.inline
    def setExposureMode(value: ConstrainString): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureModeUndefined: Self = StObject.set(x, "exposureMode", js.undefined)
    
    @scala.inline
    def setExposureModeVarargs(value: String*): Self = StObject.set(x, "exposureMode", js.Array(value :_*))
    
    @scala.inline
    def setFocusDistance(value: ConstrainDouble): Self = StObject.set(x, "focusDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusDistanceUndefined: Self = StObject.set(x, "focusDistance", js.undefined)
    
    @scala.inline
    def setFocusMode(value: ConstrainString): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
    
    @scala.inline
    def setFocusModeVarargs(value: String*): Self = StObject.set(x, "focusMode", js.Array(value :_*))
    
    @scala.inline
    def setIso(value: ConstrainDouble): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoUndefined: Self = StObject.set(x, "iso", js.undefined)
    
    @scala.inline
    def setPointsOfInterest(value: ConstrainPoint2D): Self = StObject.set(x, "pointsOfInterest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsOfInterestUndefined: Self = StObject.set(x, "pointsOfInterest", js.undefined)
    
    @scala.inline
    def setPointsOfInterestVarargs(value: Point2D*): Self = StObject.set(x, "pointsOfInterest", js.Array(value :_*))
    
    @scala.inline
    def setSaturation(value: ConstrainDouble): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    @scala.inline
    def setSharpness(value: ConstrainDouble): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharpnessUndefined: Self = StObject.set(x, "sharpness", js.undefined)
    
    @scala.inline
    def setTorch(value: ConstrainBoolean): Self = StObject.set(x, "torch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorchUndefined: Self = StObject.set(x, "torch", js.undefined)
    
    @scala.inline
    def setWhiteBalanceMode(value: ConstrainString): Self = StObject.set(x, "whiteBalanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalanceModeUndefined: Self = StObject.set(x, "whiteBalanceMode", js.undefined)
    
    @scala.inline
    def setWhiteBalanceModeVarargs(value: String*): Self = StObject.set(x, "whiteBalanceMode", js.Array(value :_*))
    
    @scala.inline
    def setZoom(value: ConstrainDouble): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
