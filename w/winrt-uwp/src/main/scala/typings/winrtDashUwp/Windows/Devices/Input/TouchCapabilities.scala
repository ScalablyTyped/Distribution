package typings.winrtDashUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the touch capabilities of any connected touch digitizers. */
@JSGlobal("Windows.Devices.Input.TouchCapabilities")
@js.native
/** Initializes a new instance of the TouchCapabilities class. */
class TouchCapabilities () extends js.Object {
  /** Gets the minimum number of contacts supported by all the digitizers. */
  var contacts: Double = js.native
  /** Gets a value that indicates whether a touch digitizer is detected. */
  var touchPresent: Double = js.native
}

