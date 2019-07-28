package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.DevicesNs.InputNs.PointerDeviceType
import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDraggingEventArgs extends js.Object {
  var draggingState: DraggingState
  var pointerDeviceType: PointerDeviceType
  var position: Point
}

object IDraggingEventArgs {
  @scala.inline
  def apply(draggingState: DraggingState, pointerDeviceType: PointerDeviceType, position: Point): IDraggingEventArgs = {
    val __obj = js.Dynamic.literal(draggingState = draggingState, pointerDeviceType = pointerDeviceType, position = position)
  
    __obj.asInstanceOf[IDraggingEventArgs]
  }
}

