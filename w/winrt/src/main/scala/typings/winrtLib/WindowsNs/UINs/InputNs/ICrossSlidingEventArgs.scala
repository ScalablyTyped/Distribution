package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICrossSlidingEventArgs extends js.Object {
  var crossSlidingState: CrossSlidingState
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
}

object ICrossSlidingEventArgs {
  @scala.inline
  def apply(
    crossSlidingState: CrossSlidingState,
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point
  ): ICrossSlidingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("crossSlidingState")(crossSlidingState)
    __obj.updateDynamic("pointerDeviceType")(pointerDeviceType)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ICrossSlidingEventArgs]
  }
}

