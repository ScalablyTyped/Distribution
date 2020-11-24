package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintNotificationEventDetails extends IPrintNotificationEventDetails
object PrintNotificationEventDetails {
  
  @scala.inline
  def apply(eventData: String, printerName: String): PrintNotificationEventDetails = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintNotificationEventDetails]
  }
}
