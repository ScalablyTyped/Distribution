package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectInfo extends _WSKeys {
  
  /**
    * Filter
    * @default: false
    */
  var autoFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Delete columns
    * @default: false
    */
  var deleteColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Delete rows
    * @default: false
    */
  var deleteRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Format cells
    * @default: false
    */
  var formatCells: js.UndefOr[Boolean] = js.native
  
  /**
    * Format columns
    * @default: false
    */
  var formatColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Format rows
    * @default: false
    */
  var formatRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Insert columns
    * @default: false
    */
  var insertColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Insert hyperlinks
    * @default: false
    */
  var insertHyperlinks: js.UndefOr[Boolean] = js.native
  
  /**
    * Insert rows
    * @default: false
    */
  var insertRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Edit objects
    * @default: true
    */
  var objects: js.UndefOr[Boolean] = js.native
  
  /**
    * The password for formats that support password-protected sheets
    * (XLSX/XLSB/XLS). The writer uses the XOR obfuscation method.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Use PivotTable reports
    * @default: false
    */
  var pivotTables: js.UndefOr[Boolean] = js.native
  
  /**
    * Edit scenarios
    * @default: true
    */
  var scenarios: js.UndefOr[Boolean] = js.native
  
  /**
    * Select locked cells
    * @default: true
    */
  var selectLockedCells: js.UndefOr[Boolean] = js.native
  
  /**
    * Select unlocked cells
    * @default: true
    */
  var selectUnlockedCells: js.UndefOr[Boolean] = js.native
  
  /**
    * Sort
    * @default: false
    */
  var sort: js.UndefOr[Boolean] = js.native
}
object ProtectInfo {
  
  @scala.inline
  def apply(): ProtectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectInfo]
  }
  
  @scala.inline
  implicit class ProtectInfoOps[Self <: ProtectInfo] (val x: Self) extends AnyVal {
    
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
    def setAutoFilter(value: Boolean): Self = this.set("autoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFilter: Self = this.set("autoFilter", js.undefined)
    
    @scala.inline
    def setDeleteColumns(value: Boolean): Self = this.set("deleteColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteColumns: Self = this.set("deleteColumns", js.undefined)
    
    @scala.inline
    def setDeleteRows(value: Boolean): Self = this.set("deleteRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteRows: Self = this.set("deleteRows", js.undefined)
    
    @scala.inline
    def setFormatCells(value: Boolean): Self = this.set("formatCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatCells: Self = this.set("formatCells", js.undefined)
    
    @scala.inline
    def setFormatColumns(value: Boolean): Self = this.set("formatColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatColumns: Self = this.set("formatColumns", js.undefined)
    
    @scala.inline
    def setFormatRows(value: Boolean): Self = this.set("formatRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatRows: Self = this.set("formatRows", js.undefined)
    
    @scala.inline
    def setInsertColumns(value: Boolean): Self = this.set("insertColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertColumns: Self = this.set("insertColumns", js.undefined)
    
    @scala.inline
    def setInsertHyperlinks(value: Boolean): Self = this.set("insertHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertHyperlinks: Self = this.set("insertHyperlinks", js.undefined)
    
    @scala.inline
    def setInsertRows(value: Boolean): Self = this.set("insertRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertRows: Self = this.set("insertRows", js.undefined)
    
    @scala.inline
    def setObjects(value: Boolean): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPivotTables(value: Boolean): Self = this.set("pivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePivotTables: Self = this.set("pivotTables", js.undefined)
    
    @scala.inline
    def setScenarios(value: Boolean): Self = this.set("scenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScenarios: Self = this.set("scenarios", js.undefined)
    
    @scala.inline
    def setSelectLockedCells(value: Boolean): Self = this.set("selectLockedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectLockedCells: Self = this.set("selectLockedCells", js.undefined)
    
    @scala.inline
    def setSelectUnlockedCells(value: Boolean): Self = this.set("selectUnlockedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectUnlockedCells: Self = this.set("selectUnlockedCells", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
