package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledTileNotification extends js.Object {
  var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  var deliveryTime: stdLib.Date
  var expirationTime: stdLib.Date
  var id: java.lang.String
  var tag: java.lang.String
}

object IScheduledTileNotification {
  @scala.inline
  def apply(
    content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    deliveryTime: stdLib.Date,
    expirationTime: stdLib.Date,
    id: java.lang.String,
    tag: java.lang.String
  ): IScheduledTileNotification = {
    val __obj = js.Dynamic.literal(content = content, deliveryTime = deliveryTime, expirationTime = expirationTime, id = id, tag = tag)
  
    __obj.asInstanceOf[IScheduledTileNotification]
  }
}

