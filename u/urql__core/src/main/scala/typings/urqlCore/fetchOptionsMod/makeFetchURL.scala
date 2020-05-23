package typings.urqlCore.fetchOptionsMod

import typings.urqlCore.typesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@urql/core/dist/types/internal/fetchOptions", "makeFetchURL")
@js.native
object makeFetchURL extends js.Object {
  def apply(operation: Operation): String = js.native
  def apply(operation: Operation, body: FetchBody): String = js.native
}

