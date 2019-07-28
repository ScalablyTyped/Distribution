package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "GraphQLList")
@js.native
class GraphQLList protected ()
  extends GraphQLInputType
     with GraphQLNullableType
     with GraphQLOutputType
     with GraphQLType {
  def this(`type`: GraphQLType) = this()
  var ofType: GraphQLType = js.native
}

