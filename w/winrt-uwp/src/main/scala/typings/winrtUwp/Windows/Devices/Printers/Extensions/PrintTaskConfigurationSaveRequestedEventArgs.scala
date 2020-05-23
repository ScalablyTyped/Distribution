package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called to notify the device app that the print task configuration must be saved. */
trait PrintTaskConfigurationSaveRequestedEventArgs extends js.Object {
  /** Gets the information that is required for updating the print task configuration. */
  var request: PrintTaskConfigurationSaveRequest
}

object PrintTaskConfigurationSaveRequestedEventArgs {
  @scala.inline
  def apply(request: PrintTaskConfigurationSaveRequest): PrintTaskConfigurationSaveRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedEventArgs]
  }
}

