package typings
package twitterDashStreamDashChannelsLib.twitterDashStreamDashChannelsMod.TwitterStreamChannelsNs.StreamChannelsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamChannelsOptions extends js.Object {
  var enableChannelsEvents: js.UndefOr[scala.Boolean] = js.undefined
  var enableKeywordsEvents: js.UndefOr[scala.Boolean] = js.undefined
  var enableRootChannelsEvent: js.UndefOr[scala.Boolean] = js.undefined
  var follow: js.UndefOr[java.lang.String] = js.undefined
  var locations: js.UndefOr[java.lang.String] = js.undefined
  var track: js.UndefOr[js.Object] = js.undefined
}

object StreamChannelsOptions {
  @scala.inline
  def apply(
    enableChannelsEvents: js.UndefOr[scala.Boolean] = js.undefined,
    enableKeywordsEvents: js.UndefOr[scala.Boolean] = js.undefined,
    enableRootChannelsEvent: js.UndefOr[scala.Boolean] = js.undefined,
    follow: java.lang.String = null,
    locations: java.lang.String = null,
    track: js.Object = null
  ): StreamChannelsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableChannelsEvents)) __obj.updateDynamic("enableChannelsEvents")(enableChannelsEvents)
    if (!js.isUndefined(enableKeywordsEvents)) __obj.updateDynamic("enableKeywordsEvents")(enableKeywordsEvents)
    if (!js.isUndefined(enableRootChannelsEvent)) __obj.updateDynamic("enableRootChannelsEvent")(enableRootChannelsEvent)
    if (follow != null) __obj.updateDynamic("follow")(follow)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (track != null) __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[StreamChannelsOptions]
  }
}

