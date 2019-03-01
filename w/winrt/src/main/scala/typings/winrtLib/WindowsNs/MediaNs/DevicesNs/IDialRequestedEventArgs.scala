package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialRequestedEventArgs extends js.Object {
  var contact: js.Any
  def handled(): scala.Unit
}

object IDialRequestedEventArgs {
  @scala.inline
  def apply(contact: js.Any, handled: js.Function0[scala.Unit]): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contact")(contact)
    __obj.updateDynamic("handled")(handled)
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
}

