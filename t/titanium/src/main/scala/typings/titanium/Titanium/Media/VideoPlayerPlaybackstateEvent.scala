package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the [playbackState](Titanium.Media.VideoPlayer.playbackState) changes.
  */
trait VideoPlayerPlaybackstateEvent extends VideoPlayerBaseEvent {
  /**
    * Current value of the [playbackState](Titanium.Media.VideoPlayer.playbackState) property.
    */
  var playbackState: Double
}

object VideoPlayerPlaybackstateEvent {
  @scala.inline
  def apply(playbackState: Double, source: VideoPlayer): VideoPlayerPlaybackstateEvent = {
    val __obj = js.Dynamic.literal(playbackState = playbackState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerPlaybackstateEvent]
  }
}

