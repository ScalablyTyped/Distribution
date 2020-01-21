package typings.vsoNodeApi.notificationInterfacesMod

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
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionFilter]
  }
}

