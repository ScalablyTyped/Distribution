package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for color frame source added events. */
trait PerceptionColorFrameSourceAddedEventArgs extends js.Object {
  /** Gets the color frame source that was added. */
  var frameSource: PerceptionColorFrameSource
}

object PerceptionColorFrameSourceAddedEventArgs {
  @scala.inline
  def apply(frameSource: PerceptionColorFrameSource): PerceptionColorFrameSourceAddedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrameSourceAddedEventArgs]
  }
}

