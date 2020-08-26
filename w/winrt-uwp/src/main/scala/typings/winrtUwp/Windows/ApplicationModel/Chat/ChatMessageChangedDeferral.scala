package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred asynchronous change request. */
@js.native
trait ChatMessageChangedDeferral extends js.Object {
  /** Fires to indicate that the deferred change request has completed. */
  def complete(): Unit = js.native
}

object ChatMessageChangedDeferral {
  @scala.inline
  def apply(complete: () => Unit): ChatMessageChangedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[ChatMessageChangedDeferral]
  }
  @scala.inline
  implicit class ChatMessageChangedDeferralOps[Self <: ChatMessageChangedDeferral] (val x: Self) extends AnyVal {
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

