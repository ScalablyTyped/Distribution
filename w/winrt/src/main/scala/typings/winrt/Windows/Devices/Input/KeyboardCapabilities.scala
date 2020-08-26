package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardCapabilities extends IKeyboardCapabilities

object KeyboardCapabilities {
  @scala.inline
  def apply(keyboardPresent: Double): KeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardCapabilities]
  }
}

