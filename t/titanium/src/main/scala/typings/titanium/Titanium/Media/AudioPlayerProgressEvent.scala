package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired once per second with the current progress during playback.
  */
@js.native
trait AudioPlayerProgressEvent extends AudioPlayerBaseEvent {
  /**
    * Current progress, in milliseconds.
    */
  var progress: Double = js.native
}

object AudioPlayerProgressEvent {
  @scala.inline
  def apply(progress: Double, source: AudioPlayer): AudioPlayerProgressEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerProgressEvent]
  }
  @scala.inline
  implicit class AudioPlayerProgressEventOps[Self <: AudioPlayerProgressEvent] (val x: Self) extends AnyVal {
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
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
  }
  
}

