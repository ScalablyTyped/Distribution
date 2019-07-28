package typings.winrt.WindowsNs.MediaNs.DevicesNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.MediaNs.CaptureNs.MediaStreamType
import typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.AudioDeviceController")
@js.native
class AudioDeviceController () extends IAudioDeviceController {
  /* CompleteClass */
  override var muted: Boolean = js.native
  /* CompleteClass */
  override var volumePercent: Double = js.native
  /* CompleteClass */
  override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IAsyncAction = js.native
}

