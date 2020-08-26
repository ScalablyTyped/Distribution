package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Media.AudioFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for an AudioFrameCompleted event. */
@js.native
trait AudioFrameCompletedEventArgs extends js.Object {
  /** Gets the audio frame that was just completed by the AudioFrameInputNode . A frame is completed when all of the audio in the frame has been consumed by the audio graph. */
  var frame: AudioFrame = js.native
}

object AudioFrameCompletedEventArgs {
  @scala.inline
  def apply(frame: AudioFrame): AudioFrameCompletedEventArgs = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFrameCompletedEventArgs]
  }
  @scala.inline
  implicit class AudioFrameCompletedEventArgsOps[Self <: AudioFrameCompletedEventArgs] (val x: Self) extends AnyVal {
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
    def setFrame(value: AudioFrame): Self = this.set("frame", value.asInstanceOf[js.Any])
  }
  
}

