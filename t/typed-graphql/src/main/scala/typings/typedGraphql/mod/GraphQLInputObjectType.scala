package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLInputObjectType")
@js.native
class GraphQLInputObjectType protected ()
  extends GraphQLInputType
     with GraphQLNamedType
     with GraphQLNullableType
     with GraphQLType {
  def this(config: InputObjectConfig) = this()
  var description: String = js.native
  var name: String = js.native
  def getFields(): InputObjectFieldMap = js.native
}

