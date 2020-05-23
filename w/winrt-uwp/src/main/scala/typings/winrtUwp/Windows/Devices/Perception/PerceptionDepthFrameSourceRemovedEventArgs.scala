package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for depth frame source removed events. */
trait PerceptionDepthFrameSourceRemovedEventArgs extends js.Object {
  /** Gets the depth frame source that was removed. */
  var frameSource: PerceptionDepthFrameSource
}

object PerceptionDepthFrameSourceRemovedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionDepthFrameSource): PerceptionDepthFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionDepthFrameSourceRemovedEventArgs]
  }
}

