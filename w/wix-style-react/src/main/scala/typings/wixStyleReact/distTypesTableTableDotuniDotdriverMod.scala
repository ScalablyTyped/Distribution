package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.distTypesCheckboxCheckboxDotuniDotdriverMod.CheckboxUniDriver
import typings.wixStyleReact.distTypesTableDataTableDataTableDotuniDotdriverMod.DataTableDriver
import typings.wixStyleReact.wixStyleReactStrings.ALL
import typings.wixStyleReact.wixStyleReactStrings.NONE
import typings.wixStyleReact.wixStyleReactStrings.SOME
import typings.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableTableDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Table/Table.uni.driver", "tableUniDriverFactory")
  @js.native
  val tableUniDriverFactory: UniDriverFactory[TableUniDriver] = js.native
  
  @js.native
  trait TableUniDriver
    extends StObject
       with DataTableDriver {
    
    def clickBulkSelectionCheckbox(): js.Promise[Unit] = js.native
    
    def clickRowCheckbox(index: Double): js.Promise[Unit] = js.native
    
    def getBulkSelectionCheckboxDriver(): js.Promise[CheckboxUniDriver] = js.native
    
    def getBulkSelectionState(): js.Promise[ALL | SOME | NONE] = js.native
    
    def getCellTextValue(): js.Promise[String] = js.native
    def getCellTextValue(row: Double): js.Promise[String] = js.native
    def getCellTextValue(row: Double, column: Double): js.Promise[String] = js.native
    def getCellTextValue(row: Unit, column: Double): js.Promise[String] = js.native
    
    def getRowCheckboxDriver(index: Double): js.Promise[CheckboxUniDriver] = js.native
    
    def getSelectionTooltipContent(index: Double): js.Promise[String] = js.native
    
    def getTitlebar(): js.Promise[UniDriver[Any] | Null] = js.native
    
    def isBulkSelectionDisabled(): js.Promise[Boolean] = js.native
    
    def isRowSelected(index: Double): js.Promise[Boolean] = js.native
    
    def isRowSelectionDisabled(index: Double): js.Promise[Boolean] = js.native
    
    def isSelectionTooltipEnabled(index: Double): js.Promise[Boolean] = js.native
  }
}
