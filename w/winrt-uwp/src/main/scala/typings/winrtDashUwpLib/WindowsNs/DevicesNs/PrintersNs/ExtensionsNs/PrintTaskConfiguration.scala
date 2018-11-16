package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows a client to retrieve the print task extension context, and also to add an event handler to the print task. */
@JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfiguration")
@js.native
abstract class PrintTaskConfiguration () extends js.Object {
  /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
  @JSName("onsaverequested")
  var onsaverequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs] = js.native
  /** Gets the context for the print task extension. */
  var printerExtensionContext: js.Any = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_saverequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.saverequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
  ): scala.Unit = js.native
  /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
  def onsaverequested(
    ev: PrintTaskConfigurationSaveRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PrintTaskConfiguration]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_saverequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.saverequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
  ): scala.Unit = js.native
}

