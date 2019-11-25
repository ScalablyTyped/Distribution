package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITappedEventArgs extends js.Object {
  var pointerDeviceType: PointerDeviceType
  var position: Point
  var tapCount: Double
}

object ITappedEventArgs {
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point, tapCount: Double): ITappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITappedEventArgs]
  }
}

