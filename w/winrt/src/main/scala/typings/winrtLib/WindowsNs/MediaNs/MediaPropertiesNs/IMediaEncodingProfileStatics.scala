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

