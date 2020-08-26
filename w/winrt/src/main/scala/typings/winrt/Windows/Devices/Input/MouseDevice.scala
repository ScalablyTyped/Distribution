package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseDevice extends IMouseDevice

object MouseDevice {
  @scala.inline
  def apply(onmousemoved: js.Any): MouseDevice = {
    val __obj = js.Dynamic.literal(onmousemoved = onmousemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseDevice]
  }
}

