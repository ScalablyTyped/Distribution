package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called by the device app to provide an update of the status of the deferral. */
@js.native
trait PrintTaskConfigurationSaveRequestedDeferral extends js.Object {
  /** Called by the device app when the deferral is completed. */
  def complete(): Unit = js.native
}

object PrintTaskConfigurationSaveRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): PrintTaskConfigurationSaveRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedDeferral]
  }
  @scala.inline
  implicit class PrintTaskConfigurationSaveRequestedDeferralOps[Self <: PrintTaskConfigurationSaveRequestedDeferral] (val x: Self) extends AnyVal {
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

