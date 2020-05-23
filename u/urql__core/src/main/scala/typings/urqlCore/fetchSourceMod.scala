package typings.urqlCore

import typings.std.RequestInit
import typings.urqlCore.typesMod.Operation
import typings.urqlCore.typesMod.OperationResult
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/internal/fetchSource", JSImport.Namespace)
@js.native
object fetchSourceMod extends js.Object {
  def makeFetchSource(operation: Operation, url: String, fetchOptions: RequestInit): sourceT[OperationResult[_]] = js.native
}

