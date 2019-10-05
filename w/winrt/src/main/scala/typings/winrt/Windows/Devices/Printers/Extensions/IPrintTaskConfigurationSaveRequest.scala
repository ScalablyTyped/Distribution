package typings.winrt.Windows.Devices.Printers.Extensions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfigurationSaveRequest extends js.Object {
  var deadline: Date
  def cancel(): Unit
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral
  def save(printerExtensionContext: js.Any): Unit
}

object IPrintTaskConfigurationSaveRequest {
  @scala.inline
  def apply(
    cancel: () => Unit,
    deadline: Date,
    getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
    save: js.Any => Unit
  ): IPrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline, getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
  
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
  }
}

