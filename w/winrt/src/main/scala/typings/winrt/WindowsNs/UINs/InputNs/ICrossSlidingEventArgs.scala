package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICrossSlidingEventArgs extends js.Object {
  var crossSlidingState: CrossSlidingState
  var pointerDeviceType: PointerDeviceType
  var position: Point
}

object ICrossSlidingEventArgs {
  @scala.inline
  def apply(crossSlidingState: CrossSlidingState, pointerDeviceType: PointerDeviceType, position: Point): ICrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal(crossSlidingState = crossSlidingState, pointerDeviceType = pointerDeviceType, position = position)
  
    __obj.asInstanceOf[ICrossSlidingEventArgs]
  }
}

