package typings.winrt.Windows.System.Threading

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThreadPoolTimer extends js.Object {
  var delay: Double = js.native
  var period: Double = js.native
  def cancel(): Unit = js.native
}

object IThreadPoolTimer {
  @scala.inline
  def apply(cancel: () => Unit, delay: Double, period: Double): IThreadPoolTimer = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), delay = delay.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThreadPoolTimer]
  }
  @scala.inline
  implicit class IThreadPoolTimerOps[Self <: IThreadPoolTimer] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
  }
  
}

