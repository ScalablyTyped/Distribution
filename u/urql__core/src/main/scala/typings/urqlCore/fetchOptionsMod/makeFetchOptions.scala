package typings.urqlCore.fetchOptionsMod

import typings.std.RequestInit
import typings.urqlCore.typesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/internal/fetchOptions", "makeFetchOptions")
@js.native
object makeFetchOptions extends js.Object {
  def apply(operation: Operation): RequestInit = js.native
  def apply(operation: Operation, body: FetchBody): RequestInit = js.native
}

