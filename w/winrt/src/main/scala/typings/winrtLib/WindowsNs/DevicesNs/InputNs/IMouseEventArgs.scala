package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEventArgs extends js.Object {
  var mouseDelta: MouseDelta
}

object IMouseEventArgs {
  @scala.inline
  def apply(mouseDelta: MouseDelta): IMouseEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mouseDelta")(mouseDelta)
    __obj.asInstanceOf[IMouseEventArgs]
  }
}

