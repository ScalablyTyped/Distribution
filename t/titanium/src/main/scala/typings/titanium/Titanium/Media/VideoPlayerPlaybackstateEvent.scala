package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the [playbackState](Titanium.Media.VideoPlayer.playbackState) changes.
  */
@js.native
trait VideoPlayerPlaybackstateEvent extends VideoPlayerBaseEvent {
  /**
    * Current value of the [playbackState](Titanium.Media.VideoPlayer.playbackState) property.
    */
  var playbackState: Double = js.native
}

object VideoPlayerPlaybackstateEvent {
  @scala.inline
  def apply(playbackState: Double, source: VideoPlayer): VideoPlayerPlaybackstateEvent = {
    val __obj = js.Dynamic.literal(playbackState = playbackState.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerPlaybackstateEvent]
  }
  @scala.inline
  implicit class VideoPlayerPlaybackstateEventOps[Self <: VideoPlayerPlaybackstateEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlaybackState(value: Double): Self = this.set("playbackState", value.asInstanceOf[js.Any])
  }
  
}

