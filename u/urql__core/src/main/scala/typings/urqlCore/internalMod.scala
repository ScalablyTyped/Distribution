package typings.urqlCore

import typings.std.RequestInit
import typings.urqlCore.anon.Query
import typings.urqlCore.fetchOptionsMod.FetchBody
import typings.urqlCore.typesMod.Operation
import typings.urqlCore.typesMod.OperationResult
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/internal", JSImport.Namespace)
@js.native
object internalMod extends js.Object {
  def makeFetchBody(request: Query): FetchBody = js.native
  def makeFetchOptions(operation: Operation): RequestInit = js.native
  def makeFetchOptions(operation: Operation, body: FetchBody): RequestInit = js.native
  def makeFetchSource(operation: Operation, url: String, fetchOptions: RequestInit): sourceT[OperationResult[_]] = js.native
  def makeFetchURL(operation: Operation): String = js.native
  def makeFetchURL(operation: Operation, body: FetchBody): String = js.native
}

