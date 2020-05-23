package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Holding event. */
trait HoldingEventArgs extends js.Object {
  /** Gets the state of the Holding event. */
  var holdingState: HoldingState
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  var position: Point
}

object HoldingEventArgs {
  @scala.inline
  def apply(holdingState: HoldingState, pointerDeviceType: PointerDeviceType, position: Point): HoldingEventArgs = {
    val __obj = js.Dynamic.literal(holdingState = holdingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldingEventArgs]
  }
}

