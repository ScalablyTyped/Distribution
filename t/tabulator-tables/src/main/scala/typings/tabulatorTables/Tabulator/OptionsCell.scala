package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsCell extends js.Object {
  /** The cellClick callback is triggered when a user left clicks on a cell, it can be set on a per column basis using the option in the columns definition object. */
  var cellClick: js.UndefOr[CellEventCallback] = js.undefined
  var cellContext: js.UndefOr[CellEventCallback] = js.undefined
  var cellDblClick: js.UndefOr[CellEventCallback] = js.undefined
  var cellDblTap: js.UndefOr[CellEventCallback] = js.undefined
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.undefined
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.undefined
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.undefined
  var cellHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.undefined
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.undefined
  var cellTap: js.UndefOr[CellEventCallback] = js.undefined
  var cellTapHold: js.UndefOr[CellEventCallback] = js.undefined
  var cellVertAlign: js.UndefOr[VerticalAlign] = js.undefined
}

object OptionsCell {
  @scala.inline
  def apply(
    cellClick: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellContext: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellDblClick: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellDblTap: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellEditCancelled: /* cell */ CellComponent => Unit = null,
    cellEdited: /* cell */ CellComponent => Unit = null,
    cellEditing: /* cell */ CellComponent => Unit = null,
    cellHozAlign: ColumnDefinitionAlign = null,
    cellMouseEnter: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseLeave: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseMove: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseOut: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellMouseOver: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellTap: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellTapHold: (/* e */ js.Any, /* cell */ CellComponent) => Unit = null,
    cellVertAlign: VerticalAlign = null
  ): OptionsCell = {
    val __obj = js.Dynamic.literal()
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2(cellClick))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2(cellContext))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2(cellDblClick))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2(cellDblTap))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1(cellEditCancelled))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1(cellEdited))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1(cellEditing))
    if (cellHozAlign != null) __obj.updateDynamic("cellHozAlign")(cellHozAlign.asInstanceOf[js.Any])
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2(cellMouseEnter))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2(cellMouseLeave))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2(cellMouseMove))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2(cellMouseOut))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2(cellMouseOver))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2(cellTap))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2(cellTapHold))
    if (cellVertAlign != null) __obj.updateDynamic("cellVertAlign")(cellVertAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsCell]
  }
}

