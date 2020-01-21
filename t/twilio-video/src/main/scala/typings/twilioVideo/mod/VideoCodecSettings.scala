package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCodecSettings extends js.Object {
  var codec: VideoCodec
}

object VideoCodecSettings {
  @scala.inline
  def apply(codec: VideoCodec): VideoCodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VideoCodecSettings]
  }
}

