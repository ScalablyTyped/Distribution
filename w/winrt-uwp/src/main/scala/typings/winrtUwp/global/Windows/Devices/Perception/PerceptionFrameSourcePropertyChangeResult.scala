package typings.winrtUwp.global.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an attempted property change on a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeResult")
@js.native
abstract class PerceptionFrameSourcePropertyChangeResult ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeResult {
  /** Gets a PerceptionFrameSourcePropertyChangeStatus indicating the status of the change request, including whether or not the change took effect. */
  /* CompleteClass */
  override var newValue: js.Any = js.native
  /** Gets the value of the property after the change request has been processed. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus = js.native
}

