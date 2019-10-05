package typings.winrtDashUwp.Windows.UI.Input

import typings.winrtDashUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtDashUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Tapped event. */
@JSGlobal("Windows.UI.Input.TappedEventArgs")
@js.native
abstract class TappedEventArgs () extends js.Object {
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point = js.native
  /** Gets the number of times the tap interaction was detected. */
  var tapCount: Double = js.native
}

