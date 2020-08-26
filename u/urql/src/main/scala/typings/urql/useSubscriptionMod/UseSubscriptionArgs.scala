package typings.urql.useSubscriptionMod

import typings.graphql.astMod.DocumentNode
import typings.urql.anon.PartialOperationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseSubscriptionArgs[V] extends js.Object {
  var context: js.UndefOr[PartialOperationContext] = js.native
  var pause: js.UndefOr[Boolean] = js.native
  var query: DocumentNode | String = js.native
  var variables: js.UndefOr[V] = js.native
}

object UseSubscriptionArgs {
  @scala.inline
  def apply[V](query: DocumentNode | String): UseSubscriptionArgs[V] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseSubscriptionArgs[V]]
  }
  @scala.inline
  implicit class UseSubscriptionArgsOps[Self <: UseSubscriptionArgs[_], V] (val x: Self with UseSubscriptionArgs[V]) extends AnyVal {
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
    def setQuery(value: DocumentNode | String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: PartialOperationContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setPause(value: Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setVariables(value: V): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

