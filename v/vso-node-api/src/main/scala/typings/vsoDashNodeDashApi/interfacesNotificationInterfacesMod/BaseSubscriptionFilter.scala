package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseSubscriptionFilter extends js.Object {
  var eventType: String
  var `type`: String
}

object BaseSubscriptionFilter {
  @scala.inline
  def apply(eventType: String, `type`: String): BaseSubscriptionFilter = {
    val __obj = js.Dynamic.literal(eventType = eventType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BaseSubscriptionFilter]
  }
}

