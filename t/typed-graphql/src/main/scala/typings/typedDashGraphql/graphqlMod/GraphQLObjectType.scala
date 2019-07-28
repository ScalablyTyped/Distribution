package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType protected ()
  extends GraphQLCompositeType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLObjectTypeConfig) = this()
  var name: String = js.native
  def getFields(): GraphQLFieldDefinitionMap = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
}

