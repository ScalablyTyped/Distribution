package typings.urqlCore

import typings.graphql.astMod.DocumentNode
import typings.std.Error
import typings.std.Exclude
import typings.urqlCore.anon.Context
import typings.urqlCore.anon.NetworkError
import typings.urqlCore.typesMod.GraphQLRequest
import typings.urqlCore.typesMod.Operation
import typings.urqlCore.typesMod.OperationDebugMeta
import typings.urqlCore.typesMod.OperationResult
import typings.urqlCore.typesMod.PromisifiedSource
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  class CombinedError protected ()
    extends typings.urqlCore.errorMod.CombinedError {
    def this(hasNetworkErrorGraphQLErrorsResponse: NetworkError) = this()
  }
  
  def addMetadata(source: Operation, meta: Exclude[js.UndefOr[OperationDebugMeta], js.UndefOr[scala.Nothing]]): Context = js.native
  def collectTypesFromResponse(response: js.Object): js.Array[String] = js.native
  def createRequest(q: String): GraphQLRequest = js.native
  def createRequest(q: String, vars: js.Object): GraphQLRequest = js.native
  def createRequest(q: DocumentNode): GraphQLRequest = js.native
  def createRequest(q: DocumentNode, vars: js.Object): GraphQLRequest = js.native
  def formatDocument(node: DocumentNode): DocumentNode = js.native
  def makeErrorResult(operation: Operation, error: Error): OperationResult[_] = js.native
  def makeErrorResult(operation: Operation, error: Error, response: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any): OperationResult[_] = js.native
  def makeResult(operation: Operation, result: js.Any, response: js.Any): OperationResult[_] = js.native
  def maskTypename(data: js.Any): js.Any = js.native
  def noop(): Unit = js.native
  def stringifyVariables(x: js.Any): String = js.native
  def toSuspenseSource[T](source: sourceT[T]): sourceT[T] = js.native
  def withPromise[T](source$: sourceT[T]): PromisifiedSource[T] = js.native
}

