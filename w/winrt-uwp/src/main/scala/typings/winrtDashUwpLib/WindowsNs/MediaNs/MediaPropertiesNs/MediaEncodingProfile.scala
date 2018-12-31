package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the encoding profile for an audio or video file. The encoding profile includes descriptions of the audio and video encoding formats, and a description of the media container. */
@JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
@js.native
/** Creates a new instance of the MediaEncodingProfile class. */
class MediaEncodingProfile () extends js.Object {
  /** Gets or sets the encoding properties for the audio stream. */
  var audio: AudioEncodingProperties = js.native
  /** Gets or sets the properties of the media container. */
  var container: ContainerEncodingProperties = js.native
  /** Gets or sets the encoding properties for the video stream. */
  var video: VideoEncodingProperties = js.native
}

/** Describes the encoding profile for an audio or video file. The encoding profile includes descriptions of the audio and video encoding formats, and a description of the media container. */
@JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
@js.native
object MediaEncodingProfile extends js.Object {
  /**
    * Creates an instance of MediaEncodingProfile for AVI.
    * @param quality The video quality.
    * @return The media encoding profile.
    */
  def createAvi(quality: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /**
    * Creates an encoding profile from an existing media file.
    * @param file The media file from which to create the profile.
    * @return An object that is used to control the asynchronous operation.
    */
  def createFromFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile] = js.native
  /**
    * Creates an encoding profile from a stream that contains media data.
    * @param stream The media stream from which to create the profile.
    * @return An object that is used to control the asynchronous operation.
    */
  def createFromStreamAsync(stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile] = js.native
  /**
    * Creates an encoding profile for AAC audio.
    * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
    * @return Returns a media encoding profile.
    */
  def createM4a(quality: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /**
    * Creates an encoding profile for MP3 (MPEG-1 layer 3) audio.
    * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
    * @return Returns a media encoding profile.
    */
  def createMp3(quality: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /**
    * Creates an encoding profile for H.264 video.
    * @param quality Specifies the video resolution of the profile.
    * @return Returns a media encoding profile.
    */
  def createMp4(quality: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /**
    * Creates an instance of MediaEncodingProfile for WAV
    * @param quality The audio encoding quality.
    * @return The media encoding profile.
    */
  def createWav(quality: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /**
    * Creates an encoding profile for Windows Media Audio (WMA).
    * @param quality Specifies whether to create a profile with a low bit rate, medium bit rate, or high bit rate.
    * @return Returns a media encoding profile.
    */
  def createWma(quality: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
  /**
    * Creates an encoding profile for Windows Media Video (WMV).
    * @param quality Specifies the video resolution of the profile.
    * @return Returns a media encoding profile.
    */
  def createWmv(quality: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaEncodingProfile = js.native
}

