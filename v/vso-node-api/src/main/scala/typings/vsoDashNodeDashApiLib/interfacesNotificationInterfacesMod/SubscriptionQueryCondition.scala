package typings
package vsoDashNodeDashApiLib.interfacesNotificationInterfacesMod

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
  var scope: java.lang.String
  /**
    * ID of the subscriber (user or group) that matching subscriptions must be subscribed to.
    */
  var subscriberId: java.lang.String
  /**
    * ID of the subscription to query for.
    */
  var subscriptionId: java.lang.String
}

object SubscriptionQueryCondition {
  @scala.inline
  def apply(
    filter: ISubscriptionFilter,
    flags: SubscriptionFlags,
    scope: java.lang.String,
    subscriberId: java.lang.String,
    subscriptionId: java.lang.String
  ): SubscriptionQueryCondition = {
    val __obj = js.Dynamic.literal(filter = filter, flags = flags, scope = scope, subscriberId = subscriberId, subscriptionId = subscriptionId)
  
    __obj.asInstanceOf[SubscriptionQueryCondition]
  }
}

