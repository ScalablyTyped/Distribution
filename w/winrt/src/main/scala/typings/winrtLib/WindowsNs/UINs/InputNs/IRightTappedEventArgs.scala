package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRightTappedEventArgs extends js.Object {
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
}

object IRightTappedEventArgs {
  @scala.inline
  def apply(
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point
  ): IRightTappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType, position = position)
  
    __obj.asInstanceOf[IRightTappedEventArgs]
  }
}

