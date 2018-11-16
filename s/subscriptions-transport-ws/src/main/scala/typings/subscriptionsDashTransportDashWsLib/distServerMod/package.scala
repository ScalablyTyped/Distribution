package typings
package subscriptionsDashTransportDashWsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distServerMod {
  type ExecuteFunction = js.Function7[
    /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
    /* document */ graphqlLib.languageAstMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]]
    ], 
    (stdLib.Promise[
      graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
    ]) | (stdLib.AsyncIterator[
      graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
    ])
  ]
  type ExecutionIterator = stdLib.AsyncIterator[
    graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ]
  type SubscribeFunction = js.Function8[
    /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
    /* document */ graphqlLib.languageAstMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]]
    ], 
    /* subscribeFieldResolver */ js.UndefOr[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]]
    ], 
    (stdLib.AsyncIterator[
      graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
    ]) | (stdLib.Promise[
      (stdLib.AsyncIterator[
        graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
      ]) | graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
    ])
  ]
}
