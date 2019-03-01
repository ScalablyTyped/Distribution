package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCodecSettings extends js.Object {
  var codec: VideoCodec
}

object VideoCodecSettings {
  @scala.inline
  def apply(codec: VideoCodec): VideoCodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codec")(codec)
    __obj.asInstanceOf[VideoCodecSettings]
  }
}

