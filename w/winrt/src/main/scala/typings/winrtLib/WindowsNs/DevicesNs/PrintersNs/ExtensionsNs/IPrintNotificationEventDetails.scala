package typings
package winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintNotificationEventDetails extends js.Object {
  var eventData: java.lang.String
  var printerName: java.lang.String
}

object IPrintNotificationEventDetails {
  @scala.inline
  def apply(eventData: java.lang.String, printerName: java.lang.String): IPrintNotificationEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventData")(eventData)
    __obj.updateDynamic("printerName")(printerName)
    __obj.asInstanceOf[IPrintNotificationEventDetails]
  }
}

