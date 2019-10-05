package typings.winrt.Windows.Devices.Printers.Extensions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest")
@js.native
class PrintTaskConfigurationSaveRequest () extends IPrintTaskConfigurationSaveRequest {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
  /* CompleteClass */
  override def save(printerExtensionContext: js.Any): Unit = js.native
}

