package typings.twitchExt

import typings.twitchExt.anon.HostedChannelId
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

/**
  * The result object as passed to the onContext callback.
  *
  * @see TwitchExt.onContext
  */
@js.native
trait TwitchExtContext extends js.Object {
  /**
    * If true, player controls are visible (e.g., due to mouseover).
    * Do not use this for mobile extensions; it is not sent for mobile.
    */
  var arePlayerControlsVisible: Boolean = js.native
  /**
    * Bitrate of the broadcast.
    */
  var bitrate: Double = js.native
  /**
    * Buffer size of the broadcast.
    */
  var bufferSize: Double = js.native
  /**
    * Display size of the player.
    */
  var displayResolution: String = js.native
  /**
    * Game being broadcast.
    */
  var game: String = js.native
  /**
    * Number of seconds of latency between the broadcaster and viewer.
    */
  var hlsLatencyBroadcaster: Double = js.native
  /**
    * Information about the current channel’s hosting status, or undefined if the channel is not currently hosting.
    */
  var hostingInfo: js.UndefOr[HostedChannelId] = js.native
  /**
    * If true, the viewer is watching in fullscreen mode.
    * Do not use this for mobile extensions; it is not sent for mobile.
    */
  var isFullScreen: Boolean = js.native
  /**
    * If true, the viewer has muted the stream.
    */
  var isMuted: Boolean = js.native
  /**
    * If true, the viewer has paused the stream.
    */
  var isPaused: Boolean = js.native
  /**
    * If true, the viewer is watching in theater mode.
    * Do not use this for mobile extensions; it is not sent for mobile.
    */
  var isTheatreMode: Boolean = js.native
  /**
    * Language of the broadcast (e.g., "en").
    */
  var language: String = js.native
  /**
    * The mode the extension is currently run in.
    */
  var mode: viewer | dashboard | config = js.native
  /**
    * Indicates how the stream is being played.
    */
  var playbackMode: video | audio | remote | `chat-only` = js.native
  /**
    * The user’s theme setting on the Twitch website.
    */
  var theme: light | dark = js.native
  /**
    * Resolution of the broadcast.
    */
  var videoResolution: String = js.native
  /**
    * Currently selected player volume. Valid values: between 0 and 1.
    */
  var volume: Double = js.native
}

object TwitchExtContext {
  @scala.inline
  def apply(
    arePlayerControlsVisible: Boolean,
    bitrate: Double,
    bufferSize: Double,
    displayResolution: String,
    game: String,
    hlsLatencyBroadcaster: Double,
    isFullScreen: Boolean,
    isMuted: Boolean,
    isPaused: Boolean,
    isTheatreMode: Boolean,
    language: String,
    mode: viewer | dashboard | config,
    playbackMode: video | audio | remote | `chat-only`,
    theme: light | dark,
    videoResolution: String,
    volume: Double
  ): TwitchExtContext = {
    val __obj = js.Dynamic.literal(arePlayerControlsVisible = arePlayerControlsVisible.asInstanceOf[js.Any], bitrate = bitrate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any], displayResolution = displayResolution.asInstanceOf[js.Any], game = game.asInstanceOf[js.Any], hlsLatencyBroadcaster = hlsLatencyBroadcaster.asInstanceOf[js.Any], isFullScreen = isFullScreen.asInstanceOf[js.Any], isMuted = isMuted.asInstanceOf[js.Any], isPaused = isPaused.asInstanceOf[js.Any], isTheatreMode = isTheatreMode.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], playbackMode = playbackMode.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], videoResolution = videoResolution.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtContext]
  }
  @scala.inline
  implicit class TwitchExtContextOps[Self <: TwitchExtContext] (val x: Self) extends AnyVal {
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayResolution(value: String): Self = this.set("displayResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setGame(value: String): Self = this.set("game", value.asInstanceOf[js.Any])
    @scala.inline
    def setHlsLatencyBroadcaster(value: Double): Self = this.set("hlsLatencyBroadcaster", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFullScreen(value: Boolean): Self = this.set("isFullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMuted(value: Boolean): Self = this.set("isMuted", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTheatreMode(value: Boolean): Self = this.set("isTheatreMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: viewer | dashboard | config): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaybackMode(value: video | audio | remote | `chat-only`): Self = this.set("playbackMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: light | dark): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoResolution(value: String): Self = this.set("videoResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostingInfo(value: HostedChannelId): Self = this.set("hostingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostingInfo: Self = this.set("hostingInfo", js.undefined)
  }
  
}

