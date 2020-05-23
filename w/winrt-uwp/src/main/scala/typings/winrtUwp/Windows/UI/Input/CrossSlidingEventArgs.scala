package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the CrossSliding event. */
trait CrossSlidingEventArgs extends js.Object {
  /** Gets the state of the CrossSliding event. */
  var crossSlidingState: CrossSlidingState
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  /** Gets the location of the touch contact. */
  var position: Point
}

object CrossSlidingEventArgs {
  @scala.inline
  def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): CrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlidingEventArgs]
  }
}

