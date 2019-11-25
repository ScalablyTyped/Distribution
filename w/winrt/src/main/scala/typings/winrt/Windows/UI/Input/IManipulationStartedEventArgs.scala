package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManipulationStartedEventArgs extends js.Object {
  var cumulative: ManipulationDelta
  var pointerDeviceType: PointerDeviceType
  var position: Point
}

object IManipulationStartedEventArgs {
  @scala.inline
  def apply(cumulative: ManipulationDelta, pointerDeviceType: PointerDeviceType, position: Point): IManipulationStartedEventArgs = {
    val __obj = js.Dynamic.literal(cumulative = cumulative.asInstanceOf[js.Any], pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IManipulationStartedEventArgs]
  }
}

