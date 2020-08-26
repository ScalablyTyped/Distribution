package typings.videoJs.mod.videojs.TextTrackCueList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcue}
  */
@js.native
trait TextTrackCue extends js.Object {
  /**
    * The end time for this text track cue
    */
  var endTime: Double = js.native
  /**
    * The unique id for this text track cue
    */
  var id: String = js.native
  /**
    * Pause when the end time is reached if true.
    */
  var pauseOnExit: Boolean = js.native
  /**
    * The start time for this text track cue
    */
  var startTime: Double = js.native
  /**
    * The text this cue is holding
    */
  var text: String = js.native
}

object TextTrackCue {
  @scala.inline
  def apply(endTime: Double, id: String, pauseOnExit: Boolean, startTime: Double, text: String): TextTrackCue = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pauseOnExit = pauseOnExit.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCue]
  }
  @scala.inline
  implicit class TextTrackCueOps[Self <: TextTrackCue] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPauseOnExit(value: Boolean): Self = this.set("pauseOnExit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

