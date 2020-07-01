package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsMenu extends js.Object {
  var groupContextMenu: js.UndefOr[js.Array[MenuObject[GroupComponent]]] = js.undefined
  var rowContextMenu: js.UndefOr[
    (js.Array[MenuObject[RowComponent] | MenuSeparator]) | (js.Function1[/* component */ RowComponent, MenuObject[RowComponent] | `false` | js.Array[_]])
  ] = js.undefined
}

object OptionsMenu {
  @scala.inline
  def apply(
    groupContextMenu: js.Array[MenuObject[GroupComponent]] = null,
    rowContextMenu: (js.Array[MenuObject[RowComponent] | MenuSeparator]) | (js.Function1[/* component */ RowComponent, MenuObject[RowComponent] | `false` | js.Array[_]]) = null
  ): OptionsMenu = {
    val __obj = js.Dynamic.literal()
    if (groupContextMenu != null) __obj.updateDynamic("groupContextMenu")(groupContextMenu.asInstanceOf[js.Any])
    if (rowContextMenu != null) __obj.updateDynamic("rowContextMenu")(rowContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsMenu]
  }
}

