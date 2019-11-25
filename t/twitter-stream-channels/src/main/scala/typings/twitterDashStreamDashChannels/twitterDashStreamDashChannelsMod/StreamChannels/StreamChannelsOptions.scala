package typings.twitterDashStreamDashChannels.twitterDashStreamDashChannelsMod.StreamChannels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamChannelsOptions extends js.Object {
  var enableChannelsEvents: js.UndefOr[Boolean] = js.undefined
  var enableKeywordsEvents: js.UndefOr[Boolean] = js.undefined
  var enableRootChannelsEvent: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[String] = js.undefined
  var locations: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[js.Object] = js.undefined
}

object StreamChannelsOptions {
  @scala.inline
  def apply(
    enableChannelsEvents: js.UndefOr[Boolean] = js.undefined,
    enableKeywordsEvents: js.UndefOr[Boolean] = js.undefined,
    enableRootChannelsEvent: js.UndefOr[Boolean] = js.undefined,
    follow: String = null,
    locations: String = null,
    track: js.Object = null
  ): StreamChannelsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableChannelsEvents)) __obj.updateDynamic("enableChannelsEvents")(enableChannelsEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeywordsEvents)) __obj.updateDynamic("enableKeywordsEvents")(enableKeywordsEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRootChannelsEvent)) __obj.updateDynamic("enableRootChannelsEvent")(enableRootChannelsEvent.asInstanceOf[js.Any])
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamChannelsOptions]
  }
}

