package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRightTappedEventArgs extends js.Object {
  var pointerDeviceType: PointerDeviceType
  var position: Point
}

object IRightTappedEventArgs {
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point): IRightTappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType, position = position)
  
    __obj.asInstanceOf[IRightTappedEventArgs]
  }
}

