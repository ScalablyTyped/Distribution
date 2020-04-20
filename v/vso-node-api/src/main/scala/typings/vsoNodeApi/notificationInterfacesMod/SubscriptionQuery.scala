package typings.vsoNodeApi.notificationInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionQuery extends js.Object {
  /**
    * One or more conditions to query on. If more than 2 conditions are specified, the combined results of each condition is returned (i.e. conditions are logically OR'ed).
    */
  var conditions: js.Array[SubscriptionQueryCondition]
  /**
    * Flags the refine the types of subscriptions that will be returned from the query.
    */
  var queryFlags: SubscriptionQueryFlags
}

object SubscriptionQuery {
  @scala.inline
  def apply(conditions: js.Array[SubscriptionQueryCondition], queryFlags: SubscriptionQueryFlags): SubscriptionQuery = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], queryFlags = queryFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionQuery]
  }
}

