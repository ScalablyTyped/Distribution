package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the video duration is available.
		 */
trait VideoPlayerDurationavailableEvent extends VideoPlayerBaseEvent {
  /**
  			 * Video duration, in milliseconds.
  			 */
  var duration: Double
}

object VideoPlayerDurationavailableEvent {
  @scala.inline
  def apply(duration: Double, source: VideoPlayer): VideoPlayerDurationavailableEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerDurationavailableEvent]
  }
}

