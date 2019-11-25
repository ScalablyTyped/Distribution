package typings.web3DashCoreDashSubscriptions.web3DashCoreDashSubscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsOptions extends js.Object {
  var name: String
  var subscriptions: SubscriptionsModel
  var `type`: String
}

object SubscriptionsOptions {
  @scala.inline
  def apply(name: String, subscriptions: SubscriptionsModel, `type`: String): SubscriptionsOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionsOptions]
  }
}

