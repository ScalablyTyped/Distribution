package typings.urqlCore.subscriptionMod

import typings.urqlCore.typesMod.OperationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionOperation extends js.Object {
  var context: OperationContext = js.native
  var key: String = js.native
  var query: String = js.native
  var variables: js.UndefOr[js.Object] = js.native
}

object SubscriptionOperation {
  @scala.inline
  def apply(context: OperationContext, key: String, query: String): SubscriptionOperation = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionOperation]
  }
  @scala.inline
  implicit class SubscriptionOperationOps[Self <: SubscriptionOperation] (val x: Self) extends AnyVal {
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
    def setContext(value: OperationContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

