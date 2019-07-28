package typings.tableify.tableifyMod

import typings.std.Record
import typings.tableify.Fn_Columns
import typings.tableify.tableifyNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tableify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(obj: js.Any): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T | js.Array[T]): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T | js.Array[T], columns: js.Array[String] | `false`): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T | js.Array[T], columns: js.Array[String] | `false`, parents: js.Array[_]): String = js.native
  def defaults(config: Config): Fn_Columns = js.native
}

