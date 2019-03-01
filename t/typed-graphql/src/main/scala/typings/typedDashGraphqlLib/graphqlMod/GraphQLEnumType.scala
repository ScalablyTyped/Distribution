package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLEnumType")
@js.native
class GraphQLEnumType protected ()
  extends GraphQLInputType
     with GraphQLLeafType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLEnumTypeConfig) = this()
  var description: java.lang.String = js.native
  var name: java.lang.String = js.native
  def getValues(): js.Array[GraphQLEnumValueDefinition] = js.native
  def parseLiteral(valueAST: Value): js.Any = js.native
  def parseValue(value: js.Any): js.Any = js.native
  def serialize(value: js.Any): java.lang.String = js.native
}

