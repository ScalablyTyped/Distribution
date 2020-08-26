package typings.winrtUwp.Windows.ApplicationModel

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about an app suspending operation. */
@js.native
trait SuspendingOperation extends js.Object {
  /** Gets the time remaining before a delayed app suspending operation continues. */
  var deadline: Date = js.native
  /**
    * Requests that the app suspending operation be delayed.
    * @return The suspension deferral.
    */
  def getDeferral(): SuspendingDeferral = js.native
}

object SuspendingOperation {
  @scala.inline
  def apply(deadline: Date, getDeferral: () => SuspendingDeferral): SuspendingOperation = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SuspendingOperation]
  }
  @scala.inline
  implicit class SuspendingOperationOps[Self <: SuspendingOperation] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => SuspendingDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
  
}

