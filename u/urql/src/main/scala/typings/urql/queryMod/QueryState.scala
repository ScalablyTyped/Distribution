package typings.urql.queryMod

import typings.urql.PartialOperationContext
import typings.urql.useQueryMod.UseQueryState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryState[T] extends UseQueryState[T] {
  def executeQuery(): Unit = js.native
  def executeQuery(opts: PartialOperationContext): Unit = js.native
}

