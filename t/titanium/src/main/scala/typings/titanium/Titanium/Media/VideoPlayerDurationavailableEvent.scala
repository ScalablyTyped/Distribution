package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the video duration is available.
  */
@js.native
trait VideoPlayerDurationavailableEvent extends VideoPlayerBaseEvent {
  /**
    * Video duration, in milliseconds.
    */
  var duration: Double = js.native
}

object VideoPlayerDurationavailableEvent {
  @scala.inline
  def apply(duration: Double, source: VideoPlayer): VideoPlayerDurationavailableEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerDurationavailableEvent]
  }
  @scala.inline
  implicit class VideoPlayerDurationavailableEventOps[Self <: VideoPlayerDurationavailableEvent] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
  }
  
}

