package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackSupportedConstraints extends StObject {
  
  var brightness: Boolean
  
  var colorTemperature: Boolean
  
  var contrast: Boolean
  
  var exposureCompensation: Boolean
  
  var exposureMode: Boolean
  
  var focusDistance: Boolean
  
  var focusMode: Boolean
  
  var iso: Boolean
  
  var pointsOfInterest: Boolean
  
  var saturation: Boolean
  
  var sharpness: Boolean
  
  var torch: Boolean
  
  var whiteBalanceMode: Boolean
  
  var zoom: Boolean
}
object MediaTrackSupportedConstraints {
  
  inline def apply(
    brightness: Boolean,
    colorTemperature: Boolean,
    contrast: Boolean,
    exposureCompensation: Boolean,
    exposureMode: Boolean,
    focusDistance: Boolean,
    focusMode: Boolean,
    iso: Boolean,
    pointsOfInterest: Boolean,
    saturation: Boolean,
    sharpness: Boolean,
    torch: Boolean,
    whiteBalanceMode: Boolean,
    zoom: Boolean
  ): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], pointsOfInterest = pointsOfInterest.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaTrackSupportedConstraints] (val x: Self) extends AnyVal {
    
    inline def setBrightness(value: Boolean): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setColorTemperature(value: Boolean): Self = StObject.set(x, "colorTemperature", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: Boolean): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setExposureCompensation(value: Boolean): Self = StObject.set(x, "exposureCompensation", value.asInstanceOf[js.Any])
    
    inline def setExposureMode(value: Boolean): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    inline def setFocusDistance(value: Boolean): Self = StObject.set(x, "focusDistance", value.asInstanceOf[js.Any])
    
    inline def setFocusMode(value: Boolean): Self = StObject.set(x, "focusMode", value.asInstanceOf[js.Any])
    
    inline def setIso(value: Boolean): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setPointsOfInterest(value: Boolean): Self = StObject.set(x, "pointsOfInterest", value.asInstanceOf[js.Any])
    
    inline def setSaturation(value: Boolean): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    
    inline def setSharpness(value: Boolean): Self = StObject.set(x, "sharpness", value.asInstanceOf[js.Any])
    
    inline def setTorch(value: Boolean): Self = StObject.set(x, "torch", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceMode(value: Boolean): Self = StObject.set(x, "whiteBalanceMode", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
