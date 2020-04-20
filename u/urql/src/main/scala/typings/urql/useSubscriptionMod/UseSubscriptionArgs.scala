package typings.urql.useSubscriptionMod

import typings.graphql.astMod.DocumentNode
import typings.urql.PartialOperationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseSubscriptionArgs[V] extends js.Object {
  var context: js.UndefOr[PartialOperationContext] = js.undefined
  var pause: js.UndefOr[Boolean] = js.undefined
  var query: DocumentNode | String
  var variables: js.UndefOr[V] = js.undefined
}

object UseSubscriptionArgs {
  @scala.inline
  def apply[V](
    query: DocumentNode | String,
    context: PartialOperationContext = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    variables: V = null
  ): UseSubscriptionArgs[V] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSubscriptionArgs[V]]
  }
}

