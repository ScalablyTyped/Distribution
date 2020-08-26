package typings.subscriptionsTransportWs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverMod {
  type ExecuteFunction = js.Function7[
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    /* document */ typings.graphql.astMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    (typings.graphql.executeMod.ExecutionResult[
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[js.Any]
    ]) | (js.Promise[
      typings.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ]
    ]) | (typings.std.AsyncIterator[
      typings.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ], 
      js.Any, 
      js.UndefOr[scala.Nothing]
    ])
  ]
  type ExecutionIterator = typings.std.AsyncIterator[
    typings.graphql.executeMod.ExecutionResult[
      org.scalablytyped.runtime.StringDictionary[js.Any], 
      org.scalablytyped.runtime.StringDictionary[js.Any]
    ], 
    js.Any, 
    js.UndefOr[scala.Nothing]
  ]
  type SubscribeFunction = js.Function8[
    /* schema */ typings.graphql.mod.GraphQLSchema, 
    /* document */ typings.graphql.astMod.DocumentNode, 
    /* rootValue */ js.UndefOr[js.Any], 
    /* contextValue */ js.UndefOr[js.Any], 
    /* variableValues */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
    /* operationName */ js.UndefOr[java.lang.String], 
    /* fieldResolver */ js.UndefOr[
      typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    /* subscribeFieldResolver */ js.UndefOr[
      typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
    ], 
    (typings.std.AsyncIterator[
      typings.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ], 
      js.Any, 
      js.UndefOr[scala.Nothing]
    ]) | (js.Promise[
      (typings.std.AsyncIterator[
        typings.graphql.executeMod.ExecutionResult[
          org.scalablytyped.runtime.StringDictionary[js.Any], 
          org.scalablytyped.runtime.StringDictionary[js.Any]
        ], 
        js.Any, 
        js.UndefOr[scala.Nothing]
      ]) | (typings.graphql.executeMod.ExecutionResult[
        org.scalablytyped.runtime.StringDictionary[js.Any], 
        org.scalablytyped.runtime.StringDictionary[js.Any]
      ])
    ])
  ]
}
