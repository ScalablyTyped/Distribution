package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GraphQLBoolean: typedDashGraphqlLib.graphqlMod.GraphQLScalarType = js.native
  var GraphQLFloat: typedDashGraphqlLib.graphqlMod.GraphQLScalarType = js.native
  var GraphQLID: typedDashGraphqlLib.graphqlMod.GraphQLScalarType = js.native
  var GraphQLIncludeDirective: typedDashGraphqlLib.graphqlMod.GraphQLDirective = js.native
  var GraphQLInt: typedDashGraphqlLib.graphqlMod.GraphQLScalarType = js.native
  var GraphQLSkipDirective: typedDashGraphqlLib.graphqlMod.GraphQLDirective = js.native
  var GraphQLString: typedDashGraphqlLib.graphqlMod.GraphQLScalarType = js.native
  val introspectionQuery: java.lang.String = js.native
  val specifiedRules: js.Array[typedDashGraphqlLib.graphqlMod.ValidationRule] = js.native
  def buildClientSchema(introspection: typedDashGraphqlLib.graphqlMod.IntrospectionQuery): typedDashGraphqlLib.graphqlMod.GraphQLSchema = js.native
  def formatError(error: typedDashGraphqlLib.graphqlMod.GraphQLError): typedDashGraphqlLib.graphqlMod.GraphQLFormattedError = js.native
  def graphql(schema: typedDashGraphqlLib.graphqlMod.GraphQLSchema, requestString: java.lang.String): js.Promise[typedDashGraphqlLib.graphqlMod.GraphQLResult] = js.native
  def graphql(
    schema: typedDashGraphqlLib.graphqlMod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any
  ): js.Promise[typedDashGraphqlLib.graphqlMod.GraphQLResult] = js.native
  def graphql(
    schema: typedDashGraphqlLib.graphqlMod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[typedDashGraphqlLib.graphqlMod.GraphQLResult] = js.native
  def graphql(
    schema: typedDashGraphqlLib.graphqlMod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[typedDashGraphqlLib.graphqlMod.GraphQLResult] = js.native
  def graphql(
    schema: typedDashGraphqlLib.graphqlMod.GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[typedDashGraphqlLib.graphqlMod.GraphQLResult] = js.native
  def validate(schema: typedDashGraphqlLib.graphqlMod.GraphQLSchema, ast: typedDashGraphqlLib.graphqlMod.Document): js.Array[typedDashGraphqlLib.graphqlMod.GraphQLError] = js.native
  def validate(
    schema: typedDashGraphqlLib.graphqlMod.GraphQLSchema,
    ast: typedDashGraphqlLib.graphqlMod.Document,
    rules: js.Array[_]
  ): js.Array[typedDashGraphqlLib.graphqlMod.GraphQLError] = js.native
}

