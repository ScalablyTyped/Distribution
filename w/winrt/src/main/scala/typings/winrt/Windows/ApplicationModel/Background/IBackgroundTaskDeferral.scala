package typings.winrt.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundTaskDeferral extends js.Object {
  def complete(): Unit = js.native
}

object IBackgroundTaskDeferral {
  @scala.inline
  def apply(complete: () => Unit): IBackgroundTaskDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IBackgroundTaskDeferral]
  }
  @scala.inline
  implicit class IBackgroundTaskDeferralOps[Self <: IBackgroundTaskDeferral] (val x: Self) extends AnyVal {
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

