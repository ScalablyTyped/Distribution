package typings
package winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest")
@js.native
class PrintTaskConfigurationSaveRequest () extends IPrintTaskConfigurationSaveRequest {
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
  /* CompleteClass */
  override def save(printerExtensionContext: js.Any): scala.Unit = js.native
}

