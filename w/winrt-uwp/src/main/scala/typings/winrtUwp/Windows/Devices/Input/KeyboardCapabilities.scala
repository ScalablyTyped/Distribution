package typings.winrtUwp.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the ability to determine the capabilities of any connected hardware keyboards. */
trait KeyboardCapabilities extends js.Object {
  /** Gets a value that indicates whether a hardware keyboard is detected. */
  var keyboardPresent: Double
}

object KeyboardCapabilities {
  @scala.inline
  def apply(keyboardPresent: Double): KeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardCapabilities]
  }
}

