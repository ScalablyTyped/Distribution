package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseEventArgs extends js.Object {
  var mouseDelta: MouseDelta
}

object IMouseEventArgs {
  @scala.inline
  def apply(mouseDelta: MouseDelta): IMouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseEventArgs]
  }
}

