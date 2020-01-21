package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionQueryCondition extends js.Object {
  /**
    * Filter conditions that matching subscriptions must have. Typically only the filter's type and event type are used for matching.
    */
  var filter: ISubscriptionFilter
  /**
    * Flags to specify the the type subscriptions to query for.
    */
  var flags: SubscriptionFlags
  /**
    * Scope that matching subscriptions must have.
    */
  var scope: String
  /**
    * ID of the subscriber (user or group) that matching subscriptions must be subscribed to.
    */
  var subscriberId: String
  /**
    * ID of the subscription to query for.
    */
  var subscriptionId: String
}

object SubscriptionQueryCondition {
  @scala.inline
  def apply(
    filter: ISubscriptionFilter,
    flags: SubscriptionFlags,
    scope: String,
    subscriberId: String,
    subscriptionId: String
  ): SubscriptionQueryCondition = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], subscriberId = subscriberId.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubscriptionQueryCondition]
  }
}

