package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowCol[T] extends js.Object {
  var column: js.UndefOr[T] = js.undefined
  var row: js.UndefOr[T] = js.undefined
}

object RowCol {
  @scala.inline
  def apply[T](column: T = null, row: T = null): RowCol[T] = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowCol[T]]
  }
}

