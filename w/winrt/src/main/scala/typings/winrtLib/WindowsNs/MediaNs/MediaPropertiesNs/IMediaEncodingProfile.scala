package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audio")(audio)
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[IMediaEncodingProfile]
  }
}

