package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVideoDeviceController extends IMediaDeviceController {
  var backlightCompensation: MediaDeviceControl
  var brightness: MediaDeviceControl
  var contrast: MediaDeviceControl
  var exposure: MediaDeviceControl
  var focus: MediaDeviceControl
  var hue: MediaDeviceControl
  var pan: MediaDeviceControl
  var roll: MediaDeviceControl
  var tilt: MediaDeviceControl
  var whiteBalance: MediaDeviceControl
  var zoom: MediaDeviceControl
  def tryGetPowerlineFrequency(): winrtLib.Anon_Succeeded
  def trySetPowerlineFrequency(value: winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency): scala.Boolean
}

object IVideoDeviceController {
  @scala.inline
  def apply(
    backlightCompensation: MediaDeviceControl,
    brightness: MediaDeviceControl,
    contrast: MediaDeviceControl,
    exposure: MediaDeviceControl,
    focus: MediaDeviceControl,
    getAvailableMediaStreamProperties: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties],
    getMediaStreamProperties: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType => winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties,
    hue: MediaDeviceControl,
    pan: MediaDeviceControl,
    roll: MediaDeviceControl,
    setMediaStreamPropertiesAsync: (winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties) => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    tilt: MediaDeviceControl,
    tryGetPowerlineFrequency: () => winrtLib.Anon_Succeeded,
    trySetPowerlineFrequency: winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency => scala.Boolean,
    whiteBalance: MediaDeviceControl,
    zoom: MediaDeviceControl
  ): IVideoDeviceController = {
    val __obj = js.Dynamic.literal(backlightCompensation = backlightCompensation, brightness = brightness, contrast = contrast, exposure = exposure, focus = focus, getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), hue = hue, pan = pan, roll = roll, setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), tilt = tilt, tryGetPowerlineFrequency = js.Any.fromFunction0(tryGetPowerlineFrequency), trySetPowerlineFrequency = js.Any.fromFunction1(trySetPowerlineFrequency), whiteBalance = whiteBalance, zoom = zoom)
  
    __obj.asInstanceOf[IVideoDeviceController]
  }
}

