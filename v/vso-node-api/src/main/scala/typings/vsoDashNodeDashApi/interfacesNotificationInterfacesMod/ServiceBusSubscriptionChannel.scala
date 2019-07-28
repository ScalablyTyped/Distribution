package typings.vsoDashNodeDashApi.interfacesNotificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceBusSubscriptionChannel extends js.Object {
  var `type`: String
}

object ServiceBusSubscriptionChannel {
  @scala.inline
  def apply(`type`: String): ServiceBusSubscriptionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceBusSubscriptionChannel]
  }
}

