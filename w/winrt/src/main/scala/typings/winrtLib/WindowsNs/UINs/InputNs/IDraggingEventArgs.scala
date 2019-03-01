package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDraggingEventArgs extends js.Object {
  var draggingState: DraggingState
  var pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  var position: winrtLib.WindowsNs.FoundationNs.Point
}

object IDraggingEventArgs {
  @scala.inline
  def apply(
    draggingState: DraggingState,
    pointerDeviceType: winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType,
    position: winrtLib.WindowsNs.FoundationNs.Point
  ): IDraggingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("draggingState")(draggingState)
    __obj.updateDynamic("pointerDeviceType")(pointerDeviceType)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IDraggingEventArgs]
  }
}

