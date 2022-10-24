package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.distTypesCheckboxCheckboxDotdriverMod.CheckboxDriver
import typings.wixStyleReact.distTypesTableDataTableDataTableDotdriverMod.DataTableDriver
import typings.wixStyleReact.wixStyleReactStrings.ALL
import typings.wixStyleReact.wixStyleReactStrings.NONE
import typings.wixStyleReact.wixStyleReactStrings.SOME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableTableDotdriverMod {
  
  @js.native
  trait TableDriver[T]
    extends StObject
       with DataTableDriver {
    
    def clickBulkSelectionCheckbox(): Unit = js.native
    
    /**
      * @deprecated
      */
    def clickRowChecbox(index: Double): Unit = js.native
    
    def clickRowCheckbox(index: Double): Unit = js.native
    
    var element: T = js.native
    
    def getBulkSelectionCheckboxDriver(): CheckboxDriver = js.native
    
    def getBulkSelectionState(): ALL | SOME | NONE = js.native
    
    def getCellTextValue(): String = js.native
    def getCellTextValue(row: Double): String = js.native
    def getCellTextValue(row: Double, column: Double): String = js.native
    def getCellTextValue(row: Unit, column: Double): String = js.native
    
    def getRowCheckboxDriver(index: Double): CheckboxDriver = js.native
    
    def getTitlebar(): HTMLElement = js.native
    
    def isBulkSelectionDisabled(): Boolean = js.native
    
    def isRowSelected(index: Double): Boolean = js.native
    
    def isRowSelectionDisabled(index: Double): Boolean = js.native
  }
}
