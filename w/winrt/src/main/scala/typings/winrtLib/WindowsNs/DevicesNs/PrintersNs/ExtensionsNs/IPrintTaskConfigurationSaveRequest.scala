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
    cancel: js.Function0[scala.Unit],
    deadline: stdLib.Date,
    getDeferral: js.Function0[PrintTaskConfigurationSaveRequestedDeferral],
    save: js.Function1[js.Any, scala.Unit]
  ): IPrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = cancel, deadline = deadline, getDeferral = getDeferral, save = save)
  
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
  }
}

