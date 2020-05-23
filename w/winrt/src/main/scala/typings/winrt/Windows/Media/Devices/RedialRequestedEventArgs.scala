package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedialRequestedEventArgs extends IRedialRequestedEventArgs

object RedialRequestedEventArgs {
  @scala.inline
  def apply(handled: () => Unit): RedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[RedialRequestedEventArgs]
  }
}

