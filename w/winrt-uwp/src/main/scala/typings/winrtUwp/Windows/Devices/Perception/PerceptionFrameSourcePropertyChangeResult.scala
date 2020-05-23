package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an attempted property change on a frame source. */
trait PerceptionFrameSourcePropertyChangeResult extends js.Object {
  /** Gets a PerceptionFrameSourcePropertyChangeStatus indicating the status of the change request, including whether or not the change took effect. */
  var newValue: js.Any
  /** Gets the value of the property after the change request has been processed. */
  var status: PerceptionFrameSourcePropertyChangeStatus
}

object PerceptionFrameSourcePropertyChangeResult {
  @scala.inline
  def apply(newValue: js.Any, status: PerceptionFrameSourcePropertyChangeStatus): PerceptionFrameSourcePropertyChangeResult = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameSourcePropertyChangeResult]
  }
}

