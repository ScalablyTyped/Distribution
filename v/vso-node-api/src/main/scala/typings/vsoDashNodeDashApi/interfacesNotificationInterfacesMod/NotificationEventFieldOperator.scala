package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventFieldOperator extends js.Object {
  /**
    * Gets or sets the display name of an operator
    */
  var displayName: String
  /**
    * Gets or sets the id of an operator
    */
  var id: String
}

object NotificationEventFieldOperator {
  @scala.inline
  def apply(displayName: String, id: String): NotificationEventFieldOperator = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id)
  
    __obj.asInstanceOf[NotificationEventFieldOperator]
  }
}

