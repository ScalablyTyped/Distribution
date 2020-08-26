package typings.subscriptionsTransportWs.serverMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionParams[TContext] extends js.Object {
  var callback: js.UndefOr[js.Function] = js.native
  var context: TContext = js.native
  var formatError: js.UndefOr[js.Function] = js.native
  var formatResponse: js.UndefOr[js.Function] = js.native
  var operationName: String = js.native
  var query: String | DocumentNode = js.native
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var variables: StringDictionary[js.Any] = js.native
}

object ExecutionParams {
  @scala.inline
  def apply[TContext](
    context: TContext,
    operationName: String,
    query: String | DocumentNode,
    variables: StringDictionary[js.Any]
  ): ExecutionParams[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionParams[TContext]]
  }
  @scala.inline
  implicit class ExecutionParamsOps[Self <: ExecutionParams[_], TContext] (val x: Self with ExecutionParams[TContext]) extends AnyVal {
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
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String | DocumentNode): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: js.Function): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setFormatError(value: js.Function): Self = this.set("formatError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatError: Self = this.set("formatError", js.undefined)
    @scala.inline
    def setFormatResponse(value: js.Function): Self = this.set("formatResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatResponse: Self = this.set("formatResponse", js.undefined)
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
  
}

