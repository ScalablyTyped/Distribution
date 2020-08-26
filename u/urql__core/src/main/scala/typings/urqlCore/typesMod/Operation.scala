package typings.urqlCore.typesMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operation extends GraphQLRequest {
  var context: OperationContext = js.native
  var operationName: OperationType = js.native
}

object Operation {
  @scala.inline
  def apply(context: OperationContext, key: Double, operationName: OperationType, query: DocumentNode): Operation = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  @scala.inline
  implicit class OperationOps[Self <: Operation] (val x: Self) extends AnyVal {
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
    def setOperationName(value: OperationType): Self = this.set("operationName", value.asInstanceOf[js.Any])
  }
  
}

