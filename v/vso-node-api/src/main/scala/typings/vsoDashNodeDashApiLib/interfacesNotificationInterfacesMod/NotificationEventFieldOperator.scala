package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationEventFieldOperator extends js.Object {
  /**
    * Gets or sets the display name of an operator
    */
  var displayName: java.lang.String
  /**
    * Gets or sets the id of an operator
    */
  var id: java.lang.String
}

object NotificationEventFieldOperator {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String): NotificationEventFieldOperator = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id)
  
    __obj.asInstanceOf[NotificationEventFieldOperator]
  }
}

