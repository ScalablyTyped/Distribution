package typings.twilioVideo.mod

import typings.twilioVideo.mod.Track.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoBandwidthProfileOptions extends js.Object {
  var dominantSpeakerPriority: js.UndefOr[Priority] = js.undefined
  var maxSubscriptionBitrate: js.UndefOr[Double] = js.undefined
  var maxTracks: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[BandwidthProfileMode] = js.undefined
  var renderDimensions: js.UndefOr[VideoRenderDimensions] = js.undefined
}

object VideoBandwidthProfileOptions {
  @scala.inline
  def apply(
    dominantSpeakerPriority: Priority = null,
    maxSubscriptionBitrate: js.UndefOr[Double] = js.undefined,
    maxTracks: js.UndefOr[Double] = js.undefined,
    mode: BandwidthProfileMode = null,
    renderDimensions: VideoRenderDimensions = null
  ): VideoBandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    if (dominantSpeakerPriority != null) __obj.updateDynamic("dominantSpeakerPriority")(dominantSpeakerPriority.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSubscriptionBitrate)) __obj.updateDynamic("maxSubscriptionBitrate")(maxSubscriptionBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTracks)) __obj.updateDynamic("maxTracks")(maxTracks.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (renderDimensions != null) __obj.updateDynamic("renderDimensions")(renderDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoBandwidthProfileOptions]
  }
}

