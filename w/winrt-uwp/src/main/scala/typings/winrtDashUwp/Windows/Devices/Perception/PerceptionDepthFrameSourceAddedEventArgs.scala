package typings.winrtDashUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for depth frame source added events. */
@JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSourceAddedEventArgs")
@js.native
abstract class PerceptionDepthFrameSourceAddedEventArgs () extends js.Object {
  /** Gets the depth frame source that was added. */
  var frameSource: PerceptionDepthFrameSource = js.native
}

