package typings.urqlCore.typesMod

import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends GraphQLRequest {
  var context: OperationContext
  var operationName: OperationType
}

object Operation {
  @scala.inline
  def apply(
    context: OperationContext,
    key: Double,
    operationName: OperationType,
    query: DocumentNode,
    variables: js.Object = null
  ): Operation = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
}

