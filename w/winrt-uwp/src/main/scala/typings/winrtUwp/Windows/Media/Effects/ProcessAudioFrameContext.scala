package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Media.AudioFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
trait ProcessAudioFrameContext extends js.Object {
  /** Gets the input frame for an audio effect operation. */
  var inputFrame: AudioFrame
  /** Gets the output frame for an audio effect operation. */
  var outputFrame: AudioFrame
}

object ProcessAudioFrameContext {
  @scala.inline
  def apply(inputFrame: AudioFrame, outputFrame: AudioFrame): ProcessAudioFrameContext = {
    val __obj = js.Dynamic.literal(inputFrame = inputFrame.asInstanceOf[js.Any], outputFrame = outputFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessAudioFrameContext]
  }
}

