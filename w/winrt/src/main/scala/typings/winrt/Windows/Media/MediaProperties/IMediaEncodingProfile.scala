package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMediaEncodingProfile extends js.Object {
  var audio: AudioEncodingProperties = js.native
  var container: ContainerEncodingProperties = js.native
  var video: VideoEncodingProperties = js.native
}

object IMediaEncodingProfile {
  @scala.inline
  def apply(
    audio: AudioEncodingProperties,
    container: ContainerEncodingProperties,
    video: VideoEncodingProperties
  ): IMediaEncodingProfile = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaEncodingProfile]
  }
  @scala.inline
  implicit class IMediaEncodingProfileOps[Self <: IMediaEncodingProfile] (val x: Self) extends AnyVal {
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

