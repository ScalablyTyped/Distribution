package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsMenu extends js.Object {
  var rowContextMenu: js.UndefOr[
    (js.Array[MenuObject | MenuSeparator]) | (js.Function1[
      /* component */ RowComponent | CellComponent | ColumnComponent, 
      MenuObject | `false` | js.Array[_]
    ])
  ] = js.undefined
}

object OptionsMenu {
  @scala.inline
  def apply(
    rowContextMenu: (js.Array[MenuObject | MenuSeparator]) | (js.Function1[
      /* component */ RowComponent | CellComponent | ColumnComponent, 
      MenuObject | `false` | js.Array[_]
    ]) = null
  ): OptionsMenu = {
    val __obj = js.Dynamic.literal()
    if (rowContextMenu != null) __obj.updateDynamic("rowContextMenu")(rowContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsMenu]
  }
}

