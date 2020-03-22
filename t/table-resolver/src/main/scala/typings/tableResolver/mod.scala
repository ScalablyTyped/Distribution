package typings.tableResolver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("table-resolver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def columnChildren[T](args: AnonColumns[T]): js.Array[T] = js.native
  def headerRows[T](args: AnonColumns[T]): js.Array[T] = js.native
  def nested[T](args: AnonColumn[T]): T = js.native
  def resolve[T](args: AnonMethod[T]): js.Function1[/* data */ js.Any, js.Array[T]] = js.native
}

