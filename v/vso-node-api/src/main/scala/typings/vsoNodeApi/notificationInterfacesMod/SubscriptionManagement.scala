package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionManagement extends js.Object {
  var serviceInstanceType: String
  var url: String
}

object SubscriptionManagement {
  @scala.inline
  def apply(serviceInstanceType: String, url: String): SubscriptionManagement = {
    val __obj = js.Dynamic.literal(serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionManagement]
  }
}

