package typings.winrtUwp.Windows.UI.Input

import typings.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typings.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the ManipulationStarted event. */
trait ManipulationStartedEventArgs extends js.Object {
  /** Gets values that indicate the accumulated transformation deltas (translation, rotation, scale) for a manipulation before the ManipulationStarted event. */
  var cumulative: ManipulationDelta
  /** Gets the device type of the input source. */
  var pointerDeviceType: PointerDeviceType
  /** Gets the location of the pointer associated with the manipulation for the last manipulation event. */
  var position: Point
}

object ManipulationStartedEventArgs {
  @scala.inline
  def apply(cumulative: ManipulationDelta, pointerDeviceType: PointerDeviceType, position: Point): ManipulationStartedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationStartedEventArgs]
  }
}

