package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Media.AudioFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments for an AudioFrameCompleted event. */
trait AudioFrameCompletedEventArgs extends js.Object {
  /** Gets the audio frame that was just completed by the AudioFrameInputNode . A frame is completed when all of the audio in the frame has been consumed by the audio graph. */
  var frame: AudioFrame
}

object AudioFrameCompletedEventArgs {
  @scala.inline
  def apply(frame: AudioFrame): AudioFrameCompletedEventArgs = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFrameCompletedEventArgs]
  }
}

