package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that allow a client to access and/or manipulate print event data and print device name information. */
trait PrintNotificationEventDetails extends js.Object {
  /** Gets or sets the event data for a print notification event. */
  var eventData: String
  /** Gets the name of the print device associated with the print notification. */
  var printerName: String
}

object PrintNotificationEventDetails {
  @scala.inline
  def apply(eventData: String, printerName: String): PrintNotificationEventDetails = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintNotificationEventDetails]
  }
}

