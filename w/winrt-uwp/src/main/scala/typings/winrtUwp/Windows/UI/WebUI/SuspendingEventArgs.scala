package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for an app suspension event. */
@js.native
trait SuspendingEventArgs extends js.Object {
  /** Gets the app suspension operation. */
  var suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation = js.native
}

object SuspendingEventArgs {
  @scala.inline
  def apply(suspendingOperation: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation): SuspendingEventArgs = {
    val __obj = js.Dynamic.literal(suspendingOperation = suspendingOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendingEventArgs]
  }
  @scala.inline
  implicit class SuspendingEventArgsOps[Self <: SuspendingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuspendingOperation(value: typings.winrtUwp.Windows.ApplicationModel.SuspendingOperation): Self = this.set("suspendingOperation", value.asInstanceOf[js.Any])
  }
  
}

