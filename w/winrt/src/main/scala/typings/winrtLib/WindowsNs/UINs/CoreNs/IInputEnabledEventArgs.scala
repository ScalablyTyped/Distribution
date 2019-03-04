package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputEnabledEventArgs extends ICoreWindowEventArgs {
  var inputEnabled: scala.Boolean
}

object IInputEnabledEventArgs {
  @scala.inline
  def apply(handled: scala.Boolean, inputEnabled: scala.Boolean): IInputEnabledEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled, inputEnabled = inputEnabled)
  
    __obj.asInstanceOf[IInputEnabledEventArgs]
  }
}

