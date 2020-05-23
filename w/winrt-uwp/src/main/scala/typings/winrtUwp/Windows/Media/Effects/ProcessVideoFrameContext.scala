package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom video effect operation within the ProcessFrame method. */
trait ProcessVideoFrameContext extends js.Object {
  /** Gets the input frame for a video effect operation. */
  var inputFrame: VideoFrame
  /** Gets the output frame for a video effect operation. */
  var outputFrame: VideoFrame
}

object ProcessVideoFrameContext {
  @scala.inline
  def apply(inputFrame: VideoFrame, outputFrame: VideoFrame): ProcessVideoFrameContext = {
    val __obj = js.Dynamic.literal(inputFrame = inputFrame.asInstanceOf[js.Any], outputFrame = outputFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessVideoFrameContext]
  }
}

