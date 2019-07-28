package typings.tabulatorDashTables.TabulatorNs

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
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.undefined
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.undefined
  var cellTap: js.UndefOr[CellEventCallback] = js.undefined
  var cellTapHold: js.UndefOr[CellEventCallback] = js.undefined
}

object OptionsCell {
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
  ): OptionsCell = {
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
    __obj.asInstanceOf[OptionsCell]
  }
}

