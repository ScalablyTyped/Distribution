package typings
package vegaDashTypingsLib.typesSpecLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowColumn[T] extends js.Object {
  var column: js.UndefOr[T | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var row: js.UndefOr[T | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
}

object RowColumn {
  @scala.inline
  def apply[T](
    column: T | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    row: T | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null
  ): RowColumn[T] = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowColumn[T]]
  }
}

