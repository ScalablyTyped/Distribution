package typings.tableDashResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("table-resolver", JSImport.Namespace)
@js.native
object tableDashResolverMod extends js.Object {
  def columnChildren[T](args: Anon_Columns[T]): js.Array[T] = js.native
  def headerRows[T](args: Anon_Columns[T]): js.Array[T] = js.native
  def nested[T](args: Anon_Column[T]): T = js.native
  def resolve[T](args: Anon_Args[T]): js.Function1[/* data */ js.Any, js.Array[T]] = js.native
}

