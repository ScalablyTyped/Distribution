package typings.tablesorter.parsingParsedCellMod

import typings.tablesorter.parsingParsedOptionMod.ParsedOption
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedCell extends ParsedOption {
  /**
    * The jQuery-object which contains the cell.
    */
  @JSName("$cell")
  var $cell: JQuery[HTMLElement]
  /**
    * The jQuery-object which contains the row.
    */
  @JSName("$row")
  var $row: JQuery[HTMLElement]
  /**
    * The index of the row.
    */
  var rowIndex: Double
  /**
    * The index of the `tbody` of the row.
    */
  var tbodyIndex: Double
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
}

