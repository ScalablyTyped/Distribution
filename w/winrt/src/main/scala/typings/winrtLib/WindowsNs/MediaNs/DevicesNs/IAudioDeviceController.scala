package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAudioDeviceController extends IMediaDeviceController {
  var muted: scala.Boolean
  var volumePercent: scala.Double
}

object IAudioDeviceController {
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: js.Function1[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties]
    ],
    getMediaStreamProperties: js.Function1[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
    ],
    muted: scala.Boolean,
    setMediaStreamPropertiesAsync: js.Function2[
      winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, 
      winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ],
    volumePercent: scala.Double
  ): IAudioDeviceController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAvailableMediaStreamProperties")(getAvailableMediaStreamProperties)
    __obj.updateDynamic("getMediaStreamProperties")(getMediaStreamProperties)
    __obj.updateDynamic("muted")(muted)
    __obj.updateDynamic("setMediaStreamPropertiesAsync")(setMediaStreamPropertiesAsync)
    __obj.updateDynamic("volumePercent")(volumePercent)
    __obj.asInstanceOf[IAudioDeviceController]
  }
}

