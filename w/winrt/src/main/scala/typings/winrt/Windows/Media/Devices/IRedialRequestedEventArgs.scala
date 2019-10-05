package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRedialRequestedEventArgs extends js.Object {
  def handled(): Unit
}

object IRedialRequestedEventArgs {
  @scala.inline
  def apply(handled: () => Unit): IRedialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(handled = js.Any.fromFunction0(handled))
  
    __obj.asInstanceOf[IRedialRequestedEventArgs]
  }
}

