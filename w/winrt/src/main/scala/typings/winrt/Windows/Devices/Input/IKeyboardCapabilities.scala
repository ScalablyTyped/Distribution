package typings.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardCapabilities extends js.Object {
  var keyboardPresent: Double
}

object IKeyboardCapabilities {
  @scala.inline
  def apply(keyboardPresent: Double): IKeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyboardCapabilities]
  }
}

