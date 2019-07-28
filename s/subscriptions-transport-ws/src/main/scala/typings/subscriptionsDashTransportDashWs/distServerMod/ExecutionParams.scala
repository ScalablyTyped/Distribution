package typings.subscriptionsDashTransportDashWs.distServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionParams[TContext] extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var context: TContext
  var formatError: js.UndefOr[js.Function] = js.undefined
  var formatResponse: js.UndefOr[js.Function] = js.undefined
  var operationName: String
  var query: String | DocumentNode
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  var variables: StringDictionary[js.Any]
}

object ExecutionParams {
  @scala.inline
  def apply[TContext](
    context: TContext,
    operationName: String,
    query: String | DocumentNode,
    variables: StringDictionary[js.Any],
    callback: js.Function = null,
    formatError: js.Function = null,
    formatResponse: js.Function = null,
    schema: GraphQLSchema = null
  ): ExecutionParams[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], operationName = operationName, query = query.asInstanceOf[js.Any], variables = variables)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (formatError != null) __obj.updateDynamic("formatError")(formatError)
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(formatResponse)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ExecutionParams[TContext]]
  }
}

