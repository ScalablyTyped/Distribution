package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageQueueSubscriptionChannel extends js.Object {
  var `type`: String
}

object MessageQueueSubscriptionChannel {
  @scala.inline
  def apply(`type`: String): MessageQueueSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageQueueSubscriptionChannel]
  }
}

