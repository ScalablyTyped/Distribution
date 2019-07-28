package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionFilter extends js.Object {
  var eventType: String
  var `type`: String
}

object ISubscriptionFilter {
  @scala.inline
  def apply(eventType: String, `type`: String): ISubscriptionFilter = {
    val __obj = js.Dynamic.literal(eventType = eventType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ISubscriptionFilter]
  }
}

