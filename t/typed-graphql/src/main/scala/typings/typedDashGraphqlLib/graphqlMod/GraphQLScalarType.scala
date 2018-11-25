package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLScalarType")
@js.native
class GraphQLScalarType protected () extends js.Object {
  def this(config: GraphQLScalarTypeConfig) = this()
  var name: java.lang.String = js.native
  def parseLiteral(valueAST: Value): js.Any = js.native
  def parseValue(value: js.Any): js.Any = js.native
  def serialize(value: js.Any): js.Any = js.native
}

