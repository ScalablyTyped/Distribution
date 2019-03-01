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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("deadline")(deadline)
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
  }
}

