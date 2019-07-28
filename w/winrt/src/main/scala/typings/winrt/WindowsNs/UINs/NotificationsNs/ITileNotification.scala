package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.std.Date
import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileNotification extends js.Object {
  var content: XmlDocument
  var expirationTime: Date
  var tag: String
}

object ITileNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: Date, tag: String): ITileNotification = {
    val __obj = js.Dynamic.literal(content = content, expirationTime = expirationTime, tag = tag)
  
    __obj.asInstanceOf[ITileNotification]
  }
}

