package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLUnionType")
@js.native
open class GraphQLUnionType protected ()
  extends StObject
     with GraphQLAbstractType
     with GraphQLCompositeType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLUnionTypeConfig) = this()
  
  var description: String = js.native
  
  def getTypes(): js.Array[GraphQLObjectType] = js.native
  
  var name: String = js.native
  
  def resolveType(value: Any, context: Any, info: GraphQLResolveInfo): GraphQLObjectType = js.native
  @JSName("resolveType")
  var resolveType_Original: GraphQLTypeResolveFn = js.native
}
