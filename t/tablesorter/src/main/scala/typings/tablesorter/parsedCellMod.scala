package typings.tablesorter

import typings.tablesorter.mod._Global_.HTMLElement
import typings.tablesorter.mod._Global_.JQuery
import typings.tablesorter.parsedOptionMod.ParsedOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Parsing/ParsedCell", JSImport.Namespace)
@js.native
object parsedCellMod extends js.Object {
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
  
}

