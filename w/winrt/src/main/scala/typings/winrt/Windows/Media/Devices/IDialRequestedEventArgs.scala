package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialRequestedEventArgs extends js.Object {
  var contact: js.Any
  def handled(): Unit
}

object IDialRequestedEventArgs {
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact, handled = js.Any.fromFunction0(handled))
  
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
}

