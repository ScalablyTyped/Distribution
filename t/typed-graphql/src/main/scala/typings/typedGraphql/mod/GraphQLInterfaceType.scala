package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLInterfaceType")
@js.native
open class GraphQLInterfaceType protected ()
  extends StObject
     with GraphQLAbstractType
     with GraphQLCompositeType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLInterfaceTypeConfig) = this()
  
  var description: String = js.native
  
  def getFields(): GraphQLFieldDefinitionMap = js.native
  
  def getObjectType(value: Any, info: GraphQLResolveInfo): GraphQLObjectType = js.native
  
  def getPossibleTypes(): js.Array[GraphQLObjectType] = js.native
  
  def isPossibleType(`type`: GraphQLObjectType): Boolean = js.native
  
  var name: String = js.native
  
  def resolveType(value: Any, context: Any, info: GraphQLResolveInfo): GraphQLObjectType = js.native
  @JSName("resolveType")
  var resolveType_Original: GraphQLTypeResolveFn = js.native
}
