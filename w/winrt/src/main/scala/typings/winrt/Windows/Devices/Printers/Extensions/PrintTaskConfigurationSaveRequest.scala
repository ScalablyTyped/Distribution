package typings.winrt.Windows.Devices.Printers.Extensions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTaskConfigurationSaveRequest extends IPrintTaskConfigurationSaveRequest

object PrintTaskConfigurationSaveRequest {
  @scala.inline
  def apply(
    cancel: () => Unit,
    deadline: Date,
    getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
    save: js.Any => Unit
  ): PrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
  }
}

