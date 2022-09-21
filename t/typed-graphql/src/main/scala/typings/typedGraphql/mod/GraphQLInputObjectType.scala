package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLInputObjectType")
@js.native
open class GraphQLInputObjectType protected ()
  extends StObject
     with GraphQLInputType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLType {
  def this(config: InputObjectConfig) = this()
  
  var description: String = js.native
  
  def getFields(): InputObjectFieldMap = js.native
  
  var name: String = js.native
}
