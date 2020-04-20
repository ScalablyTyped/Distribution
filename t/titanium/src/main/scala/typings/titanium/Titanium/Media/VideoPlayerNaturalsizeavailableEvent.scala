package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Fired when the natural size of the current movie is determined.
		 */
trait VideoPlayerNaturalsizeavailableEvent extends VideoPlayerBaseEvent {
  /**
  			 * Current value of the [naturalSize](Titanium.Media.VideoPlayer.naturalSize) property.
  			 */
  var naturalSize: Double
}

object VideoPlayerNaturalsizeavailableEvent {
  @scala.inline
  def apply(naturalSize: Double, source: VideoPlayer): VideoPlayerNaturalsizeavailableEvent = {
    val __obj = js.Dynamic.literal(naturalSize = naturalSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerNaturalsizeavailableEvent]
  }
}

