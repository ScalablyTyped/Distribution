package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSubscriptionFilter extends js.Object {
  var eventType: java.lang.String
  var `type`: java.lang.String
}

object BaseSubscriptionFilter {
  @scala.inline
  def apply(eventType: java.lang.String, `type`: java.lang.String): BaseSubscriptionFilter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("eventType")(eventType)
    __obj.asInstanceOf[BaseSubscriptionFilter]
  }
}

