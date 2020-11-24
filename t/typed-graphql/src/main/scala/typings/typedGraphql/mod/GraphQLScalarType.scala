package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLScalarType")
@js.native
class GraphQLScalarType protected ()
  extends GraphQLInputType
     with GraphQLLeafType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLScalarTypeConfig) = this()
  
  var name: String = js.native
  
  def parseLiteral(valueAST: Value): js.Any = js.native
  
  def parseValue(value: js.Any): js.Any = js.native
  
  def serialize(value: js.Any): js.Any = js.native
}
