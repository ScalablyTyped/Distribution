package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossSlidingEventArgs extends ICrossSlidingEventArgs

object CrossSlidingEventArgs {
  @scala.inline
  def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): CrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossSlidingEventArgs]
  }
}

