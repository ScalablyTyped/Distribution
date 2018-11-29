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
    (js.Array[js.Function1[/* context */ graphqlLib.graphqlMod.ValidationContext, _]]) | js.Array[_]
  ] = js.undefined
}

