package typings.winrtUwp.Windows.Devices.Printers.Extensions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called when the print dialog for your app raises a SaveRequested event. */
trait PrintTaskConfigurationSaveRequest extends js.Object {
  /** Gets the date-time object that provides the deadline information for the print task. */
  var deadline: Date
  /** Called by the device app to cancel the client's request to save the print task configuration. */
  def cancel(): Unit
  /**
    * Called by the device app when it has to complete some asynchronous tasks before it can save the print task configuration information.
    * @return The object that represents the deferral for the print task configuration save request.
    */
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral
  /**
    * Called by the device app to save the print task configuration.
    * @param printerExtensionContext The object that represents the print task extension context.
    */
  def save(printerExtensionContext: js.Any): Unit
}

object PrintTaskConfigurationSaveRequest {
  @scala.inline
  def apply(
    cancel: () => Unit,
    deadline: Date,
    getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
    save: js.Any => Unit
  ): PrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
  }
}

