package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLEnumType")
@js.native
open class GraphQLEnumType protected ()
  extends StObject
     with GraphQLInputType
     with GraphQLLeafType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(config: GraphQLEnumTypeConfig) = this()
  
  var description: String = js.native
  
  def getValues(): js.Array[GraphQLEnumValueDefinition] = js.native
  
  var name: String = js.native
  
  def parseLiteral(valueAST: Value): Any = js.native
  
  def parseValue(value: Any): Any = js.native
  
  def serialize(value: Any): String = js.native
}
