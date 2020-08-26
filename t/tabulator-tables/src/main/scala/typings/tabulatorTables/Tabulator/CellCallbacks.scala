package typings.tabulatorTables.Tabulator

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellCallbacks extends js.Object {
  // Cell Events
  /** callback for when user clicks on a cell in this column  */
  var cellClick: js.UndefOr[CellEventCallback] = js.native
  /** callback for when user right clicks on a cell in this column */
  var cellContext: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when user double clicks on a cell in this column */
  var cellDblClick: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when user double taps on a cell in this column, triggered in touch displays when a user taps the same cell twice in under 300ms.  */
  var cellDblTap: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when an edit on a cell in this column is aborted by the user  */
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.native
  /** callback for when a cell in this column has been edited by the user */
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.native
  // Cell editing
  /** callback for when a cell in this column is being edited by the user */
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.native
  /** callback for when the mouse pointer enters a cell */
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when the mouse pointer leaves a cell */
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.native
  /** callback for when the mouse pointer moves over a cell  */
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.native
  /** callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when the mouse pointer enters a cell or one of its child elements */
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.native
  /** callback for when user taps on a cell in this column, triggered in touch displays.  */
  var cellTap: js.UndefOr[CellEventCallback] = js.native
  /**  callback for when user taps and holds on a cell in this column, triggered in touch displays when a user taps and holds the same cell for 1 second.*/
  var cellTapHold: js.UndefOr[CellEventCallback] = js.native
}

object CellCallbacks {
  @scala.inline
  def apply(): CellCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellCallbacks]
  }
  @scala.inline
  implicit class CellCallbacksOps[Self <: CellCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    @scala.inline
    def setCellContext(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellContext", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellContext: Self = this.set("cellContext", js.undefined)
    @scala.inline
    def setCellDblClick(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellDblClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellDblClick: Self = this.set("cellDblClick", js.undefined)
    @scala.inline
    def setCellDblTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellDblTap", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellDblTap: Self = this.set("cellDblTap", js.undefined)
    @scala.inline
    def setCellEditCancelled(value: /* cell */ CellComponent => Unit): Self = this.set("cellEditCancelled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellEditCancelled: Self = this.set("cellEditCancelled", js.undefined)
    @scala.inline
    def setCellEdited(value: /* cell */ CellComponent => Unit): Self = this.set("cellEdited", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellEdited: Self = this.set("cellEdited", js.undefined)
    @scala.inline
    def setCellEditing(value: /* cell */ CellComponent => Unit): Self = this.set("cellEditing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellEditing: Self = this.set("cellEditing", js.undefined)
    @scala.inline
    def setCellMouseEnter(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellMouseEnter: Self = this.set("cellMouseEnter", js.undefined)
    @scala.inline
    def setCellMouseLeave(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseLeave", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellMouseLeave: Self = this.set("cellMouseLeave", js.undefined)
    @scala.inline
    def setCellMouseMove(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellMouseMove: Self = this.set("cellMouseMove", js.undefined)
    @scala.inline
    def setCellMouseOut(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellMouseOut: Self = this.set("cellMouseOut", js.undefined)
    @scala.inline
    def setCellMouseOver(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellMouseOver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellMouseOver: Self = this.set("cellMouseOver", js.undefined)
    @scala.inline
    def setCellTap(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellTap", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellTap: Self = this.set("cellTap", js.undefined)
    @scala.inline
    def setCellTapHold(value: (/* e */ UIEvent, /* cell */ CellComponent) => Unit): Self = this.set("cellTapHold", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCellTapHold: Self = this.set("cellTapHold", js.undefined)
  }
  
}

