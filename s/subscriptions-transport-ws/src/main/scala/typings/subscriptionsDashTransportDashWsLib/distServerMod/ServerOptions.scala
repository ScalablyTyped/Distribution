package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var execute: js.UndefOr[ExecuteFunction] = js.undefined
  var keepAlive: js.UndefOr[scala.Double] = js.undefined
  var onConnect: js.UndefOr[js.Function] = js.undefined
  var onDisconnect: js.UndefOr[js.Function] = js.undefined
  var onOperation: js.UndefOr[js.Function] = js.undefined
  var onOperationComplete: js.UndefOr[js.Function] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: js.UndefOr[graphqlLib.graphqlMod.GraphQLSchema] = js.undefined
  var subscribe: js.UndefOr[SubscribeFunction] = js.undefined
  var validationRules: js.UndefOr[
    js.Array[_ | (js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _])]
  ] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    execute: ExecuteFunction = null,
    keepAlive: scala.Int | scala.Double = null,
    onConnect: js.Function = null,
    onDisconnect: js.Function = null,
    onOperation: js.Function = null,
    onOperationComplete: js.Function = null,
    rootValue: js.Any = null,
    schema: graphqlLib.graphqlMod.GraphQLSchema = null,
    subscribe: SubscribeFunction = null,
    validationRules: js.Array[_ | (js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _])] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (execute != null) __obj.updateDynamic("execute")(execute)
    if (keepAlive != null) __obj.updateDynamic("keepAlive")(keepAlive.asInstanceOf[js.Any])
    if (onConnect != null) __obj.updateDynamic("onConnect")(onConnect)
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(onDisconnect)
    if (onOperation != null) __obj.updateDynamic("onOperation")(onOperation)
    if (onOperationComplete != null) __obj.updateDynamic("onOperationComplete")(onOperationComplete)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (subscribe != null) __obj.updateDynamic("subscribe")(subscribe)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[ServerOptions]
  }
}

