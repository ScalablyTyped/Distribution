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

