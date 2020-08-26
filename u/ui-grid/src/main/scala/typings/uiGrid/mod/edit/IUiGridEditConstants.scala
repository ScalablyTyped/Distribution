package typings.uiGrid.mod.edit

import typings.uiGrid.anon.BEGINCELLEDIT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUiGridEditConstants extends js.Object {
  var EDITABLE_CELL_DIRECTIVE: String = js.native
  var EDITABLE_CELL_TEMPLATE: String = js.native
  var events: BEGINCELLEDIT = js.native
}

object IUiGridEditConstants {
  @scala.inline
  def apply(EDITABLE_CELL_DIRECTIVE: String, EDITABLE_CELL_TEMPLATE: String, events: BEGINCELLEDIT): IUiGridEditConstants = {
    val __obj = js.Dynamic.literal(EDITABLE_CELL_DIRECTIVE = EDITABLE_CELL_DIRECTIVE.asInstanceOf[js.Any], EDITABLE_CELL_TEMPLATE = EDITABLE_CELL_TEMPLATE.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridEditConstants]
  }
  @scala.inline
  implicit class IUiGridEditConstantsOps[Self <: IUiGridEditConstants] (val x: Self) extends AnyVal {
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
    def setEDITABLE_CELL_DIRECTIVE(value: String): Self = this.set("EDITABLE_CELL_DIRECTIVE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEDITABLE_CELL_TEMPLATE(value: String): Self = this.set("EDITABLE_CELL_TEMPLATE", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: BEGINCELLEDIT): Self = this.set("events", value.asInstanceOf[js.Any])
  }
  
}

