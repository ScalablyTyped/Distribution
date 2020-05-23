package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the network [loadState](Titanium.Media.VideoPlayer.loadState) changes.
  */
trait VideoPlayerLoadstateEvent extends VideoPlayerBaseEvent {
  /**
    * Current value of the [loadState](Titanium.Media.VideoPlayer.loadState) property.
    */
  var loadState: Double
}

object VideoPlayerLoadstateEvent {
  @scala.inline
  def apply(loadState: Double, source: VideoPlayer): VideoPlayerLoadstateEvent = {
    val __obj = js.Dynamic.literal(loadState = loadState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerLoadstateEvent]
  }
}

