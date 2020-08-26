package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskConfigurationSaveRequestedEventArgs extends js.Object {
  var request: PrintTaskConfigurationSaveRequest = js.native
}

object IPrintTaskConfigurationSaveRequestedEventArgs {
  @scala.inline
  def apply(request: PrintTaskConfigurationSaveRequest): IPrintTaskConfigurationSaveRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedEventArgs]
  }
  @scala.inline
  implicit class IPrintTaskConfigurationSaveRequestedEventArgsOps[Self <: IPrintTaskConfigurationSaveRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setRequest(value: PrintTaskConfigurationSaveRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
  
}

