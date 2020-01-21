package typings.winrtUwp.Windows.Media.Effects

import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom video effect operation within the ProcessFrame method. */
@JSGlobal("Windows.Media.Effects.ProcessVideoFrameContext")
@js.native
abstract class ProcessVideoFrameContext () extends js.Object {
  /** Gets the input frame for a video effect operation. */
  var inputFrame: VideoFrame = js.native
  /** Gets the output frame for a video effect operation. */
  var outputFrame: VideoFrame = js.native
}

