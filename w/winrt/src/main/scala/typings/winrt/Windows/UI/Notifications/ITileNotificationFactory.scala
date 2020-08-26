package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITileNotificationFactory extends js.Object {
  def createTileNotification(content: XmlDocument): TileNotification = js.native
}

object ITileNotificationFactory {
  @scala.inline
  def apply(createTileNotification: XmlDocument => TileNotification): ITileNotificationFactory = {
    val __obj = js.Dynamic.literal(createTileNotification = js.Any.fromFunction1(createTileNotification))
    __obj.asInstanceOf[ITileNotificationFactory]
  }
  @scala.inline
  implicit class ITileNotificationFactoryOps[Self <: ITileNotificationFactory] (val x: Self) extends AnyVal {
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
    def setCreateTileNotification(value: XmlDocument => TileNotification): Self = this.set("createTileNotification", js.Any.fromFunction1(value))
  }
  
}

