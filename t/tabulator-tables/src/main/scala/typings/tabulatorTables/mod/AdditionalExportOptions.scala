package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalExportOptions extends StObject {
  
  var columnCalcs: js.UndefOr[Boolean] = js.undefined
  
  var columnGroups: js.UndefOr[Boolean] = js.undefined
  
  var columnHeaders: js.UndefOr[Boolean] = js.undefined
  
  var dataTree: js.UndefOr[Boolean] = js.undefined
  
  /** Show only raw unformatted cell values in the clipboard output. */
  var formatCells: js.UndefOr[Boolean] = js.undefined
  
  var rowGroups: js.UndefOr[Boolean] = js.undefined
}
object AdditionalExportOptions {
  
  inline def apply(): AdditionalExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalExportOptions] (val x: Self) extends AnyVal {
    
    inline def setColumnCalcs(value: Boolean): Self = StObject.set(x, "columnCalcs", value.asInstanceOf[js.Any])
    
    inline def setColumnCalcsUndefined: Self = StObject.set(x, "columnCalcs", js.undefined)
    
    inline def setColumnGroups(value: Boolean): Self = StObject.set(x, "columnGroups", value.asInstanceOf[js.Any])
    
    inline def setColumnGroupsUndefined: Self = StObject.set(x, "columnGroups", js.undefined)
    
    inline def setColumnHeaders(value: Boolean): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
    
    inline def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
    
    inline def setDataTree(value: Boolean): Self = StObject.set(x, "dataTree", value.asInstanceOf[js.Any])
    
    inline def setDataTreeUndefined: Self = StObject.set(x, "dataTree", js.undefined)
    
    inline def setFormatCells(value: Boolean): Self = StObject.set(x, "formatCells", value.asInstanceOf[js.Any])
    
    inline def setFormatCellsUndefined: Self = StObject.set(x, "formatCells", js.undefined)
    
    inline def setRowGroups(value: Boolean): Self = StObject.set(x, "rowGroups", value.asInstanceOf[js.Any])
    
    inline def setRowGroupsUndefined: Self = StObject.set(x, "rowGroups", js.undefined)
  }
}
