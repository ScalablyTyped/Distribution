package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLObjectType")
@js.native
open class GraphQLObjectType protected ()
  extends StObject
     with GraphQLCompositeType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLObjectTypeConfig) = this()
  
  def getFields(): GraphQLFieldDefinitionMap = js.native
  
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
  
  var name: String = js.native
}
