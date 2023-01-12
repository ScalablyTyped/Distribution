package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectInfo
  extends StObject
     with _WSKeys {
  
  /**
    * Filter
    * @default: false
    */
  var autoFilter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Delete columns
    * @default: false
    */
  var deleteColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Delete rows
    * @default: false
    */
  var deleteRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format cells
    * @default: false
    */
  var formatCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format columns
    * @default: false
    */
  var formatColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format rows
    * @default: false
    */
  var formatRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Insert columns
    * @default: false
    */
  var insertColumns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Insert hyperlinks
    * @default: false
    */
  var insertHyperlinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Insert rows
    * @default: false
    */
  var insertRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Edit objects
    * @default: true
    */
  var objects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The password for formats that support password-protected sheets
    * (XLSX/XLSB/XLS). The writer uses the XOR obfuscation method.
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * Use PivotTable reports
    * @default: false
    */
  var pivotTables: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Edit scenarios
    * @default: true
    */
  var scenarios: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select locked cells
    * @default: true
    */
  var selectLockedCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Select unlocked cells
    * @default: true
    */
  var selectUnlockedCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sort
    * @default: false
    */
  var sort: js.UndefOr[Boolean] = js.undefined
}
object ProtectInfo {
  
  inline def apply(): ProtectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectInfo] (val x: Self) extends AnyVal {
    
    inline def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    inline def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    inline def setDeleteColumns(value: Boolean): Self = StObject.set(x, "deleteColumns", value.asInstanceOf[js.Any])
    
    inline def setDeleteColumnsUndefined: Self = StObject.set(x, "deleteColumns", js.undefined)
    
    inline def setDeleteRows(value: Boolean): Self = StObject.set(x, "deleteRows", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowsUndefined: Self = StObject.set(x, "deleteRows", js.undefined)
    
    inline def setFormatCells(value: Boolean): Self = StObject.set(x, "formatCells", value.asInstanceOf[js.Any])
    
    inline def setFormatCellsUndefined: Self = StObject.set(x, "formatCells", js.undefined)
    
    inline def setFormatColumns(value: Boolean): Self = StObject.set(x, "formatColumns", value.asInstanceOf[js.Any])
    
    inline def setFormatColumnsUndefined: Self = StObject.set(x, "formatColumns", js.undefined)
    
    inline def setFormatRows(value: Boolean): Self = StObject.set(x, "formatRows", value.asInstanceOf[js.Any])
    
    inline def setFormatRowsUndefined: Self = StObject.set(x, "formatRows", js.undefined)
    
    inline def setInsertColumns(value: Boolean): Self = StObject.set(x, "insertColumns", value.asInstanceOf[js.Any])
    
    inline def setInsertColumnsUndefined: Self = StObject.set(x, "insertColumns", js.undefined)
    
    inline def setInsertHyperlinks(value: Boolean): Self = StObject.set(x, "insertHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setInsertHyperlinksUndefined: Self = StObject.set(x, "insertHyperlinks", js.undefined)
    
    inline def setInsertRows(value: Boolean): Self = StObject.set(x, "insertRows", value.asInstanceOf[js.Any])
    
    inline def setInsertRowsUndefined: Self = StObject.set(x, "insertRows", js.undefined)
    
    inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPivotTables(value: Boolean): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    inline def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    inline def setScenarios(value: Boolean): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    inline def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    inline def setSelectLockedCells(value: Boolean): Self = StObject.set(x, "selectLockedCells", value.asInstanceOf[js.Any])
    
    inline def setSelectLockedCellsUndefined: Self = StObject.set(x, "selectLockedCells", js.undefined)
    
    inline def setSelectUnlockedCells(value: Boolean): Self = StObject.set(x, "selectUnlockedCells", value.asInstanceOf[js.Any])
    
    inline def setSelectUnlockedCellsUndefined: Self = StObject.set(x, "selectUnlockedCells", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
