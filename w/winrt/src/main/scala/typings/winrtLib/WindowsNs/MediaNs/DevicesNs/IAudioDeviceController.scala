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
    getAvailableMediaStreamProperties: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties],
    getMediaStreamProperties: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType => winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties,
    muted: scala.Boolean,
    setMediaStreamPropertiesAsync: (winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType, winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties) => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    volumePercent: scala.Double
  ): IAudioDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), muted = muted, setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), volumePercent = volumePercent)
  
    __obj.asInstanceOf[IAudioDeviceController]
  }
}

