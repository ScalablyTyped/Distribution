package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains properties that allow a client to access and/or manipulate print event data and print device name information. */
@js.native
trait PrintNotificationEventDetails extends js.Object {
  
  /** Gets or sets the event data for a print notification event. */
  var eventData: String = js.native
  
  /** Gets the name of the print device associated with the print notification. */
  var printerName: String = js.native
}
object PrintNotificationEventDetails {
  
  @scala.inline
  def apply(eventData: String, printerName: String): PrintNotificationEventDetails = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintNotificationEventDetails]
  }
  
  @scala.inline
  implicit class PrintNotificationEventDetailsOps[Self <: PrintNotificationEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventData(value: String): Self = this.set("eventData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrinterName(value: String): Self = this.set("printerName", value.asInstanceOf[js.Any])
  }
}
