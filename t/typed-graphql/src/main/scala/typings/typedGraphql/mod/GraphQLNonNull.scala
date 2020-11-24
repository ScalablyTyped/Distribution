package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "GraphQLNonNull")
@js.native
class GraphQLNonNull protected ()
  extends GraphQLInputType
     with GraphQLOutputType
     with GraphQLType {
  def this(`type`: GraphQLNullableType) = this()
  
  var ofType: GraphQLNullableType = js.native
}
