package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for color frame source added events. */
trait PerceptionColorFrameSourceRemovedEventArgs extends js.Object {
  /** Gets the color frame source that was removed. */
  var frameSource: PerceptionColorFrameSource
}

object PerceptionColorFrameSourceRemovedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionColorFrameSource): PerceptionColorFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrameSourceRemovedEventArgs]
  }
}

