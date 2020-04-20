package typings.urql.subscriptionMod

import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactElement
import typings.urql.PartialOperationContext
import typings.urql.useSubscriptionMod.SubscriptionHandler
import typings.urql.useSubscriptionMod.UseSubscriptionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionProps[T, R, V] extends UseSubscriptionArgs[V] {
  var handler: js.UndefOr[SubscriptionHandler[T, R]] = js.undefined
  def children(arg: SubscriptionState[R]): ReactElement
}

object SubscriptionProps {
  @scala.inline
  def apply[T, R, V](
    children: SubscriptionState[R] => ReactElement,
    query: DocumentNode | String,
    context: PartialOperationContext = null,
    handler: (/* prev */ js.UndefOr[R], T) => R = null,
    pause: js.UndefOr[Boolean] = js.undefined,
    variables: V = null
  ): SubscriptionProps[T, R, V] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction2(handler))
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionProps[T, R, V]]
  }
}

