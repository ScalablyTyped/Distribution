package typings.tabulatorDashTables.TabulatorNs

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
    cellClick: CellEventCallback = null,
    cellContext: CellEventCallback = null,
    cellDblClick: CellEventCallback = null,
    cellDblTap: CellEventCallback = null,
    cellEditCancelled: CellEditEventCallback = null,
    cellEdited: CellEditEventCallback = null,
    cellEditing: CellEditEventCallback = null,
    cellMouseEnter: CellEventCallback = null,
    cellMouseLeave: CellEventCallback = null,
    cellMouseMove: CellEventCallback = null,
    cellMouseOut: CellEventCallback = null,
    cellMouseOver: CellEventCallback = null,
    cellTap: CellEventCallback = null,
    cellTapHold: CellEventCallback = null
  ): CellCallbacks = {
    val __obj = js.Dynamic.literal()
    if (cellClick != null) __obj.updateDynamic("cellClick")(cellClick)
    if (cellContext != null) __obj.updateDynamic("cellContext")(cellContext)
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(cellDblClick)
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(cellDblTap)
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(cellEditCancelled)
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(cellEdited)
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(cellEditing)
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(cellMouseEnter)
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(cellMouseLeave)
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(cellMouseMove)
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(cellMouseOut)
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(cellMouseOver)
    if (cellTap != null) __obj.updateDynamic("cellTap")(cellTap)
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(cellTapHold)
    __obj.asInstanceOf[CellCallbacks]
  }
}

