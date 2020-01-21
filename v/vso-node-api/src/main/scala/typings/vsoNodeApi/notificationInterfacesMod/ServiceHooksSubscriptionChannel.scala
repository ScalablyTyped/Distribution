package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceHooksSubscriptionChannel extends js.Object {
  var `type`: String
}

object ServiceHooksSubscriptionChannel {
  @scala.inline
  def apply(`type`: String): ServiceHooksSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceHooksSubscriptionChannel]
  }
}

