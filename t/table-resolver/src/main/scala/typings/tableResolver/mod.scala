package typings.tableResolver

import typings.tableResolver.anon.Column
import typings.tableResolver.anon.Columns
import typings.tableResolver.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("table-resolver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def columnChildren[T](args: Columns[T]): js.Array[T] = js.native
  def headerRows[T](args: Columns[T]): js.Array[T] = js.native
  def nested[T](args: Column[T]): T = js.native
  def resolve[T](args: Method[T]): js.Function1[/* data */ js.Any, js.Array[T]] = js.native
}

