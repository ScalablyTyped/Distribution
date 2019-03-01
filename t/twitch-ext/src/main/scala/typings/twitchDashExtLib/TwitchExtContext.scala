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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arePlayerControlsVisible")(arePlayerControlsVisible)
    __obj.updateDynamic("bitrate")(bitrate)
    __obj.updateDynamic("bufferSize")(bufferSize)
    __obj.updateDynamic("displayResolution")(displayResolution)
    __obj.updateDynamic("game")(game)
    __obj.updateDynamic("hlsLatencyBroadcaster")(hlsLatencyBroadcaster)
    __obj.updateDynamic("isFullScreen")(isFullScreen)
    __obj.updateDynamic("isMuted")(isMuted)
    __obj.updateDynamic("isPaused")(isPaused)
    __obj.updateDynamic("isTheatreMode")(isTheatreMode)
    __obj.updateDynamic("language")(language)
    __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.updateDynamic("playbackMode")(playbackMode.asInstanceOf[js.Any])
    __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.updateDynamic("videoResolution")(videoResolution)
    __obj.updateDynamic("volume")(volume)
    __obj.asInstanceOf[TwitchExtContext]
  }
}

