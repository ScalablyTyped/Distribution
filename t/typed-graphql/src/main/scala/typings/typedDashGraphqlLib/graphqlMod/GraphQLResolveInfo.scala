package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResolveInfo extends js.Object {
  var fieldASTs: js.Array[Field]
  var fieldName: java.lang.String
  var fragments: org.scalablytyped.runtime.StringDictionary[FragmentDefinition]
  var operation: OperationDefinition
  var parentType: GraphQLCompositeType
  var returnType: GraphQLOutputType
  var rootValue: js.Any
  var schema: GraphQLSchema
  var variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
}

