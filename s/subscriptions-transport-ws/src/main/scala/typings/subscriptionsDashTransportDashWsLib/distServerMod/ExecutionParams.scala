package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionParams[TContext] extends js.Object {
  var callback: js.UndefOr[js.Function] = js.undefined
  var context: TContext
  var formatError: js.UndefOr[js.Function] = js.undefined
  var formatResponse: js.UndefOr[js.Function] = js.undefined
  var operationName: java.lang.String
  var query: java.lang.String | graphqlLib.languageAstMod.DocumentNode
  var schema: js.UndefOr[graphqlLib.graphqlMod.GraphQLSchema] = js.undefined
  var variables: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ExecutionParams {
  @scala.inline
  def apply[TContext](
    context: TContext,
    operationName: java.lang.String,
    query: java.lang.String | graphqlLib.languageAstMod.DocumentNode,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any],
    callback: js.Function = null,
    formatError: js.Function = null,
    formatResponse: js.Function = null,
    schema: graphqlLib.graphqlMod.GraphQLSchema = null
  ): ExecutionParams[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("operationName")(operationName)
    __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.updateDynamic("variables")(variables)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (formatError != null) __obj.updateDynamic("formatError")(formatError)
    if (formatResponse != null) __obj.updateDynamic("formatResponse")(formatResponse)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ExecutionParams[TContext]]
  }
}

