package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialRequestedEventArgs extends IDialRequestedEventArgs

object DialRequestedEventArgs {
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): DialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[DialRequestedEventArgs]
  }
}

