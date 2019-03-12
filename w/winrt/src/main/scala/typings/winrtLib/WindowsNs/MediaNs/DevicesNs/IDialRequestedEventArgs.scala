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
  def apply(contact: js.Any, handled: () => scala.Unit): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact, handled = js.Any.fromFunction0(handled))
  
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
}

