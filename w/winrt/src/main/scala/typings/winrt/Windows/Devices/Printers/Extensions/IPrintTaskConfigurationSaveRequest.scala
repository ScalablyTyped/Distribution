package typings.winrt.Windows.Devices.Printers.Extensions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskConfigurationSaveRequest extends js.Object {
  var deadline: Date = js.native
  def cancel(): Unit = js.native
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
  def save(printerExtensionContext: js.Any): Unit = js.native
}

object IPrintTaskConfigurationSaveRequest {
  @scala.inline
  def apply(
    cancel: () => Unit,
    deadline: Date,
    getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
    save: js.Any => Unit
  ): IPrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
  }
  @scala.inline
  implicit class IPrintTaskConfigurationSaveRequestOps[Self <: IPrintTaskConfigurationSaveRequest] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => PrintTaskConfigurationSaveRequestedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: js.Any => Unit): Self = this.set("save", js.Any.fromFunction1(value))
  }
  
}

