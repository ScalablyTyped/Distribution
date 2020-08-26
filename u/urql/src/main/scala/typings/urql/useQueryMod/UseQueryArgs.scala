package typings.urql.useQueryMod

import typings.graphql.astMod.DocumentNode
import typings.urql.anon.PartialOperationContext
import typings.urqlCore.typesMod.RequestPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseQueryArgs[V] extends js.Object {
  var context: js.UndefOr[PartialOperationContext] = js.native
  var pause: js.UndefOr[Boolean] = js.native
  var pollInterval: js.UndefOr[Double] = js.native
  var query: String | DocumentNode = js.native
  var requestPolicy: js.UndefOr[RequestPolicy] = js.native
  var variables: js.UndefOr[V] = js.native
}

object UseQueryArgs {
  @scala.inline
  def apply[V](query: String | DocumentNode): UseQueryArgs[V] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseQueryArgs[V]]
  }
  @scala.inline
  implicit class UseQueryArgsOps[Self <: UseQueryArgs[_], V] (val x: Self with UseQueryArgs[V]) extends AnyVal {
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
    def setQuery(value: String | DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: PartialOperationContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setPause(value: Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    @scala.inline
    def setRequestPolicy(value: RequestPolicy): Self = this.set("requestPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestPolicy: Self = this.set("requestPolicy", js.undefined)
    @scala.inline
    def setVariables(value: V): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

