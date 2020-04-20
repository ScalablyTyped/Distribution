package typings.urql

import typings.graphql.astMod.DocumentNode
import typings.urqlCore.typesMod.GraphQLRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("urql/dist/types/hooks/useRequest", JSImport.Namespace)
@js.native
object useRequestMod extends js.Object {
  def useRequest(query: String): GraphQLRequest = js.native
  def useRequest(query: String, variables: js.Any): GraphQLRequest = js.native
  def useRequest(query: DocumentNode): GraphQLRequest = js.native
  def useRequest(query: DocumentNode, variables: js.Any): GraphQLRequest = js.native
}

