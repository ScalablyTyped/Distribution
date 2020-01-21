package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an attempted property change on a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeResult")
@js.native
abstract class PerceptionFrameSourcePropertyChangeResult () extends js.Object {
  /** Gets a PerceptionFrameSourcePropertyChangeStatus indicating the status of the change request, including whether or not the change took effect. */
  var newValue: js.Any = js.native
  /** Gets the value of the property after the change request has been processed. */
  var status: PerceptionFrameSourcePropertyChangeStatus = js.native
}

