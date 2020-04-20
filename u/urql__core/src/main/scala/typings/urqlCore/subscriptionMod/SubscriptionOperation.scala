package typings.urqlCore.subscriptionMod

import typings.urqlCore.typesMod.OperationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionOperation extends js.Object {
  var context: OperationContext
  var key: String
  var query: String
  var variables: js.UndefOr[js.Object] = js.undefined
}

object SubscriptionOperation {
  @scala.inline
  def apply(context: OperationContext, key: String, query: String, variables: js.Object = null): SubscriptionOperation = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOperation]
  }
}

