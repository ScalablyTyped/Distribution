package typings.web3DashCoreDashSubscriptions.web3DashCoreDashSubscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionModel extends js.Object {
  var inputFormatter: js.Array[js.Function0[Unit]]
  var params: Double
  var subscriptionName: String
  def outputFormatter(): Unit
  def subscriptionHandler(): Unit
}

object SubscriptionModel {
  @scala.inline
  def apply(
    inputFormatter: js.Array[js.Function0[Unit]],
    outputFormatter: () => Unit,
    params: Double,
    subscriptionHandler: () => Unit,
    subscriptionName: String
  ): SubscriptionModel = {
    val __obj = js.Dynamic.literal(inputFormatter = inputFormatter, outputFormatter = js.Any.fromFunction0(outputFormatter), params = params, subscriptionHandler = js.Any.fromFunction0(subscriptionHandler), subscriptionName = subscriptionName)
  
    __obj.asInstanceOf[SubscriptionModel]
  }
}

