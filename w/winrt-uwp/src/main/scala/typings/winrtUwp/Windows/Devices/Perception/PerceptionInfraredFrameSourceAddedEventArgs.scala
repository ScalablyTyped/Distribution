package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for infrared frame source added events. */
trait PerceptionInfraredFrameSourceAddedEventArgs extends js.Object {
  /** Gets the infrared frame source that was added. */
  var frameSource: PerceptionInfraredFrameSource
}

object PerceptionInfraredFrameSourceAddedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionInfraredFrameSource): PerceptionInfraredFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrameSourceAddedEventArgs]
  }
}

