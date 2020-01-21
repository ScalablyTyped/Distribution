package typings.typedGraphql.mod

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
  var description: String = js.native
  var name: String = js.native
  def getValues(): js.Array[GraphQLEnumValueDefinition] = js.native
  def parseLiteral(valueAST: Value): js.Any = js.native
  def parseValue(value: js.Any): js.Any = js.native
  def serialize(value: js.Any): String = js.native
}

