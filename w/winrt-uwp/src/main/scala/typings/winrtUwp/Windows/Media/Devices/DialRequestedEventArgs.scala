package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information for the DialRequested event. */
trait DialRequestedEventArgs extends js.Object {
  /** Returns the contact that was dialed. */
  var contact: js.Any
  /** Indicates that the DialRequested event has been handled. */
  def handled(): Unit
}

object DialRequestedEventArgs {
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): DialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[DialRequestedEventArgs]
  }
}

