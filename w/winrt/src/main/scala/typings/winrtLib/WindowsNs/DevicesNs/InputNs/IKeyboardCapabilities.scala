package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardCapabilities extends js.Object {
  var keyboardPresent: scala.Double
}

object IKeyboardCapabilities {
  @scala.inline
  def apply(keyboardPresent: scala.Double): IKeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent)
  
    __obj.asInstanceOf[IKeyboardCapabilities]
  }
}

