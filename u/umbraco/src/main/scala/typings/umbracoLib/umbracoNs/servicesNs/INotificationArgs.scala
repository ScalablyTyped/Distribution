package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notification args
  */
trait INotificationArgs extends js.Object {
  var header: java.lang.String
  var message: java.lang.String
  var `type`: NotificationType
}

object INotificationArgs {
  @scala.inline
  def apply(header: java.lang.String, message: java.lang.String, `type`: NotificationType): INotificationArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[INotificationArgs]
  }
}

