package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEventArgs extends IMouseEventArgs

object MouseEventArgs {
  @scala.inline
  def apply(mouseDelta: MouseDelta): MouseEventArgs = {
    val __obj = js.Dynamic.literal(mouseDelta = mouseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEventArgs]
  }
}

