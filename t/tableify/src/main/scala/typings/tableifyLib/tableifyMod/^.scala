package typings
package tableifyLib.tableifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tableify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(obj: js.Any): java.lang.String = js.native
  def apply[T /* <: stdLib.Record[java.lang.String, _] */](obj: T | js.Array[T]): java.lang.String = js.native
  def apply[T /* <: stdLib.Record[java.lang.String, _] */](obj: T | js.Array[T], columns: js.Array[java.lang.String] | tableifyLib.tableifyLibNumbers.`false`): java.lang.String = js.native
  def apply[T /* <: stdLib.Record[java.lang.String, _] */](
    obj: T | js.Array[T],
    columns: js.Array[java.lang.String] | tableifyLib.tableifyLibNumbers.`false`,
    parents: js.Array[_]
  ): java.lang.String = js.native
  def defaults(config: tableifyLib.tableifyMod.tableifyNs.Config): tableifyLib.Anon_Columns = js.native
}

