package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the encoding profile for an audio or video file. The encoding profile includes descriptions of the audio and video encoding formats, and a description of the media container. */
@js.native
trait MediaEncodingProfile extends js.Object {
  /** Gets or sets the encoding properties for the audio stream. */
  var audio: AudioEncodingProperties = js.native
  /** Gets or sets the properties of the media container. */
  var container: ContainerEncodingProperties = js.native
  /** Gets or sets the encoding properties for the video stream. */
  var video: VideoEncodingProperties = js.native
}

object MediaEncodingProfile {
  @scala.inline
  def apply(
    audio: AudioEncodingProperties,
    container: ContainerEncodingProperties,
    video: VideoEncodingProperties
  ): MediaEncodingProfile = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEncodingProfile]
  }
  @scala.inline
  implicit class MediaEncodingProfileOps[Self <: MediaEncodingProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudio(value: AudioEncodingProperties): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: ContainerEncodingProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideo(value: VideoEncodingProperties): Self = this.set("video", value.asInstanceOf[js.Any])
  }
  
}

