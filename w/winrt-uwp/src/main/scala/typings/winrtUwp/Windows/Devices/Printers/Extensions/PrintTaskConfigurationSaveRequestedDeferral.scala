package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called by the device app to provide an update of the status of the deferral. */
@JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral")
@js.native
abstract class PrintTaskConfigurationSaveRequestedDeferral () extends js.Object {
  /** Called by the device app when the deferral is completed. */
  def complete(): Unit = js.native
}

