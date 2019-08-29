package typings.subscriptionsDashTransportDashWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.executionExecuteMod.ExecutionResult
  import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
  import typings.graphql.graphqlMod.GraphQLSchema
  import typings.graphql.languageAstMod.DocumentNode
  import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
  import typings.std.AsyncIterator

  type ExecuteFunction = js.Function7[
    /* schema */ GraphQLSchema, 
    /* document */ DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[String], 
    /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]], 
    ExecutionResult[ExecutionResultDataDefault] | js.Promise[ExecutionResult[ExecutionResultDataDefault]] | (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]])
  ]
  type ExecutionIterator = AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]
  type SubscribeFunction = js.Function8[
    /* schema */ GraphQLSchema, 
    /* document */ DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[String], 
    /* fieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]], 
    /* subscribeFieldResolver */ js.UndefOr[GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]], 
    (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[
      (AsyncIterator[ExecutionResult[ExecutionResultDataDefault], js.Any, js.UndefOr[scala.Nothing]]) | ExecutionResult[ExecutionResultDataDefault]
    ])
  ]
}
