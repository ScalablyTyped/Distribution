package typings.web3DashCoreDashSubscriptions.web3DashCoreDashSubscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOptions extends js.Object {
  var requestManager: js.Any
  var subscription: String
  var `type`: String
}

object SubscriptionOptions {
  @scala.inline
  def apply(requestManager: js.Any, subscription: String, `type`: String): SubscriptionOptions = {
    val __obj = js.Dynamic.literal(requestManager = requestManager, subscription = subscription)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SubscriptionOptions]
  }
}

