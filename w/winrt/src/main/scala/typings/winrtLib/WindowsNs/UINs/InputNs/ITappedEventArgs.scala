package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITappedEventArgs extends js.Object {
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
  var tapCount: scala.Double
}

object ITappedEventArgs {
  @scala.inline
  def apply(
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point,
    tapCount: scala.Double
  ): ITappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType, position = position, tapCount = tapCount)
  
    __obj.asInstanceOf[ITappedEventArgs]
  }
}

