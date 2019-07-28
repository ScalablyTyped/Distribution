package typings.winrt.WindowsNs.MediaNs.DevicesNs

import typings.winrt.Anon_Succeeded
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType
import typings.winrt.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
import typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
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
  def tryGetPowerlineFrequency(): Anon_Succeeded
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean
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
    tryGetPowerlineFrequency: () => Anon_Succeeded,
    trySetPowerlineFrequency: PowerlineFrequency => Boolean,
    whiteBalance: MediaDeviceControl,
    zoom: MediaDeviceControl
  ): IVideoDeviceController = {
    val __obj = js.Dynamic.literal(backlightCompensation = backlightCompensation, brightness = brightness, contrast = contrast, exposure = exposure, focus = focus, getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), hue = hue, pan = pan, roll = roll, setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), tilt = tilt, tryGetPowerlineFrequency = js.Any.fromFunction0(tryGetPowerlineFrequency), trySetPowerlineFrequency = js.Any.fromFunction1(trySetPowerlineFrequency), whiteBalance = whiteBalance, zoom = zoom)
  
    __obj.asInstanceOf[IVideoDeviceController]
  }
}

