package typings.urql.subscriptionMod

import typings.graphql.astMod.DocumentNode
import typings.react.mod.ReactElement
import typings.urql.useSubscriptionMod.SubscriptionHandler
import typings.urql.useSubscriptionMod.UseSubscriptionArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionProps[T, R, V] extends UseSubscriptionArgs[V] {
  var handler: js.UndefOr[SubscriptionHandler[T, R]] = js.native
  def children(arg: SubscriptionState[R]): ReactElement = js.native
}

object SubscriptionProps {
  @scala.inline
  def apply[T, R, V](children: SubscriptionState[R] => ReactElement, query: DocumentNode | String): SubscriptionProps[T, R, V] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionProps[T, R, V]]
  }
  @scala.inline
  implicit class SubscriptionPropsOps[Self <: SubscriptionProps[_, _, _], T, R, V] (val x: Self with (SubscriptionProps[T, R, V])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: SubscriptionState[R] => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setHandler(value: (/* prev */ js.UndefOr[R], T) => R): Self = this.set("handler", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
  }
  
}

