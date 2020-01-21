package typings.winrtUwp.Windows.Devices.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event data for infrared frame source added events. */
@JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSourceAddedEventArgs")
@js.native
abstract class PerceptionInfraredFrameSourceAddedEventArgs () extends js.Object {
  /** Gets the infrared frame source that was added. */
  var frameSource: PerceptionInfraredFrameSource = js.native
}

