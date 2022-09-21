package typings.tablesorter

import typings.tablesorter.mod.global.HTMLElement
import typings.tablesorter.mod.global.JQuery
import typings.tablesorter.parsedOptionMod.ParsedOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsedCellMod {
  
  trait ParsedCell
    extends StObject
       with ParsedOption {
    
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
    
    inline def apply(
      $cell: JQuery[HTMLElement],
      $row: JQuery[HTMLElement],
      parsed: Any,
      raw: String,
      rowIndex: Double,
      tbodyIndex: Double
    ): ParsedCell = {
      val __obj = js.Dynamic.literal($cell = $cell.asInstanceOf[js.Any], $row = $row.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], tbodyIndex = tbodyIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedCell]
    }
    
    extension [Self <: ParsedCell](x: Self) {
      
      inline def set$cell(value: JQuery[HTMLElement]): Self = StObject.set(x, "$cell", value.asInstanceOf[js.Any])
      
      inline def set$row(value: JQuery[HTMLElement]): Self = StObject.set(x, "$row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setTbodyIndex(value: Double): Self = StObject.set(x, "tbodyIndex", value.asInstanceOf[js.Any])
    }
  }
}
