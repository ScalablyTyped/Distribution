package typings.tablesorter

import typings.tablesorter.parsingParsedOptionMod.ParsedOption
import typings.tablesorter.tablesorterMod._Global_.HTMLElement
import typings.tablesorter.tablesorterMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tablesorter/Parsing/ParsedCell", JSImport.Namespace)
@js.native
object parsingParsedCellMod extends js.Object {
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

