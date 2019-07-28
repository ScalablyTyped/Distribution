package typings.ydnDashDb.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ydn.db.IndexKeyIterator")
@js.native
class IndexKeyIterator protected () extends Iterator {
  def this(store_name: String, index_name: String) = this()
  def this(store_name: String, index_name: String, key_range: js.Any) = this()
  def this(store_name: String, index_name: String, key_range: js.Any, reverse: Boolean) = this()
}

/* static members */
@JSGlobal("ydn.db.IndexKeyIterator")
@js.native
object IndexKeyIterator extends js.Object {
  def where(store_name: String, index_name: String, op: Op, value: js.Any, op2: Op, value2: js.Any): js.Any = js.native
}

