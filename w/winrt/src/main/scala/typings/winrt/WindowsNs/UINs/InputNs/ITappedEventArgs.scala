package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
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
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType, position = position, tapCount = tapCount)
  
    __obj.asInstanceOf[ITappedEventArgs]
  }
}

