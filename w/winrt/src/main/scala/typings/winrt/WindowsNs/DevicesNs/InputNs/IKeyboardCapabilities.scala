package typings.winrt.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardCapabilities extends js.Object {
  var keyboardPresent: Double
}

object IKeyboardCapabilities {
  @scala.inline
  def apply(keyboardPresent: Double): IKeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent)
  
    __obj.asInstanceOf[IKeyboardCapabilities]
  }
}

