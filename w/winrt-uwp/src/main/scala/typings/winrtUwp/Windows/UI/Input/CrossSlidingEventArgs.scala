package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the CrossSliding event. */
@JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
@js.native
abstract class CrossSlidingEventArgs () extends js.Object {
  /** Gets the state of the CrossSliding event. */
  var crossSlidingState: CrossSlidingState = js.native
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch contact. */
  var position: Point = js.native
}

