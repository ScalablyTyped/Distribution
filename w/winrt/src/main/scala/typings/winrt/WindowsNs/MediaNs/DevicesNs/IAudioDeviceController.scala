package typings.winrt.WindowsNs.MediaNs.DevicesNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType
import typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAudioDeviceController extends IMediaDeviceController {
  var muted: Boolean
  var volumePercent: Double
}

object IAudioDeviceController {
  @scala.inline
  def apply(
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    muted: Boolean,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IAsyncAction,
    volumePercent: Double
  ): IAudioDeviceController = {
    val __obj = js.Dynamic.literal(getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), muted = muted, setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), volumePercent = volumePercent)
  
    __obj.asInstanceOf[IAudioDeviceController]
  }
}

