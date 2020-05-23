package typings.winrtUwp.Windows.Devices.Printers.Extensions

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.saverequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows a client to retrieve the print task extension context, and also to add an event handler to the print task. */
@js.native
trait PrintTaskConfiguration extends js.Object {
  /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
  @JSName("onsaverequested")
  var onsaverequested_Original: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs] = js.native
  /** Gets the context for the print task extension. */
  var printerExtensionContext: js.Any = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_saverequested(
    `type`: saverequested,
    listener: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
  ): Unit = js.native
  /** Raised by the print window for your app to notify the device app that the print ticket must be updated. */
  def onsaverequested(ev: PrintTaskConfigurationSaveRequestedEventArgs with WinRTEvent[PrintTaskConfiguration]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_saverequested(
    `type`: saverequested,
    listener: TypedEventHandler[PrintTaskConfiguration, PrintTaskConfigurationSaveRequestedEventArgs]
  ): Unit = js.native
}

