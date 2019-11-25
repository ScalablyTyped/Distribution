package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsData extends js.Object {
  /**
    * Notification data needed
    */
  var data: StringDictionary[js.Any]
  /**
    * List of users who should get the notification
    */
  var identities: StringDictionary[js.Any]
  /**
    * Type of Mail Notification.Can be Qna , review or CustomerContact
    */
  var `type`: NotificationTemplateType
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
}

