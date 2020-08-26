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
@js.native
trait PartialTwitchExtContext extends js.Object {
  var arePlayerControlsVisible: js.UndefOr[Boolean] = js.native
  var bitrate: js.UndefOr[Double] = js.native
  var bufferSize: js.UndefOr[Double] = js.native
  var displayResolution: js.UndefOr[String] = js.native
  var game: js.UndefOr[String] = js.native
  var hlsLatencyBroadcaster: js.UndefOr[Double] = js.native
  var hostingInfo: js.UndefOr[HostedChannelId] = js.native
  var isFullScreen: js.UndefOr[Boolean] = js.native
  var isMuted: js.UndefOr[Boolean] = js.native
  var isPaused: js.UndefOr[Boolean] = js.native
  var isTheatreMode: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var mode: js.UndefOr[viewer | dashboard | config] = js.native
  var playbackMode: js.UndefOr[video | audio | remote | `chat-only`] = js.native
  var theme: js.UndefOr[light | dark] = js.native
  var videoResolution: js.UndefOr[String] = js.native
  var volume: js.UndefOr[Double] = js.native
}

object PartialTwitchExtContext {
  @scala.inline
  def apply(): PartialTwitchExtContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTwitchExtContext]
  }
  @scala.inline
  implicit class PartialTwitchExtContextOps[Self <: PartialTwitchExtContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArePlayerControlsVisible(value: Boolean): Self = this.set("arePlayerControlsVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArePlayerControlsVisible: Self = this.set("arePlayerControlsVisible", js.undefined)
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    @scala.inline
    def setDisplayResolution(value: String): Self = this.set("displayResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayResolution: Self = this.set("displayResolution", js.undefined)
    @scala.inline
    def setGame(value: String): Self = this.set("game", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGame: Self = this.set("game", js.undefined)
    @scala.inline
    def setHlsLatencyBroadcaster(value: Double): Self = this.set("hlsLatencyBroadcaster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHlsLatencyBroadcaster: Self = this.set("hlsLatencyBroadcaster", js.undefined)
    @scala.inline
    def setHostingInfo(value: HostedChannelId): Self = this.set("hostingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostingInfo: Self = this.set("hostingInfo", js.undefined)
    @scala.inline
    def setIsFullScreen(value: Boolean): Self = this.set("isFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFullScreen: Self = this.set("isFullScreen", js.undefined)
    @scala.inline
    def setIsMuted(value: Boolean): Self = this.set("isMuted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMuted: Self = this.set("isMuted", js.undefined)
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPaused: Self = this.set("isPaused", js.undefined)
    @scala.inline
    def setIsTheatreMode(value: Boolean): Self = this.set("isTheatreMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTheatreMode: Self = this.set("isTheatreMode", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMode(value: viewer | dashboard | config): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setPlaybackMode(value: video | audio | remote | `chat-only`): Self = this.set("playbackMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaybackMode: Self = this.set("playbackMode", js.undefined)
    @scala.inline
    def setTheme(value: light | dark): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setVideoResolution(value: String): Self = this.set("videoResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoResolution: Self = this.set("videoResolution", js.undefined)
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

