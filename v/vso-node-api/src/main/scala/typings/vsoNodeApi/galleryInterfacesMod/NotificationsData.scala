package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsData extends js.Object {
  /**
    * Notification data needed
    */
  var data: StringDictionary[js.Any] = js.native
  /**
    * List of users who should get the notification
    */
  var identities: StringDictionary[js.Any] = js.native
  /**
    * Type of Mail Notification.Can be Qna , review or CustomerContact
    */
  var `type`: NotificationTemplateType = js.native
}

object NotificationsData {
  @scala.inline
  def apply(
    data: StringDictionary[js.Any],
    identities: StringDictionary[js.Any],
    `type`: NotificationTemplateType
  ): NotificationsData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsData]
  }
  @scala.inline
  implicit class NotificationsDataOps[Self <: NotificationsData] (val x: Self) extends AnyVal {
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentities(value: StringDictionary[js.Any]): Self = this.set("identities", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NotificationTemplateType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

