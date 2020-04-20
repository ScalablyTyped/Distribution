package typings.urql.useQueryMod

import typings.graphql.astMod.DocumentNode
import typings.urql.PartialOperationContext
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseQueryArgs[V] extends js.Object {
  var context: js.UndefOr[PartialOperationContext] = js.undefined
  var pause: js.UndefOr[Boolean] = js.undefined
  var pollInterval: js.UndefOr[Double] = js.undefined
  var query: String | DocumentNode
  var requestPolicy: js.UndefOr[RequestPolicy] = js.undefined
  var variables: js.UndefOr[V] = js.undefined
}

object UseQueryArgs {
  @scala.inline
  def apply[V](
    query: String | DocumentNode,
    context: PartialOperationContext = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    requestPolicy: RequestPolicy = null,
    variables: V = null
  ): UseQueryArgs[V] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (requestPolicy != null) __obj.updateDynamic("requestPolicy")(requestPolicy.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseQueryArgs[V]]
  }
}

