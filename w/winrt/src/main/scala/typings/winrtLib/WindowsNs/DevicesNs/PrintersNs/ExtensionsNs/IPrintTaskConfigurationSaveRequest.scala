package typings
package winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfigurationSaveRequest extends js.Object {
  var deadline: stdLib.Date
  def cancel(): scala.Unit
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral
  def save(printerExtensionContext: js.Any): scala.Unit
}

object IPrintTaskConfigurationSaveRequest {
  @scala.inline
  def apply(
    cancel: () => scala.Unit,
    deadline: stdLib.Date,
    getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
    save: js.Any => scala.Unit
  ): IPrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline, getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
  
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
  }
}

