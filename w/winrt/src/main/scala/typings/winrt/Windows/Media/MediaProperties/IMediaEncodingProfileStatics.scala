package typings.winrt.Windows.Media.MediaProperties

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaEncodingProfileStatics extends js.Object {
  def createFromFileAsync(file: IStorageFile): IAsyncOperation[MediaEncodingProfile]
  def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[MediaEncodingProfile]
  def createM4a(quality: AudioEncodingQuality): MediaEncodingProfile
  def createMp3(quality: AudioEncodingQuality): MediaEncodingProfile
  def createMp4(quality: VideoEncodingQuality): MediaEncodingProfile
  def createWma(quality: AudioEncodingQuality): MediaEncodingProfile
  def createWmv(quality: VideoEncodingQuality): MediaEncodingProfile
}

object IMediaEncodingProfileStatics {
  @scala.inline
  def apply(
    createFromFileAsync: IStorageFile => IAsyncOperation[MediaEncodingProfile],
    createFromStreamAsync: IRandomAccessStream => IAsyncOperation[MediaEncodingProfile],
    createM4a: AudioEncodingQuality => MediaEncodingProfile,
    createMp3: AudioEncodingQuality => MediaEncodingProfile,
    createMp4: VideoEncodingQuality => MediaEncodingProfile,
    createWma: AudioEncodingQuality => MediaEncodingProfile,
    createWmv: VideoEncodingQuality => MediaEncodingProfile
  ): IMediaEncodingProfileStatics = {
    val __obj = js.Dynamic.literal(createFromFileAsync = js.Any.fromFunction1(createFromFileAsync), createFromStreamAsync = js.Any.fromFunction1(createFromStreamAsync), createM4a = js.Any.fromFunction1(createM4a), createMp3 = js.Any.fromFunction1(createMp3), createMp4 = js.Any.fromFunction1(createMp4), createWma = js.Any.fromFunction1(createWma), createWmv = js.Any.fromFunction1(createWmv))
  
    __obj.asInstanceOf[IMediaEncodingProfileStatics]
  }
}

