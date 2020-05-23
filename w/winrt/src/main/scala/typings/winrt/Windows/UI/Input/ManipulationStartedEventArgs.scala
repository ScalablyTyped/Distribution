package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManipulationStartedEventArgs extends IManipulationStartedEventArgs

object ManipulationStartedEventArgs {
  @scala.inline
  def apply(cumulative: ManipulationDelta, pointerDeviceType: PointerDeviceType, position: Point): ManipulationStartedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationStartedEventArgs]
  }
}

