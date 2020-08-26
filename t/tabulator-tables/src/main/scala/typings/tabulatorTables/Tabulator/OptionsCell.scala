package typings.tabulatorTables.Tabulator

import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsCell extends js.Object {
  /** The cellClick callback is triggered when a user left clicks on a cell, it can be set on a per column basis using the option in the columns definition object. */
  var cellClick: js.UndefOr[CellEventCallback] = js.native
  var cellContext: js.UndefOr[CellEventCallback] = js.native
  var cellDblClick: js.UndefOr[CellEventCallback] = js.native
  var cellDblTap: js.UndefOr[CellEventCallback] = js.native
  var cellEditCancelled: js.UndefOr[CellEditEventCallback] = js.native
  var cellEdited: js.UndefOr[CellEditEventCallback] = js.native
  var cellEditing: js.UndefOr[CellEditEventCallback] = js.native
  var cellHozAlign: js.UndefOr[ColumnDefinitionAlign] = js.native
  var cellMouseEnter: js.UndefOr[CellEventCallback] = js.native
  var cellMouseLeave: js.UndefOr[CellEventCallback] = js.native
  var cellMouseMove: js.UndefOr[CellEventCallback] = js.native
  var cellMouseOut: js.UndefOr[CellEventCallback] = js.native
  var cellMouseOver: js.UndefOr[CellEventCallback] = js.native
  var cellTap: js.UndefOr[CellEventCallback] = js.native
  var cellTapHold: js.UndefOr[CellEventCallback] = js.native
  var cellVertAlign: js.UndefOr[VerticalAlign] = js.native
}

object OptionsCell {
  @scala.inline
  def apply(): OptionsCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsCell]
  }
  @scala.inline
  implicit class OptionsCellOps[Self <: OptionsCell] (val x: Self) extends AnyVal {
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
    def setCellHozAlign(value: ColumnDefinitionAlign): Self = this.set("cellHozAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellHozAlign: Self = this.set("cellHozAlign", js.undefined)
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
    @scala.inline
    def setCellVertAlign(value: VerticalAlign): Self = this.set("cellVertAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellVertAlign: Self = this.set("cellVertAlign", js.undefined)
  }
  
}

