package typings.winrtUwp.Windows.Media.Streaming.Adaptive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PlaybackBitrateChanged event. */
trait AdaptiveMediaSourcePlaybackBitrateChangedEventArgs extends js.Object {
  /** Gets a value indicating whether the media source contains only audio data. */
  var audioOnly: Boolean
  /** Gets the new playback bitrate. */
  var newValue: Double
  /** Gets the old playback bitrate. */
  var oldValue: Double
}

object AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
  @scala.inline
  def apply(audioOnly: Boolean, newValue: Double, oldValue: Double): AdaptiveMediaSourcePlaybackBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(audioOnly = audioOnly.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  }
}

