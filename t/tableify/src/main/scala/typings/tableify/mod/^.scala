package typings.tableify.mod

import typings.std.Record
import typings.tableify.tableifyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tableify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(obj: js.Any): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: js.Array[String]): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: js.Array[String], parents: js.Array[_]): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: `false`): String = js.native
  def apply[T /* <: Record[String, _] */](obj: T, columns: `false`, parents: js.Array[_]): String = js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T]): String = js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: js.Array[String]): String = js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: js.Array[String], parents: js.Array[_]): String = js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: `false`): String = js.native
  def apply[T /* <: Record[String, _] */](obj: js.Array[T], columns: `false`, parents: js.Array[_]): String = js.native
}

