package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired once per second with the current progress during playback.
		 */
trait AudioPlayerProgressEvent extends AudioPlayerBaseEvent {
  /**
  			 * Current progress, in milliseconds.
  			 */
  var progress: Double
}

object AudioPlayerProgressEvent {
  @scala.inline
  def apply(progress: Double, source: AudioPlayer): AudioPlayerProgressEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerProgressEvent]
  }
}

