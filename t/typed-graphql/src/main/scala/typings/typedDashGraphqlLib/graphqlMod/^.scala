package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var GraphQLBoolean: GraphQLScalarType = js.native
  var GraphQLFloat: GraphQLScalarType = js.native
  var GraphQLID: GraphQLScalarType = js.native
  var GraphQLIncludeDirective: GraphQLDirective = js.native
  var GraphQLInt: GraphQLScalarType = js.native
  var GraphQLSkipDirective: GraphQLDirective = js.native
  var GraphQLString: GraphQLScalarType = js.native
  val introspectionQuery: java.lang.String = js.native
  val specifiedRules: js.Array[ValidationRule] = js.native
  def buildClientSchema(introspection: IntrospectionQuery): GraphQLSchema = js.native
  def formatError(error: GraphQLError): GraphQLFormattedError = js.native
  def graphql(schema: GraphQLSchema, requestString: java.lang.String): js.Promise[GraphQLResult] = js.native
  def graphql(schema: GraphQLSchema, requestString: java.lang.String, rootValue: js.Any): js.Promise[GraphQLResult] = js.native
  def graphql(schema: GraphQLSchema, requestString: java.lang.String, rootValue: js.Any, contextValue: js.Any): js.Promise[GraphQLResult] = js.native
  def graphql(
    schema: GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[GraphQLResult] = js.native
  def graphql(
    schema: GraphQLSchema,
    requestString: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: java.lang.String
  ): js.Promise[GraphQLResult] = js.native
  def validate(schema: GraphQLSchema, ast: Document): js.Array[GraphQLError] = js.native
  def validate(schema: GraphQLSchema, ast: Document, rules: js.Array[_]): js.Array[GraphQLError] = js.native
}

