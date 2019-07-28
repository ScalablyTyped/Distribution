package typings.winrt.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

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
    val __obj = js.Dynamic.literal(eventData = eventData, printerName = printerName)
  
    __obj.asInstanceOf[IPrintNotificationEventDetails]
  }
}

