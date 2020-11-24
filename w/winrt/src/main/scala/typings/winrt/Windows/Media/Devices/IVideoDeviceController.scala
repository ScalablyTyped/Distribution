package typings.winrt.Windows.Media.Devices

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Media.Capture.MediaStreamType
import typings.winrt.Windows.Media.Capture.PowerlineFrequency
import typings.winrt.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrt.anon.Value
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
  implicit class IVideoDeviceControllerOps[Self <: IVideoDeviceController] (val x: Self) extends AnyVal {
    
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
    def setBacklightCompensation(value: MediaDeviceControl): Self = this.set("backlightCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: MediaDeviceControl): Self = this.set("brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: MediaDeviceControl): Self = this.set("contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposure(value: MediaDeviceControl): Self = this.set("exposure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: MediaDeviceControl): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHue(value: MediaDeviceControl): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPan(value: MediaDeviceControl): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoll(value: MediaDeviceControl): Self = this.set("roll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilt(value: MediaDeviceControl): Self = this.set("tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetPowerlineFrequency(value: () => Value): Self = this.set("tryGetPowerlineFrequency", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrySetPowerlineFrequency(value: PowerlineFrequency => Boolean): Self = this.set("trySetPowerlineFrequency", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWhiteBalance(value: MediaDeviceControl): Self = this.set("whiteBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoom(value: MediaDeviceControl): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
}
