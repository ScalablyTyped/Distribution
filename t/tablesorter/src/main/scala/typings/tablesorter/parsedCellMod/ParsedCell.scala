package typings.tablesorter.parsedCellMod

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.parsedOptionMod.ParsedOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedCell extends ParsedOption {
  /**
    * The jQuery-object which contains the cell.
    */
  @JSName("$cell")
  var $cell: JQuery[HTMLElement] = js.native
  /**
    * The jQuery-object which contains the row.
    */
  @JSName("$row")
  var $row: JQuery[HTMLElement] = js.native
  /**
    * The index of the row.
    */
  var rowIndex: Double = js.native
  /**
    * The index of the `tbody` of the row.
    */
  var tbodyIndex: Double = js.native
}

object ParsedCell {
  @scala.inline
  def apply(
    $cell: JQuery[HTMLElement],
    $row: JQuery[HTMLElement],
    parsed: js.Any,
    raw: String,
    rowIndex: Double,
    tbodyIndex: Double
  ): ParsedCell = {
    val __obj = js.Dynamic.literal($cell = $cell.asInstanceOf[js.Any], $row = $row.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], tbodyIndex = tbodyIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedCell]
  }
  @scala.inline
  implicit class ParsedCellOps[Self <: ParsedCell] (val x: Self) extends AnyVal {
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
    def set$cell(value: JQuery[HTMLElement]): Self = this.set("$cell", value.asInstanceOf[js.Any])
    @scala.inline
    def set$row(value: JQuery[HTMLElement]): Self = this.set("$row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setTbodyIndex(value: Double): Self = this.set("tbodyIndex", value.asInstanceOf[js.Any])
  }
  
}

