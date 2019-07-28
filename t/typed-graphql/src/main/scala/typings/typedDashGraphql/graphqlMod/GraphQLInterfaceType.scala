package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLInterfaceType")
@js.native
class GraphQLInterfaceType protected ()
  extends GraphQLAbstractType
     with GraphQLCompositeType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLInterfaceTypeConfig) = this()
  var description: String = js.native
  var name: String = js.native
  @JSName("resolveType")
  var resolveType_Original: GraphQLTypeResolveFn = js.native
  def getFields(): GraphQLFieldDefinitionMap = js.native
  def getObjectType(value: js.Any, info: GraphQLResolveInfo): GraphQLObjectType = js.native
  def getPossibleTypes(): js.Array[GraphQLObjectType] = js.native
  def isPossibleType(`type`: GraphQLObjectType): Boolean = js.native
  def resolveType(value: js.Any, context: js.Any, info: GraphQLResolveInfo): GraphQLObjectType = js.native
}

