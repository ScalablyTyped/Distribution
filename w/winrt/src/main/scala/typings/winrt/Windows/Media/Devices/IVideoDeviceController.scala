package typings.winrt.Windows.Media.Devices

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.Capture.MediaStreamType
import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import typings.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrt.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVideoDeviceController extends IMediaDeviceController {
  
  var backlightCompensation: MediaDeviceControl = js.native
  
  var brightness: MediaDeviceControl = js.native
  
  var contrast: MediaDeviceControl = js.native
  
  var exposure: MediaDeviceControl = js.native
  
  var focus: MediaDeviceControl = js.native
  
  var hue: MediaDeviceControl = js.native
  
  var pan: MediaDeviceControl = js.native
  
  var roll: MediaDeviceControl = js.native
  
  var tilt: MediaDeviceControl = js.native
  
  def tryGetPowerlineFrequency(): Value = js.native
  
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
  
  var whiteBalance: MediaDeviceControl = js.native
  
  var zoom: MediaDeviceControl = js.native
}
object IVideoDeviceController {
  
  @scala.inline
  def apply(
    backlightCompensation: MediaDeviceControl,
    brightness: MediaDeviceControl,
    contrast: MediaDeviceControl,
    exposure: MediaDeviceControl,
    focus: MediaDeviceControl,
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    hue: MediaDeviceControl,
    pan: MediaDeviceControl,
    roll: MediaDeviceControl,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction,
    tilt: MediaDeviceControl,
    tryGetPowerlineFrequency: () => Value,
    trySetPowerlineFrequency: PowerlineFrequency => Boolean,
    whiteBalance: MediaDeviceControl,
    zoom: MediaDeviceControl
  ): IVideoDeviceController = {
    val __obj = js.Dynamic.literal(backlightCompensation = backlightCompensation.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), hue = hue.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), tilt = tilt.asInstanceOf[js.Any], tryGetPowerlineFrequency = js.Any.fromFunction0(tryGetPowerlineFrequency), trySetPowerlineFrequency = js.Any.fromFunction1(trySetPowerlineFrequency), whiteBalance = whiteBalance.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoDeviceController]
  }
  
  @scala.inline
  implicit class IVideoDeviceControllerMutableBuilder[Self <: IVideoDeviceController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklightCompensation(value: MediaDeviceControl): Self = StObject.set(x, "backlightCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: MediaDeviceControl): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: MediaDeviceControl): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposure(value: MediaDeviceControl): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: MediaDeviceControl): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: MediaDeviceControl): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPan(value: MediaDeviceControl): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoll(value: MediaDeviceControl): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilt(value: MediaDeviceControl): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPowerlineFrequency(value: () => Value): Self = StObject.set(x, "tryGetPowerlineFrequency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrySetPowerlineFrequency(value: PowerlineFrequency => Boolean): Self = StObject.set(x, "trySetPowerlineFrequency", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhiteBalance(value: MediaDeviceControl): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: MediaDeviceControl): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
