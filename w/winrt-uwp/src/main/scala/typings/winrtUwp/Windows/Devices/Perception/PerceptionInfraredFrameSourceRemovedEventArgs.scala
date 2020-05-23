package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for infrared frame source removed events. */
trait PerceptionInfraredFrameSourceRemovedEventArgs extends js.Object {
  /** Gets the infrared frame source that was removed. */
  var frameSource: PerceptionInfraredFrameSource
}

object PerceptionInfraredFrameSourceRemovedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionInfraredFrameSource): PerceptionInfraredFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrameSourceRemovedEventArgs]
  }
}

