package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLObjectType")
@js.native
class GraphQLObjectType protected () extends js.Object {
  def this(config: GraphQLObjectTypeConfig) = this()
  var name: java.lang.String = js.native
  def getFields(): GraphQLFieldDefinitionMap = js.native
  def getInterfaces(): js.Array[GraphQLInterfaceType] = js.native
}

