package typings
package twitchDashExtLib

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
  var arePlayerControlsVisible: scala.Boolean
  /**
  	 * Bitrate of the broadcast.
  	 */
  var bitrate: scala.Double
  /**
  	 * Buffer size of the broadcast.
  	 */
  var bufferSize: scala.Double
  /**
  	 * Display size of the player.
  	 */
  var displayResolution: java.lang.String
  /**
  	 * Game being broadcast.
  	 */
  var game: java.lang.String
  /**
  	 * Number of seconds of latency between the broadcaster and viewer.
  	 */
  var hlsLatencyBroadcaster: scala.Double
  /**
  	 * If true, the viewer is watching in fullscreen mode.
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var isFullScreen: scala.Boolean
  /**
  	 * If true, the viewer has muted the stream.
  	 */
  var isMuted: scala.Boolean
  /**
  	 * If true, the viewer has paused the stream.
  	 */
  var isPaused: scala.Boolean
  /**
  	 * If true, the viewer is watching in theater mode.
  	 * Do not use this for mobile extensions; it is not sent for mobile.
  	 */
  var isTheatreMode: scala.Boolean
  /**
  	 * Language of the broadcast (e.g., "en").
  	 */
  var language: java.lang.String
  /**
  	 * The mode the extension is currently run in.
  	 */
  var mode: twitchDashExtLib.twitchDashExtLibStrings.viewer | twitchDashExtLib.twitchDashExtLibStrings.dashboard | twitchDashExtLib.twitchDashExtLibStrings.config
  /**
  	 * Indicates how the stream is being played.
  	 */
  var playbackMode: twitchDashExtLib.twitchDashExtLibStrings.video | twitchDashExtLib.twitchDashExtLibStrings.audio | twitchDashExtLib.twitchDashExtLibStrings.remote | twitchDashExtLib.twitchDashExtLibStrings.`chat-only`
  /**
  	 * The user’s theme setting on the Twitch website.
  	 */
  var theme: twitchDashExtLib.twitchDashExtLibStrings.light | twitchDashExtLib.twitchDashExtLibStrings.dark
  /**
  	 * Resolution of the broadcast.
  	 */
  var videoResolution: java.lang.String
  /**
  	 * Currently selected player volume. Valid values: between 0 and 1.
  	 */
  var volume: scala.Double
}

object TwitchExtContext {
  @scala.inline
  def apply(
    arePlayerControlsVisible: scala.Boolean,
    bitrate: scala.Double,
    bufferSize: scala.Double,
    displayResolution: java.lang.String,
    game: java.lang.String,
    hlsLatencyBroadcaster: scala.Double,
    isFullScreen: scala.Boolean,
    isMuted: scala.Boolean,
    isPaused: scala.Boolean,
    isTheatreMode: scala.Boolean,
    language: java.lang.String,
    mode: twitchDashExtLib.twitchDashExtLibStrings.viewer | twitchDashExtLib.twitchDashExtLibStrings.dashboard | twitchDashExtLib.twitchDashExtLibStrings.config,
    playbackMode: twitchDashExtLib.twitchDashExtLibStrings.video | twitchDashExtLib.twitchDashExtLibStrings.audio | twitchDashExtLib.twitchDashExtLibStrings.remote | twitchDashExtLib.twitchDashExtLibStrings.`chat-only`,
    theme: twitchDashExtLib.twitchDashExtLibStrings.light | twitchDashExtLib.twitchDashExtLibStrings.dark,
    videoResolution: java.lang.String,
    volume: scala.Double
  ): TwitchExtContext = {
    val __obj = js.Dynamic.literal(arePlayerControlsVisible = arePlayerControlsVisible, bitrate = bitrate, bufferSize = bufferSize, displayResolution = displayResolution, game = game, hlsLatencyBroadcaster = hlsLatencyBroadcaster, isFullScreen = isFullScreen, isMuted = isMuted, isPaused = isPaused, isTheatreMode = isTheatreMode, language = language, mode = mode.asInstanceOf[js.Any], playbackMode = playbackMode.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], videoResolution = videoResolution, volume = volume)
  
    __obj.asInstanceOf[TwitchExtContext]
  }
}

