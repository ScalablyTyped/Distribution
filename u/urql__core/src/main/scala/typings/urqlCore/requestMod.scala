package typings.urqlCore

import typings.graphql.astMod.DocumentNode
import typings.urqlCore.typesMod.GraphQLRequest
import typings.urqlCore.typesMod.Operation
import typings.urqlCore.typesMod.OperationDebugMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  def addMetadata(source: Operation, meta: OperationDebugMeta): AnonContext = js.native
  def createRequest(q: String): GraphQLRequest = js.native
  def createRequest(q: String, vars: js.Object): GraphQLRequest = js.native
  def createRequest(q: DocumentNode): GraphQLRequest = js.native
  def createRequest(q: DocumentNode, vars: js.Object): GraphQLRequest = js.native
}

