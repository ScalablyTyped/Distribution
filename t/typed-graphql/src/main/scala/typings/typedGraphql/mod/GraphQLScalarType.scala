package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLScalarType")
@js.native
open class GraphQLScalarType protected ()
  extends StObject
     with GraphQLInputType
     with GraphQLLeafType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLScalarTypeConfig) = this()
  
  var name: String = js.native
  
  def parseLiteral(valueAST: Value): Any = js.native
  
  def parseValue(value: Any): Any = js.native
  
  def serialize(value: Any): Any = js.native
}
