package typings.tablesorter.tablesorterCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TablesorterCache extends js.Object {
  /**
    * The maximal values of the columns.
    */
  var colMax: js.Array[_]
  /**
    * The normalized data.
    */
  var normalized: js.Array[_]
}

object TablesorterCache {
  @scala.inline
  def apply(colMax: js.Array[_], normalized: js.Array[_]): TablesorterCache = {
    val __obj = js.Dynamic.literal(colMax = colMax.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesorterCache]
  }
}

