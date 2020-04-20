package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintNotificationEventDetails extends js.Object {
  var eventData: String
  var printerName: String
}

object IPrintNotificationEventDetails {
  @scala.inline
  def apply(eventData: String, printerName: String): IPrintNotificationEventDetails = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintNotificationEventDetails]
  }
}

