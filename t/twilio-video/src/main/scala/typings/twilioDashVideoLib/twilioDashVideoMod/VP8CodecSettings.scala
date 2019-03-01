package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VP8CodecSettings extends js.Object {
  var name: VideoCodec
  var simulcast: js.UndefOr[scala.Boolean] = js.undefined
}

object VP8CodecSettings {
  @scala.inline
  def apply(name: VideoCodec, simulcast: js.UndefOr[scala.Boolean] = js.undefined): VP8CodecSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(simulcast)) __obj.updateDynamic("simulcast")(simulcast)
    __obj.asInstanceOf[VP8CodecSettings]
  }
}

