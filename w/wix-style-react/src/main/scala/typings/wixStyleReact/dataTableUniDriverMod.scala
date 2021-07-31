package typings.wixStyleReact

import typings.reactDom.testUtilsMod.SyntheticEventData
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableUniDriverMod {
  
  @js.native
  trait DataTableDriver
    extends StObject
       with BaseUniDriver {
    
    def clickRow(index: Double): js.Promise[Unit] = js.native
    def clickRow(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
    
    def clickSort(index: Double): js.Promise[Unit] = js.native
    def clickSort(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
    
    def getCell(rowIndex: Double, cellIndex: Double): js.Promise[js.Any] = js.native
    
    def getCellStyle(rowIndex: Double, colIndex: Double): js.Promise[String | Null] = js.native
    
    def getCellWidth(rowIndex: Double, colIndex: Double): js.Promise[String | Null] = js.native
    
    def getHeaderCell(index: Double): js.Promise[js.Any] = js.native
    
    def getHeaderCellStyle(index: Double): js.Promise[String | Null] = js.native
    
    def getHeaderCellWidth(index: Double): js.Promise[String | Null] = js.native
    
    def getRow(rowIndex: Double): UniDriver[js.Any] = js.native
    
    def getRowClasses(index: Double): js.Promise[js.Array[String]] = js.native
    
    def getRowDetails(index: Double): js.Promise[js.Any] = js.native
    
    def getRowDetailsText(index: Double): js.Promise[String] = js.native
    
    def getRowText(index: Double): js.Promise[js.Array[String]] = js.native
    
    def getRowWithDataHook(dataHookName: String): js.Promise[js.Any] = js.native
    
    def getRowsCount(): js.Promise[Double] = js.native
    
    def getRowsWithClassCount(className: String): js.Promise[Double] = js.native
    
    def getRowsWithDataHook(dataHookName: String): js.Promise[js.Array[js.Any]] = js.native
    
    def getTitles(): js.Promise[js.Array[String]] = js.native
    
    def hasChildWithId(id: String): js.Promise[Boolean] = js.native
    
    def hasInfoIcon(index: Double): js.Promise[Boolean] = js.native
    
    def hasRowDetails(index: Double): js.Promise[Double] = js.native
    
    def hasSortDescending(index: Double): js.Promise[Boolean] = js.native
    
    def hasSortableTitle(index: Double): js.Promise[Boolean] = js.native
    
    def isDisplayingHeader(): js.Promise[Boolean] = js.native
    
    def isDisplayingHeaderOnly(): js.Promise[Boolean] = js.native
    
    def isDisplayingNothing(): js.Promise[Boolean] = js.native
    
    def isRowAnimated(index: Double): js.Promise[Boolean] = js.native
    
    def isRowClickable(index: Double): js.Promise[Boolean] = js.native
    
    def mouseEnterRow(index: Double): js.Promise[Unit] = js.native
    def mouseEnterRow(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
    
    def mouseLeaveRow(index: Double): js.Promise[Unit] = js.native
    def mouseLeaveRow(index: Double, eventData: SyntheticEventData): js.Promise[Unit] = js.native
  }
}
