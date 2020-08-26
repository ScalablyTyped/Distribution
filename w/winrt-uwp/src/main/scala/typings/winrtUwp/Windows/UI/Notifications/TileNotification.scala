package typings.winrtUwp.Windows.UI.Notifications

import typings.std.Date
import typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an update to a tile, including its visuals, identification tag, and expiration time. */
@js.native
trait TileNotification extends js.Object {
  /** Gets the XML description of the notification content, which you can then manipulate to alter the notification. */
  var content: XmlDocument = js.native
  /** Gets or sets the time that Windows will remove the notification from the tile. By default, a tile update does not expire. It is a best practice to explicitly set an expiration time to avoid stale content. */
  var expirationTime: Date = js.native
  /** Gets or sets a string that Windows can use to prevent duplicate notification content from appearing in the queue. */
  var tag: String = js.native
}

object TileNotification {
  @scala.inline
  def apply(content: XmlDocument, expirationTime: Date, tag: String): TileNotification = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], expirationTime = expirationTime.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileNotification]
  }
  @scala.inline
  implicit class TileNotificationOps[Self <: TileNotification] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
  }
  
}

