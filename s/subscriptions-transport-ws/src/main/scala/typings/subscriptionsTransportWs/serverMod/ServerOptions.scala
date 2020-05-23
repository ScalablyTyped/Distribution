package typings.subscriptionsTransportWs.serverMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.executeMod.ExecutionResultDataDefault
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.ValidationContext
import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var execute: js.UndefOr[ExecuteFunction] = js.undefined
  var keepAlive: js.UndefOr[Double] = js.undefined
  var onConnect: js.UndefOr[js.Function] = js.undefined
  var onDisconnect: js.UndefOr[js.Function] = js.undefined
  var onOperation: js.UndefOr[js.Function] = js.undefined
  var onOperationComplete: js.UndefOr[js.Function] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: js.UndefOr[GraphQLSchema] = js.undefined
  var subscribe: js.UndefOr[SubscribeFunction] = js.undefined
  var validationRules: js.UndefOr[js.Array[_ | (js.Function1[/* context */ ValidationContext, _])]] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    execute: (/* schema */ GraphQLSchema, /* document */ DocumentNode, /* rootValue */ js.UndefOr[js.Any], /* contextValue */ js.UndefOr[js.Any], /* variableValues */ js.UndefOr[StringDictionary[js.Any]], /* operationName */ js.UndefOr[String], /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]) => ExecutionResult[ExecutionResultDataDefault] | js.Promise[ExecutionResult[ExecutionResultDataDefault]] | (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]) = null,
    keepAlive: js.UndefOr[Double] = js.undefined,
    onConnect: js.Function = null,
    onDisconnect: js.Function = null,
    onOperation: js.Function = null,
    onOperationComplete: js.Function = null,
    rootValue: js.Any = null,
    schema: GraphQLSchema = null,
    subscribe: (/* schema */ GraphQLSchema, /* document */ DocumentNode, /* rootValue */ js.UndefOr[js.Any], /* contextValue */ js.UndefOr[js.Any], /* variableValues */ js.UndefOr[StringDictionary[js.Any]], /* operationName */ js.UndefOr[String], /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]], /* subscribeFieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]]) => (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[
      (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]) | ExecutionResult[ExecutionResultDataDefault]
    ]) = null,
    validationRules: js.Array[_ | (js.Function1[/* context */ ValidationContext, _])] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction7(execute))
    if (!js.isUndefined(keepAlive)) __obj.updateDynamic("keepAlive")(keepAlive.get.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(onConnect.asInstanceOf[js.Any])
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(onDisconnect.asInstanceOf[js.Any])
    if (onOperation != null) __obj.updateDynamic("onOperation")(onOperation.asInstanceOf[js.Any])
    if (onOperationComplete != null) __obj.updateDynamic("onOperationComplete")(onOperationComplete.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction8(subscribe))
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

