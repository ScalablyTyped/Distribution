package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType protected ()
  extends GraphQLCompositeType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLObjectTypeConfig) = this()
  
  def getFields(): GraphQLFieldDefinitionMap = js.native
  
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  
  var name: String = js.native
}
