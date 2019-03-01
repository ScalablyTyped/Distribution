package typings
package typedDashGraphqlLib.graphqlMod

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
  var description: java.lang.String = js.native
  var name: java.lang.String = js.native
  def getFields(): InputObjectFieldMap = js.native
}

