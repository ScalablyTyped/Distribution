package typings.urql.queryMod

import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactElement
import typings.urql.PartialOperationContext
import typings.urql.useQueryMod.UseQueryArgs
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryProps[T, V] extends UseQueryArgs[V] {
  def children(arg: QueryState[T]): ReactElement
}

object QueryProps {
  @scala.inline
  def apply[T, V](
    children: QueryState[T] => ReactElement,
    query: String | DocumentNode,
    context: PartialOperationContext = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    pollInterval: Int | Double = null,
    requestPolicy: RequestPolicy = null,
    variables: V = null
  ): QueryProps[T, V] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (requestPolicy != null) __obj.updateDynamic("requestPolicy")(requestPolicy.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryProps[T, V]]
  }
}

