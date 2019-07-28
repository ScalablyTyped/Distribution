package typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called to notify the device app that the print task configuration must be saved. */
@JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs")
@js.native
abstract class PrintTaskConfigurationSaveRequestedEventArgs () extends js.Object {
  /** Gets the information that is required for updating the print task configuration. */
  var request: PrintTaskConfigurationSaveRequest = js.native
}

