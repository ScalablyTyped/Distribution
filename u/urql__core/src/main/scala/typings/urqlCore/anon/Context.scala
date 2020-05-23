package typings.urqlCore.anon

import typings.graphql.astMod.DocumentNode
import typings.urqlCore.typesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: AdditionalTypenames
  var key: Double
  var operationName: OperationType
  var query: DocumentNode
  var variables: js.UndefOr[js.Object] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    context: AdditionalTypenames,
    key: Double,
    operationName: OperationType,
    query: DocumentNode,
    variables: js.Object = null
  ): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

