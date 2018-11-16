package typings
package winrtDashUwpLib.WindowsNs.MediaNs.StreamingNs.AdaptiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PlaybackBitrateChanged event. */
@JSGlobal("Windows.Media.Streaming.Adaptive.AdaptiveMediaSourcePlaybackBitrateChangedEventArgs")
@js.native
abstract class AdaptiveMediaSourcePlaybackBitrateChangedEventArgs () extends js.Object {
  /** Gets a value indicating whether the media source contains only audio data. */
  var audioOnly: scala.Boolean = js.native
  /** Gets the new playback bitrate. */
  var newValue: scala.Double = js.native
  /** Gets the old playback bitrate. */
  var oldValue: scala.Double = js.native
}

