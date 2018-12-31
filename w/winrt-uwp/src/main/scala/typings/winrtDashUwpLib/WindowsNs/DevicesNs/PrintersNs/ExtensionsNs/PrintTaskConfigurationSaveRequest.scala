package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called when the print dialog for your app raises a SaveRequested event. */
@JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest")
@js.native
abstract class PrintTaskConfigurationSaveRequest () extends js.Object {
  /** Gets the date-time object that provides the deadline information for the print task. */
  var deadline: stdLib.Date = js.native
  /** Called by the device app to cancel the client's request to save the print task configuration. */
  def cancel(): scala.Unit = js.native
  /**
    * Called by the device app when it has to complete some asynchronous tasks before it can save the print task configuration information.
    * @return The object that represents the deferral for the print task configuration save request.
    */
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
  /**
    * Called by the device app to save the print task configuration.
    * @param printerExtensionContext The object that represents the print task extension context.
    */
  def save(printerExtensionContext: js.Any): scala.Unit = js.native
}

