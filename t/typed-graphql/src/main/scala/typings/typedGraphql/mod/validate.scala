package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql", "validate")
@js.native
object validate extends js.Object {
  
  def apply(schema: GraphQLSchema, ast: Document): js.Array[GraphQLError] = js.native
  def apply(schema: GraphQLSchema, ast: Document, rules: js.Array[_]): js.Array[GraphQLError] = js.native
}
