package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.AudioDeviceController")
@js.native
class AudioDeviceController () extends IAudioDeviceController {
  /* CompleteClass */
  override var muted: scala.Boolean = js.native
  /* CompleteClass */
  override var volumePercent: scala.Double = js.native
  /* CompleteClass */
  override def getAvailableMediaStreamProperties(mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties] = js.native
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties = js.native
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(
    mediaStreamType: winrtLib.WindowsNs.MediaNs.CaptureNs.MediaStreamType,
    mediaEncodingProperties: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

