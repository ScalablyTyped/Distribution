package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseDevice extends js.Object {
  var onmousemoved: js.Any
}

object IMouseDevice {
  @scala.inline
  def apply(onmousemoved: js.Any): IMouseDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onmousemoved")(onmousemoved)
    __obj.asInstanceOf[IMouseDevice]
  }
}

