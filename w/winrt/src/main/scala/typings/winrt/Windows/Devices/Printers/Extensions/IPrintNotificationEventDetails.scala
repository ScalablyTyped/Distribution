package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintNotificationEventDetails extends js.Object {
  
  var eventData: String = js.native
  
  var printerName: String = js.native
}
object IPrintNotificationEventDetails {
  
  @scala.inline
  def apply(eventData: String, printerName: String): IPrintNotificationEventDetails = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintNotificationEventDetails]
  }
  
  @scala.inline
  implicit class IPrintNotificationEventDetailsOps[Self <: IPrintNotificationEventDetails] (val x: Self) extends AnyVal {
    
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
