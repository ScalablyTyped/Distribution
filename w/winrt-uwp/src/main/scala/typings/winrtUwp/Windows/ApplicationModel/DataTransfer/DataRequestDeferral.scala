package typings.winrtUwp.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables you to exchange content with a target app asynchronously. */
@js.native
trait DataRequestDeferral extends js.Object {
  /** Indicates that the content for an asynchronous share is ready for a target app, or that an error in the sharing operation occurred. */
  def complete(): Unit = js.native
}

object DataRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): DataRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataRequestDeferral]
  }
  @scala.inline
  implicit class DataRequestDeferralOps[Self <: DataRequestDeferral] (val x: Self) extends AnyVal {
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

