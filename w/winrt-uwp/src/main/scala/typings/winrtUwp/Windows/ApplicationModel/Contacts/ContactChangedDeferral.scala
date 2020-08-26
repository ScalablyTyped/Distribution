package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The deferral object to use while asynchronously processing ContactChanged events. */
@js.native
trait ContactChangedDeferral extends js.Object {
  /** Call this method in order to release the deferral object when all asynchronous processing has finished. */
  def complete(): Unit = js.native
}

object ContactChangedDeferral {
  @scala.inline
  def apply(complete: () => Unit): ContactChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ContactChangedDeferral]
  }
  @scala.inline
  implicit class ContactChangedDeferralOps[Self <: ContactChangedDeferral] (val x: Self) extends AnyVal {
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

