package typings.twilioDashVideo.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalDataTrackOptions extends js.Object {
  var maxPacketLifeTime: js.UndefOr[Double | Null] = js.undefined
  var maxRetransmits: js.UndefOr[Double | Null] = js.undefined
  var ordered: js.UndefOr[Boolean] = js.undefined
}

object LocalDataTrackOptions {
  @scala.inline
  def apply(
    maxPacketLifeTime: Int | Double = null,
    maxRetransmits: Int | Double = null,
    ordered: js.UndefOr[Boolean] = js.undefined
  ): LocalDataTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (maxPacketLifeTime != null) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.asInstanceOf[js.Any])
    if (maxRetransmits != null) __obj.updateDynamic("maxRetransmits")(maxRetransmits.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalDataTrackOptions]
  }
}

