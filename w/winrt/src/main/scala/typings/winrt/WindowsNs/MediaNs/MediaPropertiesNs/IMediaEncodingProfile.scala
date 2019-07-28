package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaEncodingProfile extends js.Object {
  var audio: AudioEncodingProperties
  var container: ContainerEncodingProperties
  var video: VideoEncodingProperties
}

object IMediaEncodingProfile {
  @scala.inline
  def apply(
    audio: AudioEncodingProperties,
    container: ContainerEncodingProperties,
    video: VideoEncodingProperties
  ): IMediaEncodingProfile = {
    val __obj = js.Dynamic.literal(audio = audio, container = container, video = video)
  
    __obj.asInstanceOf[IMediaEncodingProfile]
  }
}

