package typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that allow a client to access and/or manipulate print event data and print device name information. */
@JSGlobal("Windows.Devices.Printers.Extensions.PrintNotificationEventDetails")
@js.native
abstract class PrintNotificationEventDetails () extends js.Object {
  /** Gets or sets the event data for a print notification event. */
  var eventData: String = js.native
  /** Gets the name of the print device associated with the print notification. */
  var printerName: String = js.native
}

