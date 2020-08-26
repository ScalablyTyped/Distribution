package typings.winrtUwp.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages delayed suspension for an app. GetDeferral */
@js.native
trait SuspendingDeferral extends js.Object {
  /** Notifies the system that the app has saved its data and is ready to be suspended. */
  def complete(): Unit = js.native
}

object SuspendingDeferral {
  @scala.inline
  def apply(complete: () => Unit): SuspendingDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[SuspendingDeferral]
  }
  @scala.inline
  implicit class SuspendingDeferralOps[Self <: SuspendingDeferral] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
  }
  
}

