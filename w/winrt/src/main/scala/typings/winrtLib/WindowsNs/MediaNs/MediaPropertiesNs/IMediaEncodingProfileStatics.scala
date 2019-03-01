package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaEncodingProfileStatics extends js.Object {
  def createFromFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[MediaEncodingProfile]
  def createFromStreamAsync(stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[MediaEncodingProfile]
  def createM4a(quality: AudioEncodingQuality): MediaEncodingProfile
  def createMp3(quality: AudioEncodingQuality): MediaEncodingProfile
  def createMp4(quality: VideoEncodingQuality): MediaEncodingProfile
  def createWma(quality: AudioEncodingQuality): MediaEncodingProfile
  def createWmv(quality: VideoEncodingQuality): MediaEncodingProfile
}

object IMediaEncodingProfileStatics {
  @scala.inline
  def apply(
    createFromFileAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.IStorageFile, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[MediaEncodingProfile]
    ],
    createFromStreamAsync: js.Function1[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[MediaEncodingProfile]
    ],
    createM4a: js.Function1[AudioEncodingQuality, MediaEncodingProfile],
    createMp3: js.Function1[AudioEncodingQuality, MediaEncodingProfile],
    createMp4: js.Function1[VideoEncodingQuality, MediaEncodingProfile],
    createWma: js.Function1[AudioEncodingQuality, MediaEncodingProfile],
    createWmv: js.Function1[VideoEncodingQuality, MediaEncodingProfile]
  ): IMediaEncodingProfileStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFromFileAsync")(createFromFileAsync)
    __obj.updateDynamic("createFromStreamAsync")(createFromStreamAsync)
    __obj.updateDynamic("createM4a")(createM4a)
    __obj.updateDynamic("createMp3")(createMp3)
    __obj.updateDynamic("createMp4")(createMp4)
    __obj.updateDynamic("createWma")(createWma)
    __obj.updateDynamic("createWmv")(createWmv)
    __obj.asInstanceOf[IMediaEncodingProfileStatics]
  }
}

