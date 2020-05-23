package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called by the device app to provide an update of the status of the deferral. */
trait PrintTaskConfigurationSaveRequestedDeferral extends js.Object {
  /** Called by the device app when the deferral is completed. */
  def complete(): Unit
}

object PrintTaskConfigurationSaveRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): PrintTaskConfigurationSaveRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedDeferral]
  }
}

