package typings.twilioVideo.mod

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
    maxPacketLifeTime: js.UndefOr[Null | Double] = js.undefined,
    maxRetransmits: js.UndefOr[Null | Double] = js.undefined,
    ordered: js.UndefOr[Boolean] = js.undefined
  ): LocalDataTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxPacketLifeTime)) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetransmits)) __obj.updateDynamic("maxRetransmits")(maxRetransmits.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalDataTrackOptions]
  }
}

