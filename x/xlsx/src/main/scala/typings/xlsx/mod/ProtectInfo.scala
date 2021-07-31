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
  
  @scala.inline
  def apply(): ProtectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectInfo]
  }
  
  @scala.inline
  implicit class ProtectInfoMutableBuilder[Self <: ProtectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFilter(value: Boolean): Self = StObject.set(x, "autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFilterUndefined: Self = StObject.set(x, "autoFilter", js.undefined)
    
    @scala.inline
    def setDeleteColumns(value: Boolean): Self = StObject.set(x, "deleteColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteColumnsUndefined: Self = StObject.set(x, "deleteColumns", js.undefined)
    
    @scala.inline
    def setDeleteRows(value: Boolean): Self = StObject.set(x, "deleteRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRowsUndefined: Self = StObject.set(x, "deleteRows", js.undefined)
    
    @scala.inline
    def setFormatCells(value: Boolean): Self = StObject.set(x, "formatCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatCellsUndefined: Self = StObject.set(x, "formatCells", js.undefined)
    
    @scala.inline
    def setFormatColumns(value: Boolean): Self = StObject.set(x, "formatColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatColumnsUndefined: Self = StObject.set(x, "formatColumns", js.undefined)
    
    @scala.inline
    def setFormatRows(value: Boolean): Self = StObject.set(x, "formatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatRowsUndefined: Self = StObject.set(x, "formatRows", js.undefined)
    
    @scala.inline
    def setInsertColumns(value: Boolean): Self = StObject.set(x, "insertColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertColumnsUndefined: Self = StObject.set(x, "insertColumns", js.undefined)
    
    @scala.inline
    def setInsertHyperlinks(value: Boolean): Self = StObject.set(x, "insertHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertHyperlinksUndefined: Self = StObject.set(x, "insertHyperlinks", js.undefined)
    
    @scala.inline
    def setInsertRows(value: Boolean): Self = StObject.set(x, "insertRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertRowsUndefined: Self = StObject.set(x, "insertRows", js.undefined)
    
    @scala.inline
    def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPivotTables(value: Boolean): Self = StObject.set(x, "pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotTablesUndefined: Self = StObject.set(x, "pivotTables", js.undefined)
    
    @scala.inline
    def setScenarios(value: Boolean): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenariosUndefined: Self = StObject.set(x, "scenarios", js.undefined)
    
    @scala.inline
    def setSelectLockedCells(value: Boolean): Self = StObject.set(x, "selectLockedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectLockedCellsUndefined: Self = StObject.set(x, "selectLockedCells", js.undefined)
    
    @scala.inline
    def setSelectUnlockedCells(value: Boolean): Self = StObject.set(x, "selectUnlockedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUnlockedCellsUndefined: Self = StObject.set(x, "selectUnlockedCells", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
