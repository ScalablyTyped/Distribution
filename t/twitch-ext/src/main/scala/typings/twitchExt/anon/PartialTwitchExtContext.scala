package typings.twitchExt.anon

import typings.twitchExt.twitchExtStrings.`chat-only`
import typings.twitchExt.twitchExtStrings.audio
import typings.twitchExt.twitchExtStrings.config
import typings.twitchExt.twitchExtStrings.dark
import typings.twitchExt.twitchExtStrings.dashboard
import typings.twitchExt.twitchExtStrings.light
import typings.twitchExt.twitchExtStrings.remote
import typings.twitchExt.twitchExtStrings.video
import typings.twitchExt.twitchExtStrings.viewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<twitch-ext.TwitchExtContext> */
trait PartialTwitchExtContext extends js.Object {
  var arePlayerControlsVisible: js.UndefOr[Boolean] = js.undefined
  var bitrate: js.UndefOr[Double] = js.undefined
  var bufferSize: js.UndefOr[Double] = js.undefined
  var displayResolution: js.UndefOr[String] = js.undefined
  var game: js.UndefOr[String] = js.undefined
  var hlsLatencyBroadcaster: js.UndefOr[Double] = js.undefined
  var hostingInfo: js.UndefOr[HostedChannelId] = js.undefined
  var isFullScreen: js.UndefOr[Boolean] = js.undefined
  var isMuted: js.UndefOr[Boolean] = js.undefined
  var isPaused: js.UndefOr[Boolean] = js.undefined
  var isTheatreMode: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[viewer | dashboard | config] = js.undefined
  var playbackMode: js.UndefOr[video | audio | remote | `chat-only`] = js.undefined
  var theme: js.UndefOr[light | dark] = js.undefined
  var videoResolution: js.UndefOr[String] = js.undefined
  var volume: js.UndefOr[Double] = js.undefined
}

object PartialTwitchExtContext {
  @scala.inline
  def apply(
    arePlayerControlsVisible: js.UndefOr[Boolean] = js.undefined,
    bitrate: js.UndefOr[Double] = js.undefined,
    bufferSize: js.UndefOr[Double] = js.undefined,
    displayResolution: String = null,
    game: String = null,
    hlsLatencyBroadcaster: js.UndefOr[Double] = js.undefined,
    hostingInfo: HostedChannelId = null,
    isFullScreen: js.UndefOr[Boolean] = js.undefined,
    isMuted: js.UndefOr[Boolean] = js.undefined,
    isPaused: js.UndefOr[Boolean] = js.undefined,
    isTheatreMode: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    mode: viewer | dashboard | config = null,
    playbackMode: video | audio | remote | `chat-only` = null,
    theme: light | dark = null,
    videoResolution: String = null,
    volume: js.UndefOr[Double] = js.undefined
  ): PartialTwitchExtContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arePlayerControlsVisible)) __obj.updateDynamic("arePlayerControlsVisible")(arePlayerControlsVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bitrate)) __obj.updateDynamic("bitrate")(bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferSize)) __obj.updateDynamic("bufferSize")(bufferSize.get.asInstanceOf[js.Any])
    if (displayResolution != null) __obj.updateDynamic("displayResolution")(displayResolution.asInstanceOf[js.Any])
    if (game != null) __obj.updateDynamic("game")(game.asInstanceOf[js.Any])
    if (!js.isUndefined(hlsLatencyBroadcaster)) __obj.updateDynamic("hlsLatencyBroadcaster")(hlsLatencyBroadcaster.get.asInstanceOf[js.Any])
    if (hostingInfo != null) __obj.updateDynamic("hostingInfo")(hostingInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(isFullScreen)) __obj.updateDynamic("isFullScreen")(isFullScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMuted)) __obj.updateDynamic("isMuted")(isMuted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPaused)) __obj.updateDynamic("isPaused")(isPaused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTheatreMode)) __obj.updateDynamic("isTheatreMode")(isTheatreMode.get.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (playbackMode != null) __obj.updateDynamic("playbackMode")(playbackMode.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (videoResolution != null) __obj.updateDynamic("videoResolution")(videoResolution.asInstanceOf[js.Any])
    if (!js.isUndefined(volume)) __obj.updateDynamic("volume")(volume.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTwitchExtContext]
  }
}

