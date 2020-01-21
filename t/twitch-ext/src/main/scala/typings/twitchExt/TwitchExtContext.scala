package typings.twitchExt

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
trait TwitchExtContext extends js.Object {
  /**
  	 * If true, player controls are visible (e.g., due to mouseover).
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var arePlayerControlsVisible: Boolean
  /**
  	 * Bitrate of the broadcast.
  	 */
  var bitrate: Double
  /**
  	 * Buffer size of the broadcast.
  	 */
  var bufferSize: Double
  /**
  	 * Display size of the player.
  	 */
  var displayResolution: String
  /**
  	 * Game being broadcast.
  	 */
  var game: String
  /**
  	 * Number of seconds of latency between the broadcaster and viewer.
  	 */
  var hlsLatencyBroadcaster: Double
  /**
  	 * If true, the viewer is watching in fullscreen mode.
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var isFullScreen: Boolean
  /**
  	 * If true, the viewer has muted the stream.
  	 */
  var isMuted: Boolean
  /**
  	 * If true, the viewer has paused the stream.
  	 */
  var isPaused: Boolean
  /**
  	 * If true, the viewer is watching in theater mode.
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var isTheatreMode: Boolean
  /**
  	 * Language of the broadcast (e.g., "en").
  	 */
  var language: String
  /**
  	 * The mode the extension is currently run in.
  	 */
  var mode: viewer | dashboard | config
  /**
  	 * Indicates how the stream is being played.
  	 */
  var playbackMode: video | audio | remote | `chat-only`
  /**
  	 * The user’s theme setting on the Twitch website.
  	 */
  var theme: light | dark
  /**
  	 * Resolution of the broadcast.
  	 */
  var videoResolution: String
  /**
  	 * Currently selected player volume. Valid values: between 0 and 1.
  	 */
  var volume: Double
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
}

