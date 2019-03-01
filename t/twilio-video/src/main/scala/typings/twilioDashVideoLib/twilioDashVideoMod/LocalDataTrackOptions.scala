package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalDataTrackOptions extends js.Object {
  var maxPacketLifeTime: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxRetransmits: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
}

object LocalDataTrackOptions {
  @scala.inline
  def apply(
    maxPacketLifeTime: scala.Int | scala.Double = null,
    maxRetransmits: scala.Int | scala.Double = null,
    ordered: js.UndefOr[scala.Boolean] = js.undefined
  ): LocalDataTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (maxPacketLifeTime != null) __obj.updateDynamic("maxPacketLifeTime")(maxPacketLifeTime.asInstanceOf[js.Any])
    if (maxRetransmits != null) __obj.updateDynamic("maxRetransmits")(maxRetransmits.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    __obj.asInstanceOf[LocalDataTrackOptions]
  }
}

