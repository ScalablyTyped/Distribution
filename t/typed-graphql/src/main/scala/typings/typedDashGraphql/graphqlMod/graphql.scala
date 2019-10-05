package typings.typedDashGraphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "graphql")
@js.native
object graphql extends js.Object {
  def apply(schema: GraphQLSchema, requestString: String): js.Promise[GraphQLResult] = js.native
  def apply(schema: GraphQLSchema, requestString: String, rootValue: js.Any): js.Promise[GraphQLResult] = js.native
  def apply(schema: GraphQLSchema, requestString: String, rootValue: js.Any, contextValue: js.Any): js.Promise[GraphQLResult] = js.native
  def apply(
    schema: GraphQLSchema,
    requestString: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[GraphQLResult] = js.native
  def apply(
    schema: GraphQLSchema,
    requestString: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: String
  ): js.Promise[GraphQLResult] = js.native
}

