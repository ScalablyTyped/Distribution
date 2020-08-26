package typings.winrtUwp.Windows.UI.Notifications

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the content, associated metadata, and expiration time of an update to a tile's badge overlay. A badge can display a number from 1 to 99 or a status glyph. */
@js.native
trait BadgeNotification extends js.Object {
  /** Gets the XML that defines the value or glyph used as the tile's badge. */
  var content: XmlDocument = js.native
  /** Gets or sets the time that Windows will remove the badge from the tile. By default, local badge notifications do not expire and push, periodic, and scheduled badge notifications expire after three days. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: Date = js.native
}

object BadgeNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: Date): BadgeNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeNotification]
  }
  @scala.inline
  implicit class BadgeNotificationOps[Self <: BadgeNotification] (val x: Self) extends AnyVal {
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
    def setContent(value: XmlDocument): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationTime(value: Date): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
  }
  
}

