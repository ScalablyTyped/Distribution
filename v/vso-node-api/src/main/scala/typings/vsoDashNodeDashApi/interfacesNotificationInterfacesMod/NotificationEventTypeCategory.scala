package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventTypeCategory extends js.Object {
  /**
    * Gets or sets the unique identifier of this category.
    */
  var id: String
  /**
    * Gets or sets the friendly name of this category.
    */
  var name: String
}

object NotificationEventTypeCategory {
  @scala.inline
  def apply(id: String, name: String): NotificationEventTypeCategory = {
    val __obj = js.Dynamic.literal(id = id, name = name)
  
    __obj.asInstanceOf[NotificationEventTypeCategory]
  }
}

