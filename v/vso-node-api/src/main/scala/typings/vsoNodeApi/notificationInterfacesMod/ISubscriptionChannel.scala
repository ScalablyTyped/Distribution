package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionChannel extends js.Object {
  var `type`: String
}

object ISubscriptionChannel {
  @scala.inline
  def apply(`type`: String): ISubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionChannel]
  }
}

