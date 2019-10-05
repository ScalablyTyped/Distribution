package typings.winrt.Windows.Media.MediaProperties

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
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
  def createFromFileAsync(file: IStorageFile): IAsyncOperation[MediaEncodingProfile] = js.native
  def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[MediaEncodingProfile] = js.native
  def createM4a(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  def createMp3(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  def createMp4(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
  def createWma(quality: AudioEncodingQuality): MediaEncodingProfile = js.native
  def createWmv(quality: VideoEncodingQuality): MediaEncodingProfile = js.native
}

