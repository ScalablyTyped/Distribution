package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventTypeCategory extends js.Object {
  /**
    * Gets or sets the unique identifier of this category.
    */
  var id: java.lang.String
  /**
    * Gets or sets the friendly name of this category.
    */
  var name: java.lang.String
}

object NotificationEventTypeCategory {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): NotificationEventTypeCategory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NotificationEventTypeCategory]
  }
}

