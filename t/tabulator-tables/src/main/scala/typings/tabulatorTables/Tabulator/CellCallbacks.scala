package typings.tabulatorTables.Tabulator

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellCallbacks extends js.Object {
  // Cell Events
  /** callback for when user clicks on a cell in this column  */
  var cellClick: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when user right clicks on a cell in this column */
  var cellContext: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when user double clicks on a cell in this column */
  var cellDblClick: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when user double taps on a cell in this column, triggered in touch displays when a user taps the same cell twice in under 300ms.  */
  var cellDblTap: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when an edit on a cell in this column is aborted by the user  */
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.undefined
  /** callback for when a cell in this column has been edited by the user */
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.undefined
  // Cell editing
  /** callback for when a cell in this column is being edited by the user */
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.undefined
  /** callback for when the mouse pointer enters a cell */
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when the mouse pointer leaves a cell */
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when the mouse pointer moves over a cell  */
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.undefined
  /** callback for when user taps on a cell in this column, triggered in touch displays.  */
  var cellTap: js.UndefOr[CellEventCallback] = js.undefined
  /**  callback for when user taps and holds on a cell in this column, triggered in touch displays when a user taps and holds the same cell for 1 second.*/
  var cellTapHold: js.UndefOr[CellEventCallback] = js.undefined
}

object CellCallbacks {
  @scala.inline
  def apply(
    cellClick: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellContext: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellDblClick: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellDblTap: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellEditCancelled: /* cell */ CellComponent => Unit = null,
    cellEdited: /* cell */ CellComponent => Unit = null,
    cellEditing: /* cell */ CellComponent => Unit = null,
    cellMouseEnter: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseLeave: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseMove: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseOut: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellMouseOver: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellTap: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null,
    cellTapHold: (/* e */ UIEvent, /* cell */ CellComponent) => Unit = null
  ): CellCallbacks = {
    val __obj = js.Dynamic.literal()
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2(cellClick))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2(cellContext))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2(cellDblClick))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2(cellDblTap))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1(cellEditCancelled))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1(cellEdited))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1(cellEditing))
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2(cellMouseEnter))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2(cellMouseLeave))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2(cellMouseMove))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2(cellMouseOut))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2(cellMouseOver))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2(cellTap))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2(cellTapHold))
    __obj.asInstanceOf[CellCallbacks]
  }
}

