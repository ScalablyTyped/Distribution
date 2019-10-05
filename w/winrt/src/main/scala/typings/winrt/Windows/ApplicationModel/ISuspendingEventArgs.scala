package typings.winrt.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISuspendingEventArgs extends js.Object {
  var suspendingOperation: SuspendingOperation
}

object ISuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: SuspendingOperation): ISuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation)
  
    __obj.asInstanceOf[ISuspendingEventArgs]
  }
}

