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
    getAvailableMediaStreamProperties: js.Function1[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties]
    ],
    getMediaStreamProperties: js.Function1[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
    ],
    hue: MediaDeviceControl,
    pan: MediaDeviceControl,
    roll: MediaDeviceControl,
    setMediaStreamPropertiesAsync: js.Function2[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ],
    tilt: MediaDeviceControl,
    tryGetPowerlineFrequency: js.Function0[winrtLib.Anon_Succeeded],
    trySetPowerlineFrequency: js.Function1[winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency, scala.Boolean],
    whiteBalance: MediaDeviceControl,
    zoom: MediaDeviceControl
  ): IVideoDeviceController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backlightCompensation")(backlightCompensation)
    __obj.updateDynamic("brightness")(brightness)
    __obj.updateDynamic("contrast")(contrast)
    __obj.updateDynamic("exposure")(exposure)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("getAvailableMediaStreamProperties")(getAvailableMediaStreamProperties)
    __obj.updateDynamic("getMediaStreamProperties")(getMediaStreamProperties)
    __obj.updateDynamic("hue")(hue)
    __obj.updateDynamic("pan")(pan)
    __obj.updateDynamic("roll")(roll)
    __obj.updateDynamic("setMediaStreamPropertiesAsync")(setMediaStreamPropertiesAsync)
    __obj.updateDynamic("tilt")(tilt)
    __obj.updateDynamic("tryGetPowerlineFrequency")(tryGetPowerlineFrequency)
    __obj.updateDynamic("trySetPowerlineFrequency")(trySetPowerlineFrequency)
    __obj.updateDynamic("whiteBalance")(whiteBalance)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[IVideoDeviceController]
  }
}

