package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationsData extends js.Object {
  /**
    * Notification data needed
    */
  var data: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * List of users who should get the notification
    */
  var identities: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Type of Mail Notification.Can be Qna , review or CustomerContact
    */
  var `type`: NotificationTemplateType
}

object NotificationsData {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    identities: org.scalablytyped.runtime.StringDictionary[js.Any],
    `type`: NotificationTemplateType
  ): NotificationsData = {
    val __obj = js.Dynamic.literal(data = data, identities = identities)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NotificationsData]
  }
}

