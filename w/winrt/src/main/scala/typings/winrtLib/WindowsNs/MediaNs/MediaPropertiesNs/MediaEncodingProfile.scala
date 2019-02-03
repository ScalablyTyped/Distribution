package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
@js.native
class MediaEncodingProfile () extends IMediaEncodingProfile {
  /* CompleteClass */
  override var audio: AudioEncodingProperties = js.native
  /* CompleteClass */
  override var container: ContainerEncodingProperties = js.native
  /* CompleteClass */
  override var video: VideoEncodingProperties = js.native
}

/* static members */
@JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
@js.native
object MediaEncodingProfile extends js.Object {
  def createFromFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile] = js.native
  def createFromStreamAsync(stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile] = js.native
  def createM4a(quality: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  def createMp3(quality: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  def createMp4(quality: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  def createWma(quality: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  def createWmv(quality: winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality): winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
}

