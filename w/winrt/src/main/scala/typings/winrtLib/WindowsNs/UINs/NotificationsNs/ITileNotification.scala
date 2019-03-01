package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileNotification extends js.Object {
  var content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
  var expirationTime: stdLib.Date
  var tag: java.lang.String
}

object ITileNotification {
  @scala.inline
  def apply(
    content: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument,
    expirationTime: stdLib.Date,
    tag: java.lang.String
  ): ITileNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("expirationTime")(expirationTime)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[ITileNotification]
  }
}

