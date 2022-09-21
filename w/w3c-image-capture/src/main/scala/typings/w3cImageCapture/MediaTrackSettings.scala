package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackSettings extends StObject {
  
  var brightness: js.UndefOr[Double] = js.undefined
  
  var colorTemperature: js.UndefOr[Double] = js.undefined
  
  var contrast: js.UndefOr[Double] = js.undefined
  
  var exposureCompensation: js.UndefOr[Double] = js.undefined
  
  var exposureMode: js.UndefOr[MeteringMode] = js.undefined
  
  var focusDistance: js.UndefOr[Double] = js.undefined
  
  var focusMode: js.UndefOr[MeteringMode] = js.undefined
  
  var iso: js.UndefOr[Double] = js.undefined
  
  var pan: js.UndefOr[Double] = js.undefined
  
  var pointsOfInterest: js.UndefOr[js.Array[Point2D]] = js.undefined
  
  var saturation: js.UndefOr[Double] = js.undefined
  
  var sharpness: js.UndefOr[Double] = js.undefined
  
  var tilt: js.UndefOr[Double] = js.undefined
  
  var torch: js.UndefOr[Boolean] = js.undefined
  
  var whiteBalanceMode: js.UndefOr[MeteringMode] = js.undefined
  
  var zoom: js.UndefOr[Double] = js.undefined
}
object MediaTrackSettings {
  
  inline def apply(): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSettings]
  }
  
  extension [Self <: MediaTrackSettings](x: Self) {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setBrightnessUndefined: Self = StObject.set(x, "brightness", js.undefined)
    
    inline def setColorTemperature(value: Double): Self = StObject.set(x, "colorTemperature", value.asInstanceOf[js.Any])
    
    inline def setColorTemperatureUndefined: Self = StObject.set(x, "colorTemperature", js.undefined)
    
    inline def setContrast(value: Double): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setContrastUndefined: Self = StObject.set(x, "contrast", js.undefined)
    
    inline def setExposureCompensation(value: Double): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    inline def setExposureCompensationUndefined: Self = StObject.set(x, "exposureCompensation", js.undefined)
    
    inline def setExposureMode(value: MeteringMode): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    inline def setExposureModeUndefined: Self = StObject.set(x, "exposureMode", js.undefined)
    
    inline def setFocusDistance(value: Double): Self = StObject.set(x, "focusDistance", value.asInstanceOf[js.Any])
    
    inline def setFocusDistanceUndefined: Self = StObject.set(x, "focusDistance", js.undefined)
    
    inline def setFocusMode(value: MeteringMode): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
    
    inline def setFocusModeUndefined: Self = StObject.set(x, "focusMode", js.undefined)
    
    inline def setIso(value: Double): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setIsoUndefined: Self = StObject.set(x, "iso", js.undefined)
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setPointsOfInterest(value: js.Array[Point2D]): Self = StObject.set(x, "pointsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setPointsOfInterestUndefined: Self = StObject.set(x, "pointsOfInterest", js.undefined)
    
    inline def setPointsOfInterestVarargs(value: Point2D*): Self = StObject.set(x, "pointsOfInterest", js.Array(value*))
    
    inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
    
    inline def setSharpness(value: Double): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
    
    inline def setSharpnessUndefined: Self = StObject.set(x, "sharpness", js.undefined)
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    inline def setTorch(value: Boolean): Self = StObject.set(x, "torch", value.asInstanceOf[js.Any])
    
    inline def setTorchUndefined: Self = StObject.set(x, "torch", js.undefined)
    
    inline def setWhiteBalanceMode(value: MeteringMode): Self = StObject.set(x, "whiteBalanceMode", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceModeUndefined: Self = StObject.set(x, "whiteBalanceMode", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
