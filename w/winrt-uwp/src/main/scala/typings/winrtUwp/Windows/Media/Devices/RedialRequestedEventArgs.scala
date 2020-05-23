package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information for the RedialRequested event. */
trait RedialRequestedEventArgs extends js.Object {
  /** Indicates that the RedialRequested event has been handled. */
  def handled(): Unit
}

object RedialRequestedEventArgs {
  @scala.inline
  def apply(handled: () => Unit): RedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[RedialRequestedEventArgs]
  }
}

