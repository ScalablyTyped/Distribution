package typings.wixStyleReact

import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.std.CSSStyleDeclaration
import typings.std.HTMLElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.NodeListOf
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableDriverMod {
  
  @js.native
  trait DataTableDriver
    extends StObject
       with BaseDriver {
    
    def clickRow(index: Double): Unit = js.native
    def clickRow(index: Double, eventData: SyntheticEventData): Unit = js.native
    
    def clickSort(index: Double): Unit = js.native
    def clickSort(index: Double, eventData: SyntheticEventData): Unit = js.native
    
    def getCell(rowIndex: Double, cellIndex: Double): HTMLTableDataCellElement = js.native
    
    def getCellStyle(rowIndex: Double, colIndex: Double): CSSStyleDeclaration = js.native
    
    def getCellWidth(rowIndex: Double, colIndex: Double): String | Null = js.native
    
    def getHeaderCell(index: Double): HTMLTableHeaderCellElement = js.native
    
    def getHeaderCellStyle(index: Double): CSSStyleDeclaration = js.native
    
    def getHeaderCellWidth(index: Double): String | Null = js.native
    
    def getRow(rowIndex: Double): js.UndefOr[HTMLTableRowElement] = js.native
    
    def getRowClasses(index: Double): js.Array[String] = js.native
    
    def getRowDetails(index: Double): HTMLTableDataCellElement = js.native
    
    def getRowDetailsText(index: Double): String = js.native
    
    def getRowText(index: Double): js.Array[String] = js.native
    
    def getRowWithDataHook(dataHookName: String): HTMLElement = js.native
    
    def getRowsCount(): Double = js.native
    
    def getRowsWithClassCount(className: String): Double = js.native
    
    def getRowsWithDataHook(dataHookName: String): NodeListOf[HTMLElement] = js.native
    
    def getTitles(): js.Array[String] = js.native
    
    def hasChildWithId(id: String): Boolean = js.native
    
    def hasInfoIcon(index: Double): Boolean = js.native
    
    def hasRowDetails(index: Double): Double = js.native
    
    def hasSortDescending(index: Double): Boolean = js.native
    
    def hasSortableTitle(index: Double): Boolean = js.native
    
    def isDisplayingHeader(): Boolean = js.native
    
    def isDisplayingHeaderOnly(): Boolean = js.native
    
    def isDisplayingNothing(): Boolean = js.native
    
    def isRowAnimated(index: Double): Boolean = js.native
    
    def isRowClickable(index: Double): Boolean = js.native
    
    def mouseEnterRow(index: Double): Unit = js.native
    def mouseEnterRow(index: Double, eventData: SyntheticEventData): Unit = js.native
    
    def mouseLeaveRow(index: Double): Unit = js.native
    def mouseLeaveRow(index: Double, eventData: SyntheticEventData): Unit = js.native
  }
}
