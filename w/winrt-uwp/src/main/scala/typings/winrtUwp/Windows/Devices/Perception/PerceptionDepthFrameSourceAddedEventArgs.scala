package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for depth frame source added events. */
trait PerceptionDepthFrameSourceAddedEventArgs extends js.Object {
  /** Gets the depth frame source that was added. */
  var frameSource: PerceptionDepthFrameSource
}

object PerceptionDepthFrameSourceAddedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionDepthFrameSource): PerceptionDepthFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionDepthFrameSourceAddedEventArgs]
  }
}

