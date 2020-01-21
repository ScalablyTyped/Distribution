package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLUnionType")
@js.native
class GraphQLUnionType protected ()
  extends GraphQLAbstractType
     with GraphQLCompositeType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLUnionTypeConfig) = this()
  var description: String = js.native
  var name: String = js.native
  @JSName("resolveType")
  var resolveType_Original: GraphQLTypeResolveFn = js.native
  def getTypes(): js.Array[GraphQLObjectType] = js.native
  def resolveType(value: js.Any, context: js.Any, info: GraphQLResolveInfo): GraphQLObjectType = js.native
}

