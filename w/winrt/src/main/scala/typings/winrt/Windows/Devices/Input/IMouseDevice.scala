package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseDevice extends js.Object {
  var onmousemoved: js.Any
}

object IMouseDevice {
  @scala.inline
  def apply(onmousemoved: js.Any): IMouseDevice = {
    val __obj = js.Dynamic.literal(onmousemoved = onmousemoved)
  
    __obj.asInstanceOf[IMouseDevice]
  }
}

