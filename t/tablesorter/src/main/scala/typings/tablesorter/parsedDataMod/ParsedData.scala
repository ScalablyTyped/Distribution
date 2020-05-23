package typings.tablesorter.parsedDataMod

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedData extends js.Object {
  /**
    * The jQuery-objects containing the cells of the rows.
    */
  @JSName("$cells")
  var $cells: js.Array[JQuery[HTMLElement]]
  /**
    * The parsed values of the rows.
    */
  var parsed: js.Array[_]
  /**
    * The raw values of the rows.
    */
  var raw: js.Array[String]
}

object ParsedData {
  @scala.inline
  def apply($cells: js.Array[JQuery[HTMLElement]], parsed: js.Array[_], raw: js.Array[String]): ParsedData = {
    val __obj = js.Dynamic.literal($cells = $cells.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedData]
  }
}

